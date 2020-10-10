package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.CajaDeRegalo;

import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.ModelAttribute;  

@RequestMapping("/cajaderegalo")  
@Controller
public class ControladorCajaDeRegalo {
	// se accede agregando "/inicio" a la url
	/*@RequestMapping(path = "/irACategoria", method = RequestMethod.GET)
	public ModelAndView irACategoria() {
		// como no se como redireccionar seg�n lo que se clickeo lo hago con path variable que es lo que ense�aron
		return new ModelAndView("restaurante");

	}*/
	/*@RequestMapping(path = "/inicio", method = RequestMethod.GET)
	public ModelAndView irAInicio() {
		return new ModelAndView("home");
	}*/
	 @RequestMapping("/regalo-form")  
	 public String regaloForm(Model model)  {  
		 //creamos la clase Caja De Regalo 
	     CajaDeRegalo reg=new CajaDeRegalo(); 	     	        
	     model.addAttribute("regalo", reg);  	     
	     return "regalo-pagina";  
	 }  
	 
	 @RequestMapping("/submitForm")  
	 public String submitForm(@ModelAttribute("regalo") CajaDeRegalo reg){  
	     return "confirmacion-regalo";  
	 }  
}