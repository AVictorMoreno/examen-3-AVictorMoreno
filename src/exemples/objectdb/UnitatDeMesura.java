/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemples.objectdb;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import javax.persistence.Entity;

/**
 * Classe que representa una unitat de mesura
 * Cada objecte s'identifica pel simbol o abreviacio
 * @author professor
 */
@Entity
public class UnitatDeMesura implements Serializable {
    private static final long serialVersionUID = 1L;
    private String simbol=null;
    private String descripcio=null;

    /**
     * Constructor per defecte
     */
    public UnitatDeMesura() {
    }

    /**
     * Constructor que assigna l'identificador a la unitat de mesura
     * @param abreviacio simbol amb que s'identifica la unitat de mesura.
     */
    public UnitatDeMesura(String abreviacio) {
        this.simbol = abreviacio;
    }

    /**
     * Constructor que assigna l'identificador a la unitat de mesura
     * @param abreviacio simbol amb que s'identifica la unitat de mesura.
     * @param descripcio descripcio de la unitat de mesura
     */    
    public UnitatDeMesura(String abreviacio, String descripcio) {
        this.simbol = abreviacio;
        this.descripcio = descripcio;
    }
    
    @Override
    public String toString() {
        return getSimbol() + "(" +getDescripcio()+")";
    }

    /**
     * Obtenir el simbol o abreviacio que identifica la unitat de mesura
     * @return  simbol o abreviacio que identifica la unitat de mesura
     */
    public String getSimbol() {
        return simbol;
    }

    /**
     * Modificar el simbol o abreviacio que identifica la unitat de mesura
     * @param abreviacio  simbol o abreviacio que s'assignara a la unitat de mesura
     */
    public void setSimbol(String abreviacio) {
        this.simbol = abreviacio;
    }

    /**
     * Obtenir la descripcio de la unitat de mesura
     * @return descripcio de la unitat de mesura
     */
    public String getDescripcio() {
        return descripcio;
    }

    /**
     * Modificar la descripcio de la unitat de mesura
     * @param descripcio descripcio que s'assignara a la unitat de mesura
     */
    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }
    
}