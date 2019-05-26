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

import com.virtual.loja.anything.model.Estoque;
import com.virtual.loja.anything.service.EstoqueService;

/**
 * Descrição: End-point da api responsável por requisicoes de Estoque.
 * 
 * @author "Fábio Campêllo"
 * @since 25/05/2019
 * @version 0.0.1
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/estoque")
public class EstoqueController {
	
	@Autowired
	private EstoqueService estoqueService;
	
	/**
	 * Descrição: Cadastrar/atualizar Estoque
	 * 
	 * @param Estoque estoque
	 * @return Estoque estoque
	 */
	@RequestMapping(value = "updateSaveEstoque", method = RequestMethod.PUT)
	public ResponseEntity<Estoque> updateSaveCliente(@RequestBody Estoque estoque) {
		ResponseEntity<Estoque> est = null;
		try {
			est = new ResponseEntity<Estoque>(estoqueService.updateSaveEstoque(estoque), HttpStatus.OK);
		} catch (Exception error) {
			error.printStackTrace();
		}
		return est;
	}

	/**
	 * Descrição: Retornando Estoque pelo id
	 * 
	 * @param id
	 * @return Estoque
	 */
	@RequestMapping(value = "findById/{id}", method = RequestMethod.GET)
	public ResponseEntity<Estoque> findById(@PathVariable("id") Long id) {
		ResponseEntity<Estoque> est = null;
		try {
			est = new ResponseEntity<Estoque>(estoqueService.findById(id), HttpStatus.OK);
		} catch(Exception error) {
			error.printStackTrace();
		}
		return est;
	}

	/**
	 * Descrição: Retornando todos os Estoque
	 * 
	 * @return List<Estoque>
	 */
	@RequestMapping(value = "findAll", method = RequestMethod.GET)
	public ResponseEntity<List<Estoque>> findAll() {
		ResponseEntity<List<Estoque>> list = null;
		try {
			list = new ResponseEntity<List<Estoque>>(estoqueService.findAll(), HttpStatus.OK);
		} catch (Exception error) {
			error.printStackTrace();
		}
		return list;
	}

	/**
	 * Descrição: Removendo Estoque pelo id
	 * 
	 * @param id
	 */
	@RequestMapping(value = "deleteById/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Long id) {
		try {
			estoqueService.deleteById(id);
		} catch (Exception error) {
			error.printStackTrace();
		}
	}


}
