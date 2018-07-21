package es.capraAgency.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.capraAgency.dao.ActorDAO;
import es.capraAgency.domain.Actor;

@Service
public class ActorService {
	@Autowired
	private ActorDAO actorDAO;
	
	public void InsertarActor (Actor a1) throws Exception{
			System.out.println("entro a actservice");
			actorDAO.InsertarActor(a1);
	}

	public List<Actor> BuscarActores() throws Exception{
		try{
			List<Actor> listaActores = actorDAO.BuscarActores();
			System.out.println("encontrados");
			return listaActores;
		}catch(Exception e) {
			throw e;
		}
		
	}


}
