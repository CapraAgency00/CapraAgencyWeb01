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
@Table (name="agencias")
public class Agencias {
	//Attributes, corresponents a la taula "agencias"
	@Id
	@GeneratedValue
	@Column
	private int agencia_id;
	
	@Column
	private String agencia;
	
	@ManyToMany(cascade = {CascadeType.ALL}, mappedBy="otrasAgencias")
	private Set<Trabajador> trabajadores = new HashSet<Trabajador>();

	
	//Getters y Setters
	public int getAgencia_id() {
		return agencia_id;
	}

	public void setAgencia_id(int agencia_id) {
		this.agencia_id = agencia_id;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
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
		result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
		result = prime * result + agencia_id;
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
		Agencias other = (Agencias) obj;
		if (agencia == null) {
			if (other.agencia != null)
				return false;
		} else if (!agencia.equals(other.agencia))
			return false;
		if (agencia_id != other.agencia_id)
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
		return "Agencias [agencia_id=" + agencia_id + ", agencia=" + agencia + ", trabajadores=" + trabajadores + "]";
	}
	
	



}
