package es.capraAgency.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table (name="actor")
//@NamedQueries(value = {
//	@NamedQuery (name = "recuperarTodos", query = "FROM Actor"),
//	@NamedQuery(name = "recuperarAvanzado", query = "FROM Actor actor where actor.ulls=:ulls "
//		+ "and actor.cabell=:cabell and actor.edat>=:edatMin and actor.edat<=:edatMax"
//		+ " and actor.altura<=:alturaMin and actor.altura<=:alturaMax")
//	})
public class Actor {
	
	//Attributes, corresponents a la taula "actor"
	@Id
	@GeneratedValue
	@Column
	private int actor_id;
	@Column
	private String nom;
	@Column
	private String ulls;
	@Column
	private String cabell;
	@Column
	private int edat;
	@Column
	private int altura;
	@Column
	private String telf;
	@Column
	private String email;
	//Attributes, corresponents a la taula "actor"

	
	//Getters i Setters
	public int getActor_id() {
		return actor_id;
	}
	public void setActor_id(int actor_id) {
		this.actor_id = actor_id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getUlls() {
		return ulls;
	}
	public void setUlls(String ulls) {
		this.ulls = ulls;
	}
	public String getCabell() {
		return cabell;
	}
	public void setCabell(String cabell) {
		this.cabell = cabell;
	}
	public int getEdat() {
		return edat;
	}
	public void setEdat(int edat) {
		this.edat = edat;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public String getTelf() {
		return telf;
	}
	public void setTelf(String telf) {
		this.telf = telf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//Getters i Setters

	
	//ToString
	@Override
	public String toString() {
		return "Actor [actor_id=" + actor_id + ", nom=" + nom + ", ulls=" + ulls + ", cabell=" + cabell + ", edat="
				+ edat + ", altura=" + altura + ", telf=" + telf + ", email=" + email + "]";
	}
	//ToString

}
