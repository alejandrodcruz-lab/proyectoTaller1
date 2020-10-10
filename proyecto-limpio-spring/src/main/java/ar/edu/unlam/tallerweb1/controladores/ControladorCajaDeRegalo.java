package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.CajaDeRegalo;
import ar.edu.unlam.tallerweb1.servicios.ServicioRegalos;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

@RequestMapping("/cajaderegalo")
@Controller
public class ControladorCajaDeRegalo {

	private ServicioRegalos servicioRegalos;
	
	@Autowired
	public ControladorCajaDeRegalo(ServicioRegalos servicioRegalos) {
		this.servicioRegalos = servicioRegalos;
	}


	@RequestMapping(path = "/regalo-form", method = RequestMethod.GET)
	public ModelAndView regaloForm(Model model) {
		// creamos la clase Caja De Regalo
		CajaDeRegalo reg = new CajaDeRegalo();

		model.addAttribute("regalo", reg);

		return new ModelAndView("regalo-pagina");
	}

	@RequestMapping("/submitForm")
	public ModelAndView submitForm(@ModelAttribute("regalo") CajaDeRegalo regalo) {
		
		servicioRegalos.crear(regalo);
		return new ModelAndView("confirmacion-regalo");
	}

//	 @RequestMapping("/mostrarCategorias/{categoria}")  
//	 public ModelAndView submitForm(@PathVariable String categoria)
//	 {  
//		 
//		 ModelMap model = new ModelMap();
//		 model.put("CATEGORIA_SELECCIONADA", categoria);
//		 
//		 
//	     return new ModelAndView(categoria, model);  
//	 }  

}
