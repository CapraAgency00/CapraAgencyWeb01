package es.capraAgency.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import es.capraAgency.domain.Actor;
import es.capraAgency.service.ActorService;

@Controller
public class InsertActor {
	@Autowired
	ActorService actService;
	
	@RequestMapping("insert")
	public ModelAndView insertar(HttpServletRequest request, HttpServletResponse response) 
			throws IOException {
		ModelAndView mv= new ModelAndView();
		Actor a1 = new Actor();
		a1.setNom((String)request.getParameter("nom"));
		a1.setAltura(Integer.parseInt(request.getParameter("altura")));
		a1.setCabell((String)request.getParameter("cabell"));
		a1.setEdat(Integer.parseInt(request.getParameter("edat")));
		a1.setEmail((String)request.getParameter("email"));
		a1.setTelf((String)request.getParameter("telf"));
		a1.setUlls((String) request.getParameter("ulls"));

		System.out.println("insertando: " + a1);
		try{
			
			actService.InsertarActor(a1);			
			String mensaje ="insertado correctamente";
			mv.addObject("mensaje", mensaje);
		}catch (Exception e) {
			System.out.println(e);
			String mensaje ="no se ha podido insertar: " +e.getMessage();
			mv.addObject("mensaje", mensaje);
		}
		mv.setViewName("inicio.jsp");
		return mv; 
	}
}

