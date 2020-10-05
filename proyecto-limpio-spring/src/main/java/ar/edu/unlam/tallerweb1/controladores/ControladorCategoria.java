package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Categoria;


@Controller
public class ControladorCategoria {
	
	// se accede agregando "/inicio" a la url
	@RequestMapping(path = "/irACategoria", method = RequestMethod.GET)
	public ModelAndView irACategoria() {
		
		Categoria restaurante = new Categoria ("Restaurante", "Comidas en diversos restaurantes");
		Categoria spa = new Categoria ("Spa", "Servicios de spa");
		Categoria actividades = new Categoria("Actividades", "Actividades para realizar al aire libre");


		// como no se como redireccionar según lo que se clickeo lo hago con path variable que es lo que enseñaron
		
		return new ModelAndView("restautante");

	}
	
	@RequestMapping(path = "/inicio", method = RequestMethod.GET)
	public ModelAndView irAInicio() {
		return new ModelAndView("home");
	}

}
