package es.capraAgency.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.capraAgency.domain.Actor;

@Repository
public class ActorDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
//	@Autowired
//	EntityManagerFactory entityManagerFactory;
//	

	@Transactional
	public void InsertarActor(Actor a1) throws Exception{
		try{
//			EntityManager entityManager = entityManagerFactory.createEntityManager();
			System.out.println("entro a dao");
			entityManager.merge(a1);
			System.out.println("insertado correctamente");
		}catch(Exception e) {
			System.out.println("error: " + e.getMessage());
			throw e;
		}
	}
	public List<Actor> BuscarActores() throws Exception{
		try {		

		Query query = entityManager.createNamedQuery("recuperarTodos");
		
		List<Actor> listaActores= query.getResultList();
		System.out.println(listaActores);
		System.out.println("recuperados");
		System.out.println("encontrados correctamente");

		return listaActores;
		}catch(Exception e) {
			System.out.println("error: " + e.getMessage());
			throw e;
		}
	}
//	public List<Actor> BuscarActores(String ulls, String cabell,
//			int edatMin, int edatMax, int altMin, int altMax) throws Exception{
//		try {		
//		Query query = entityManager.createNamedQuery("recuperarAvanzado");
//		
//		List<Actor> listaActores= query.getResultList();
//		
//		return listaActores;
//		
//		}catch(Exception e) {
//			System.out.println("error: " + e.getMessage());
//			throw e;
//		}
//	}
	
	
	
}
