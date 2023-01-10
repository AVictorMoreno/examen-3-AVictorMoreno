/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemples.objectdb;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 * Classe que proporciona mètodes per a gestionar la persistencia dels diferents objectes
 * @author professor
 */
public class GestorObjectDB implements Serializable {
    private EntityManager em = null;

    /**
     * Crea un GestorObjectDB amb un EntityManager.
     * @param em EntityManager amb el qual treballarà el gestor. Ha d'estar obert.
     */
    public GestorObjectDB (EntityManager em) {
        this.em = em;
    }

    /**
     * Insereix un article
     * @param article article a inserir
     */

    public void inserir(Article article) {
        em.getTransaction().begin();
        em.persist(article);
        em.getTransaction().commit();
    }

    /**
     * Insereix un envas
     * @param envas envas a inserir
     */
    public void inserir(Envas envas) {
        em.getTransaction().begin();
        em.persist(envas);
        em.getTransaction().commit();
    }

    /**
     * Insereix una unitat de mesura
     * @param unitatDeMesura unitat de mesura a inserir
     */

    public void inserir(UnitatDeMesura unitatDeMesura) {
        em.getTransaction().begin();
        em.persist(unitatDeMesura);
        em.getTransaction().commit();
    }


    /**
     * Obté tots els articles 
     * @return llista de tots els articles 
     */
    public List<Article> totsArticles(){

        Query q = em.createQuery("select art from Article art");
        
        return q.getResultList(); //cal canviar el valor de retorn
    }

    /**
     * Obté tots els articles envasats amb un envas d'un tipus determinat
     * @param tipus identificador del tipus d'envas dels articles que es retornen
     * @return  llista dels articles envasats amb l'envas del un tipus donat
     */
    public List<ArticleEnvasat> articlesEnvasatsAmb(String tipus){
        
      
    TypedQuery<ArticleEnvasat> query = em.createQuery(
        "SELECT a FROM ArticleAGranel a WHERE a.unitat.simbol = :unitat", ArticleEnvasat.class);
    return query.setParameter("unitat", tipus).getSingleResult();
      
    }

    /**
     * Obté tots els articles a granel que es mesuren amb una unitat de mesura determinada
     * @param abreviacio simbol que identifica la unitat de mesura utilitzada amb la qual es mesuren els articles
     * @return  llista dels articles a granel que es mesuren amb la unitat de mesura donada
     */
    public List<ArticleAGranel> articlesMesuratsEn(String abreviacio){
        return null; //cal canviar el valor de retorn
    }

}
