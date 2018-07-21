package es.capraAgency.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="ciudades")
public class Ciudades {
	//Attributes, corresponents a la taula "ciudades"
	@Id
	@GeneratedValue
	@Column
	private int ciudad_id;
	
	@Column
	private String ciudad;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="trabajador_id")
	private Set<Trabajador> trabajadores = new HashSet<Trabajador>();

	
	//Getters y Setters
	public int getCiudad_id() {
		return ciudad_id;
	}

	public void setCiudad_id(int ciudad_id) {
		this.ciudad_id = ciudad_id;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
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
		result = prime * result + ((ciudad == null) ? 0 : ciudad.hashCode());
		result = prime * result + ciudad_id;
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
		Ciudades other = (Ciudades) obj;
		if (ciudad == null) {
			if (other.ciudad != null)
				return false;
		} else if (!ciudad.equals(other.ciudad))
			return false;
		if (ciudad_id != other.ciudad_id)
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
		return "Ciudades [ciudad_id=" + ciudad_id + ", ciudad=" + ciudad + ", trabajadores=" + trabajadores + "]";
	}
	
	

	
}
