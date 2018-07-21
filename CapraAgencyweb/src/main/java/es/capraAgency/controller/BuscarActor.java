package es.capraAgency.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import es.capraAgency.domain.Actor;
import es.capraAgency.service.ActorService;

@Controller
public class BuscarActor {
	@Autowired
	ActorService actService;
	
	@RequestMapping("buscar")
	public ModelAndView buscar(HttpServletRequest request, HttpServletResponse response) 
			throws IOException {
		
		ModelAndView mv= new ModelAndView();

		System.out.println("recuperando");
		try {
			List<Actor> listaActores = actService.BuscarActores();
			mv.addObject("listaActores", listaActores);
			System.out.println("recuperados");

		}catch (Exception e){
			System.out.println(e);
		}
		mv.setViewName("tablaActores.jsp");
		return mv; 
	}
}
