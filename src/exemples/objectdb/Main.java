/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemples.objectdb;

/**
 *
 * @author ausias
 */
import javax.persistence.*;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("examen3.odb");
        EntityManager em = emf.createEntityManager();

        // Iniciar una transacció
        em.getTransaction().begin();

        // Crear tres cargos
        Carrec carrec1 = new Carrec(1, "Gerent", 2020);
        Carrec carrec2 = new Carrec(2, "Analista", 2019);
        Carrec carrec3 = new Carrec(3, "Programador", 2018);
        
        // Crear tres trabajadores y asociarlos a los cargos anteriores
        Treballador trabajador1 = new Treballador("Victor", "555-555-555", carrec1);
        Treballador trabajador2 = new Treballador("Angela", "555-555-556", carrec2);
        Treballador trabajador3 = new Treballador("Jofre", "555-555-557", carrec3);

        // Persistir los cargos y trabajadores en la BD
        em.persist(carrec1);
        em.persist(carrec2);
        em.persist(carrec3);
        em.persist(trabajador1);
        em.persist(trabajador2);
        em.persist(trabajador3);

        // Finalizar transacció
        em.getTransaction().commit();

        // Cerrar el EntitatManager
        em.close();
        emf.close();
    }
}

