package es.capraAgency.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="imagenes")
public class Imagenes {
	
	//Attributes, corresponents a la taula "imagenes"
	@Id
	@GeneratedValue
	@Column
	private int imagen_id;
	@Column
	private String imagen;
	
	@ManyToOne
	@JoinColumn(name="trabajador_id")
	private Trabajador trabajador;
	


}
