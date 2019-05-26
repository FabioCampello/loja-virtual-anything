package com.virtual.loja.anything.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.virtual.loja.anything.model.Cliente;
import com.virtual.loja.anything.service.ClienteService;

/**
 * Descrição: End-point da api responsável por requisicoes de Cliente.
 * 
 * @author "Fábio Campêllo"
 * @since 25/05/2019
 * @version 0.0.1
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	/**
	 * Descrição: Cadastrar/atualizar Cliente
	 * 
	 * @param Cliente cliente
	 * @return Cliente cliente
	 */
	@RequestMapping(value = "updateSaveCliente", method = RequestMethod.PUT)
	public ResponseEntity<Cliente> updateSaveCliente(@RequestBody Cliente cliente) {
		ResponseEntity<Cliente> cli = null;
		try {
			cli = new ResponseEntity<Cliente>(clienteService.updateSaveCliente(cliente), HttpStatus.OK);
		} catch (Exception error) {
			error.printStackTrace();
		}
		return cli;
	}

	/**
	 * Descrição: Retornando Cliente pelo id
	 * 
	 * @param id
	 * @return Cliente
	 */
	@RequestMapping(value = "findById/{id}", method = RequestMethod.GET)
	public ResponseEntity<Cliente> findById(@PathVariable("id") Long id) {
		ResponseEntity<Cliente> cli = null;
		try {
			cli = new ResponseEntity<Cliente>(clienteService.findById(id), HttpStatus.OK);
		} catch(Exception error) {
			error.printStackTrace();
		}
		return cli;
	}

	/**
	 * Descrição: Retornando todos os Clientes
	 * 
	 * @return List<Cliente>
	 */
	@RequestMapping(value = "findAll", method = RequestMethod.GET)
	public ResponseEntity<List<Cliente>> findAll() {
		ResponseEntity<List<Cliente>> list = null;
		try {
			list = new ResponseEntity<List<Cliente>>(clienteService.findAll(), HttpStatus.OK);
		} catch (Exception error) {
			error.printStackTrace();
		}
		return list;
	}

	/**
	 * Descrição: Removendo Cliente pelo id
	 * 
	 * @param id
	 */
	@RequestMapping(value = "deleteById/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Long id) {
		try {
			clienteService.deleteById(id);
		} catch (Exception error) {
			error.printStackTrace();
		}
	}

}
