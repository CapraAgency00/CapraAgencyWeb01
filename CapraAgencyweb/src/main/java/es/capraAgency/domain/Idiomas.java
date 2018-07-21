package es.capraAgency.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table (name="idiomas")
public class Idiomas {
	
	//Attributes, corresponents a la taula "idiomas"
	@Id
	@GeneratedValue
	@Column
	private int instrumento_id;
	
	@Column
	private String instrumento;
	
	@ManyToMany(cascade = {CascadeType.ALL}, mappedBy="idiomas")
	private Set<Trabajador> trabajadores = new HashSet<Trabajador>();



}
