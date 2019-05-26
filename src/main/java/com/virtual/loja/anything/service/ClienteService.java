package com.virtual.loja.anything.service;

import java.util.List;

import com.virtual.loja.anything.model.Cliente;

/**
 * Descrição: Interface de serviço de Cliente.
 * 
 * @author "Fábio Campêllo"
 * @since 25/05/2019
 * @version 0.0.1
 */
public interface ClienteService {

	Cliente updateSaveCliente(Cliente cliente);

	Cliente findById(Long id);

	List<Cliente> findAll();

	void deleteById(Long id);

}
