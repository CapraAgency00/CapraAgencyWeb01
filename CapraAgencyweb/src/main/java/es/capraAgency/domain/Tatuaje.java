package es.capraAgency.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table (name="tatuajes")
public class Tatuaje {
	//Attributes, corresponents a la taula "tatuajes"
	@Id
	@GeneratedValue
	@Column
	private int tatuaje_id;
	
	@Column
	private String posicionTatuaje;
	
	@ManyToMany(cascade = {CascadeType.ALL}, mappedBy="tatuajes")
	private Set<Trabajador> trabajadores = new HashSet<Trabajador>();

}
