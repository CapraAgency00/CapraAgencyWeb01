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
@Table (name="disponibilidad")
public class Disponibilidad {
	//Attributes, corresponents a la taula "disponibilidad"
	@Id
	@GeneratedValue
	@Column
	private int disponibilidad_id;
	
	@Column
	private String disponibilidad;
	
	@ManyToMany(cascade = {CascadeType.ALL}, mappedBy="disponibilidad")
	private Set<Trabajador> trabajadores = new HashSet<Trabajador>();

	
	//Getters y Setters
	public int getDisponibilidad_id() {
		return disponibilidad_id;
	}

	public void setDisponibilidad_id(int disponibilidad_id) {
		this.disponibilidad_id = disponibilidad_id;
	}

	public String getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public Set<Trabajador> getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(Set<Trabajador> trabajadores) {
		this.trabajadores = trabajadores;
	}

	
	//HashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((disponibilidad == null) ? 0 : disponibilidad.hashCode());
		result = prime * result + disponibilidad_id;
		result = prime * result + ((trabajadores == null) ? 0 : trabajadores.hashCode());
		return result;
	}

	
	//Equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disponibilidad other = (Disponibilidad) obj;
		if (disponibilidad == null) {
			if (other.disponibilidad != null)
				return false;
		} else if (!disponibilidad.equals(other.disponibilidad))
			return false;
		if (disponibilidad_id != other.disponibilidad_id)
			return false;
		if (trabajadores == null) {
			if (other.trabajadores != null)
				return false;
		} else if (!trabajadores.equals(other.trabajadores))
			return false;
		return true;
	}
	
	

	
	
}
