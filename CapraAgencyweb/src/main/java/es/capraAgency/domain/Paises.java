package es.capraAgency.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="paises")
public class Paises {
	//Attributes, corresponents a la taula "paises"
	@Id
	@GeneratedValue
	@Column
	private int pais_id;
	
	@Column
	private String pais;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="trabajador_id")
	private Set<Trabajador> trabajadores = new HashSet<Trabajador>();



}
