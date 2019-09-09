package com.cines.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cines.web.model.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {

	@Value("${indexcontroller.index.titulo}")
	private String tituloIndex;

	@Value("${indexcontroller.infoUsuario.bienvenido}")
	private String bienvenido;

	@Value("${indexcontroller.llavetitulo.titulo}")
	private String titulo;

	@GetMapping(value = { "/index", "/" })
	public String index(Model model) {
		model.addAttribute(titulo, tituloIndex);
		return "index";
	}

	@GetMapping("/usuario")
	public String infoUsuario(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombreCompleto("RIGO ESLEIDER");
		usuario.setApellidoCompleto("CAMPO ORDOÑEZ");
		usuario.setNombreUsuario("RIGESCO");

		model.addAttribute(titulo, bienvenido.concat(usuario.getNombreUsuario()));
		model.addAttribute("usuario", usuario);

		return "usuario";
	}

}
