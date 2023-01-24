/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemples.objectdb;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author ausias
 */
@Entity
public class Carrec implements Serializable {
	
        @Id
	private int codi;
	private String nomCarrec;
	private int any;
	
        @OneToMany(mappedBy = "carrec")
        private List<Treballador> treballadors;
        
	//constructor
	public Carrec(int codi, String nomCarrec, int any) {
		this.codi = codi;
		this.nomCarrec = nomCarrec;
		this.any = any;
	}

	//Getters i setters
	public int getCodi() {
		return codi;
	}
	public void setCodi(int codi) {
		this.codi = codi;
	}
	public String getNomCarrec() {
		return nomCarrec;
	}
	public void setNomCarrec(String nomCarrec) {
		this.nomCarrec = nomCarrec;
	}
	public int getAny() {
		return any;
	}
	public void setAny(int any) {
		this.any = any;
	}

	
	@Override
	public String toString() {
		return "[codi= " + codi + ", nomCarrec= " + nomCarrec + ", any= " + any + "]";
	}
}
