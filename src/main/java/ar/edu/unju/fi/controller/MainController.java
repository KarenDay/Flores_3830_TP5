package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.service.IUsuarioService;

@Controller
public class MainController {

	private IUsuarioService usuarioService;
	
	@RequestMapping("/")
	public String main(Model model) {
		model.addAttribute("usuario",usuarioService.mostrar().getNombre());
		return "index";
	}
}
