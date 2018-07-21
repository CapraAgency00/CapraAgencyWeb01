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
@Table (name="disciplinasArtisticas")
public class DisciplinasArtisticas {
	//Attributes, corresponents a la taula "disciplinasArtisticas"
	@Id
	@GeneratedValue
	@Column
	private int disciplinaArtistica_id;
	
	@Column
	private String disciplinaArtistica;
	
	@ManyToMany(cascade = {CascadeType.ALL}, mappedBy="disciplinasArtisticas")
	private Set<Trabajador> trabajadores = new HashSet<Trabajador>();

	
	//Getters y Setters
	public int getDisciplinaArtistica_id() {
		return disciplinaArtistica_id;
	}

	public void setDisciplinaArtistica_id(int disciplinaArtistica_id) {
		this.disciplinaArtistica_id = disciplinaArtistica_id;
	}

	public String getDisciplinaArtistica() {
		return disciplinaArtistica;
	}

	public void setDisciplinaArtistica(String disciplinaArtistica) {
		this.disciplinaArtistica = disciplinaArtistica;
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
		result = prime * result + ((disciplinaArtistica == null) ? 0 : disciplinaArtistica.hashCode());
		result = prime * result + disciplinaArtistica_id;
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
		DisciplinasArtisticas other = (DisciplinasArtisticas) obj;
		if (disciplinaArtistica == null) {
			if (other.disciplinaArtistica != null)
				return false;
		} else if (!disciplinaArtistica.equals(other.disciplinaArtistica))
			return false;
		if (disciplinaArtistica_id != other.disciplinaArtistica_id)
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
		return "DisciplinasArtisticas [disciplinaArtistica_id=" + disciplinaArtistica_id + ", disciplinaArtistica="
				+ disciplinaArtistica + ", trabajadores=" + trabajadores + "]";
	}
	
}

