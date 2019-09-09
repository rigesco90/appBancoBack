package com.cines.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cines.web.service.IAdministradorService;

@Controller
@RequestMapping("/administrador")
public class AdministradorController {

	@Autowired
	IAdministradorService administradorService;

	@GetMapping(value = "/buscarAdministrador", produces = MediaType.APPLICATION_JSON_VALUE)
	public String buscarAdministrador() {
		return administradorService.buscarAdministrador("1234");
	}

}
