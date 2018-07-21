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
@Table (name="deportes")
public class Deportes {
	
	//Attributes, corresponents a la taula "deportes"
	@Id
	@GeneratedValue
	@Column
	private int deporte_id;
	
	@Column
	private String deporte;
	
	@ManyToMany(cascade = {CascadeType.ALL}, mappedBy="deportes")
	private Set<Trabajador> trabajadores = new HashSet<Trabajador>();

	
	//Getters y Setters
	public int getDeporte_id() {
		return deporte_id;
	}

	public void setDeporte_id(int deporte_id) {
		this.deporte_id = deporte_id;
	}

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
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
		result = prime * result + ((deporte == null) ? 0 : deporte.hashCode());
		result = prime * result + deporte_id;
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
		Deportes other = (Deportes) obj;
		if (deporte == null) {
			if (other.deporte != null)
				return false;
		} else if (!deporte.equals(other.deporte))
			return false;
		if (deporte_id != other.deporte_id)
			return false;
		if (trabajadores == null) {
			if (other.trabajadores != null)
				return false;
		} else if (!trabajadores.equals(other.trabajadores))
			return false;
		return true;
	}

	
	//toString
	@Override
	public String toString() {
		return "Deportes [deporte_id=" + deporte_id + ", deporte=" + deporte + ", trabajadores=" + trabajadores + "]";
	}
	
	
	
	
	
	


}
