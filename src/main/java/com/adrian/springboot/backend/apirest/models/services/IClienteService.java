package com.adrian.springboot.backend.apirest.models.services;

import java.util.List;

import com.adrian.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
}
