package es.capraAgency.domain;

import java.text.DateFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="trabajador")
//@NamedQueries(value = {
//	@NamedQuery (name = "recuperarTodos", query = "FROM Actor"),
//	@NamedQuery(name = "recuperarAvanzado", query = "FROM Actor actor where actor.ulls=:ulls "
//		+ "and actor.cabell=:cabell and actor.edat>=:edatMin and actor.edat<=:edatMax"
//		+ " and actor.altura<=:alturaMin and actor.altura<=:alturaMax")
//	})
public class Trabajador {
	
	
	//Attributes, corresponents a la taula "trabajador"
	@Id
	@GeneratedValue
	@Column
	private int trabajador_id;
	@Column
	private String nombre;
	@Column
	private String apellidos;
	@Column
	private String fechaNacimiento;
	@Column
	private String direccion;
	@Column
	private String codigoPostal;
	@Column
	private String agenciaMadre;
	@Column
	private String dni;
	@Column
	private String seguridadSocial;
	@Column
	private String telfMovil;
	@Column
	private String telfFijo;
	@Column
	private String mail;
	@Column
	private String trabajo;
	@Column
	private Boolean interpretacion;
	@Column
	private String talla;
	@Column
	private String medidas;
	@Column
	private String peso;
	@Column
	private String etnia;
	@Column
	private String pelo;
	@Column
	private String ojos;
	@Column
	private String sexo;
	@Column
	private String danza;
	@Column
	private String carneConducir;
	@Column
	private String vehiculoPropio;
	@Column
	private Boolean viajarExtranjero;
	
	
	
	
	@ManyToMany(cascade= {CascadeType.ALL})
	@JoinTable(name="trabajadorDeportes", joinColumns={@JoinColumn(name="trabajador_id")}, inverseJoinColumns={@JoinColumn(name="deporte_id")})
	private Set<Deportes> deportes = new HashSet<Deportes>();
	
	@ManyToMany(cascade= {CascadeType.ALL})
	@JoinTable(name="trabajadorInstrumentos", joinColumns={@JoinColumn(name="trabajador_id")}, inverseJoinColumns={@JoinColumn(name="instrumento_id")})
	private Set<Instrumentos> instrumentos = new HashSet<Instrumentos>();
	
	@ManyToMany(cascade= {CascadeType.ALL})
	@JoinTable(name="trabajadorHabilidades", joinColumns={@JoinColumn(name="trabajador_id")}, inverseJoinColumns={@JoinColumn(name="habilidad_id")})
	private Set<OtrasHabilidades> otrasHabilidades = new HashSet<OtrasHabilidades>();
	
	@ManyToMany(cascade= {CascadeType.ALL})
	@JoinTable(name="trabajadorTatuajes", joinColumns={@JoinColumn(name="trabajador_id")}, inverseJoinColumns={@JoinColumn(name="tatuaje_id")})
	private Set<Tatuaje> tatuajes = new HashSet<Tatuaje>();
	
	@ManyToMany(cascade= {CascadeType.ALL})
	@JoinTable(name="trabajadorPiercings", joinColumns={@JoinColumn(name="trabajador_id")}, inverseJoinColumns={@JoinColumn(name="piercing_id")})
	private Set<Piercing> piercings = new HashSet<Piercing>();
	
	@ManyToMany(cascade= {CascadeType.ALL})
	@JoinTable(name="trabajadorDisciplinasArtisticas", joinColumns={@JoinColumn(name="trabajador_id")}, inverseJoinColumns={@JoinColumn(name="disciplina_id")})
	private Set<DisciplinasArtisticas> disciplinasArtisticas = new HashSet<DisciplinasArtisticas>();
	
	@ManyToMany(cascade= {CascadeType.ALL})
	@JoinTable(name="trabajadorDisponibilidad", joinColumns={@JoinColumn(name="trabajador_id")}, inverseJoinColumns={@JoinColumn(name="disponibilidad_id")})
	private Set<Disponibilidad> disponibilidad = new HashSet<Disponibilidad>();
	
	@ManyToMany(cascade= {CascadeType.ALL})
	@JoinTable(name="trabajadorIdiomas", joinColumns={@JoinColumn(name="trabajador_id")}, inverseJoinColumns={@JoinColumn(name="idioma_id")})
	private Set<Idiomas> idiomas = new HashSet<Idiomas>();
	
	@ManyToMany(cascade= {CascadeType.ALL})
	@JoinTable(name="trabajadorEstudios", joinColumns={@JoinColumn(name="trabajador_id")}, inverseJoinColumns={@JoinColumn(name="estudio_id")})
	private Set<Estudios> estudios = new HashSet<Estudios>();
	
	@ManyToMany(cascade= {CascadeType.ALL})
	@JoinTable(name="trabajadorInstrumentos", joinColumns={@JoinColumn(name="trabajador_id")}, inverseJoinColumns={@JoinColumn(name="instrumento_id")})
	private Set<Agencias> otrasAgencias = new HashSet<Agencias>();
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="imagen_id")
	private Set<Imagenes> imagenes = new HashSet<Imagenes>();
	
	@ManyToOne
	@JoinColumn(name = "ciudad_id")
	private Ciudades ciudad;
	
	@ManyToOne
	@JoinColumn(name = "pais_id")
	private Paises pais;

	//Attributes, corresponents a la taula "trabajador"

	

}
