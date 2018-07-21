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
@Table (name="piercings")
public class Piercing {
	//Attributes, corresponents a la taula "piercings"
	@Id
	@GeneratedValue
	@Column
	private int piercing_id;
	
	@Column
	private String posicionPiercing;
	
	@ManyToMany(cascade = {CascadeType.ALL}, mappedBy="piercings")
	private Set<Trabajador> trabajadores = new HashSet<Trabajador>();

}
