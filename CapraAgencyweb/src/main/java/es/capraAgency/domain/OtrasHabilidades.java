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
@Table (name="otrasHabilidades")
public class OtrasHabilidades {
		
		//Attributes, corresponents a la taula "otrasHabilidades"
		@Id
		@GeneratedValue
		@Column
		private int habilidad_id;
		
		@Column
		private String habilidad;
		
		@ManyToMany(cascade = {CascadeType.ALL}, mappedBy="otrasHabilidades")
		private Set<Trabajador> trabajadores = new HashSet<Trabajador>();

}
