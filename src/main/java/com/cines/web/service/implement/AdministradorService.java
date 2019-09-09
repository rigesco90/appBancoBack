package com.cines.web.service.implement;

import org.springframework.stereotype.Service;

import com.cines.web.service.IAdministradorService;

@Service
public class AdministradorService implements IAdministradorService {

	@Override
	public String buscarAdministrador(String identificacion) {
		return "RIGO CAMPO";
	}
}
