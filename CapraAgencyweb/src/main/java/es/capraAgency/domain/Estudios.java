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
@Table (name="estudios")
public class Estudios {
	
	//Attributes, corresponents a la taula "estudios"
	@Id
	@GeneratedValue
	@Column
	private int estudio_id;

	@Column
	private String estudio;
	
	@ManyToMany(cascade = {CascadeType.ALL}, mappedBy="estudios")
	private Set<Trabajador> trabajadores = new HashSet<Trabajador>();

	
	//Getters y Setters
	public int getEstudio_id() {
		return estudio_id;
	}

	public void setEstudio_id(int estudio_id) {
		this.estudio_id = estudio_id;
	}

	public String getEstudio() {
		return estudio;
	}

	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}

	public Set<Trabajador> getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(Set<Trabajador> trabajadores) {
		this.trabajadores = trabajadores;
	}

	
	//Hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estudio == null) ? 0 : estudio.hashCode());
		result = prime * result + estudio_id;
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
		Estudios other = (Estudios) obj;
		if (estudio == null) {
			if (other.estudio != null)
				return false;
		} else if (!estudio.equals(other.estudio))
			return false;
		if (estudio_id != other.estudio_id)
			return false;
		if (trabajadores == null) {
			if (other.trabajadores != null)
				return false;
		} else if (!trabajadores.equals(other.trabajadores))
			return false;
		return true;
	}

}
