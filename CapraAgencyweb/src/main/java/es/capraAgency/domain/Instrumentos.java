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
@Table (name="instrumentos")
public class Instrumentos {
	
	//Attributes, corresponents a la taula "actor"
	@Id
	@GeneratedValue
	@Column
	private int instrumento_id;
	
	@Column
	private String instrumento;

	@ManyToMany(cascade = {CascadeType.ALL}, mappedBy="instrumentos")
	private Set<Trabajador> trabajadores = new HashSet<Trabajador>();

	

}
