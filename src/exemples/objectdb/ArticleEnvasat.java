/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemples.objectdb;



/**
 * Classe que representa un article que es serveix en envas
 * @author professor
 */

public class ArticleEnvasat extends Article {
    private Envas envas;

    /**
     * Constructor per defecte
     */
    public ArticleEnvasat() {
    }

    
    /**
     * Constructor que assigna les propietats
     * @param id identificador de l'article
     * @param descripcio descripcio de l'article
     * @param marca marca de l'article; si no en te, val null
     * @param preu preu de l'article
     * @param estoc estoc actual de l'article
     * @param estocMinim estoc minim de l'article; si l'estoc n'esta per sota, caldria fer-ne una comanda
     * @param envas envas en el qual es serveix l'article
     */
    public ArticleEnvasat(String id, String descripcio, String marca, double preu, double estoc, double estocMinim, Envas envas){
                super(id, descripcio, marca, preu, estoc, estocMinim);
        this.envas = envas;
    }

    @Override
    public String toString() {
        return envas.toString() + " de " + super.toString();
    }

    /**
     * Obtenir l'envas en que es serveix l'article
     * @return l'envas
     */
    public Envas getEnvas() {
        return envas;
    }

    /**
     * Modificar l'envas en que es serveix l'article
     * @param envas envas a assignar a l'article
     */
    public void setEnvas(Envas envas) {
        this.envas = envas;
    }
}