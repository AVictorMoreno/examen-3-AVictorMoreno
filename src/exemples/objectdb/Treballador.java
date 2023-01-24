/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemples.objectdb;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author ausias
 */
@Entity
public class Treballador implements Serializable {
	
	@Id
	private String nom;
	private String telefon;
        @ManyToOne
	private Carrec carrec;

	//constructors
     public Treballador () {
    	 
     }
	
	
	public Treballador(String nom, String telefon) {
		this.nom = nom;
		this.telefon = telefon;
	}
	
	public Treballador(String nom, String telefon, Carrec carrec) {
		this.nom = nom;
		this.telefon = telefon;
		this.carrec = carrec;
	}

	//Getters i setters
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	

	@Override
	public String toString() {
		return "Treballador [nom=" + nom + ", telefon=" + telefon + ", carrec=" + carrec + "]";
	}
}
