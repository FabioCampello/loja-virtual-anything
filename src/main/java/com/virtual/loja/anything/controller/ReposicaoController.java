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

import com.virtual.loja.anything.model.Reposicao;
import com.virtual.loja.anything.service.ReposicaoService;

/**
 * Descrição: End-point da api responsável por requisicoes de Reposicao.
 * 
 * @author "Fábio Campêllo"
 * @since 25/04/2019
 * @version 0.0.1
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/reposicao")
public class ReposicaoController {

	@Autowired
	private ReposicaoService reposicaoService;
	
	/**
	 * Descrição: Cadastrar/atualizar Reposicao
	 * 
	 * @param Reposicao reposicao
	 * @return Reposicao reposicao
	 */
	@RequestMapping(value = "updateSaveReposicao", method = RequestMethod.PUT)
	public ResponseEntity<Reposicao> updateSaveCliente(@RequestBody Reposicao reposicao) {
		ResponseEntity<Reposicao> rep = null;
		try {
			rep = new ResponseEntity<Reposicao>(reposicaoService.updateSaveReposicao(reposicao), HttpStatus.OK);
		} catch (Exception error) {
			error.printStackTrace();
		}
		return rep;
	}

	/**
	 * Descrição: Retornando Reposicao pelo id
	 * 
	 * @param id
	 * @return Reposicao
	 */
	@RequestMapping(value = "findById/{id}", method = RequestMethod.GET)
	public ResponseEntity<Reposicao> findById(@PathVariable("id") Long id) {
		ResponseEntity<Reposicao> rep = null;
		try {
			rep = new ResponseEntity<Reposicao>(reposicaoService.findById(id), HttpStatus.OK);
		} catch(Exception error) {
			error.printStackTrace();
		}
		return rep;
	}

	/**
	 * Descrição: Retornando todos os Reposicaos
	 * 
	 * @return List<Reposicao>
	 */
	@RequestMapping(value = "findAll", method = RequestMethod.GET)
	public ResponseEntity<List<Reposicao>> findAll() {
		ResponseEntity<List<Reposicao>> list = null;
		try {
			list = new ResponseEntity<List<Reposicao>>(reposicaoService.findAll(), HttpStatus.OK);
		} catch (Exception error) {
			error.printStackTrace();
		}
		return list;
	}

	/**
	 * Descrição: Removendo Reposicao pelo id
	 * 
	 * @param id
	 */
	@RequestMapping(value = "deleteById/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Long id) {
		try {
			reposicaoService.deleteById(id);
		} catch (Exception error) {
			error.printStackTrace();
		}
	}
	
}
