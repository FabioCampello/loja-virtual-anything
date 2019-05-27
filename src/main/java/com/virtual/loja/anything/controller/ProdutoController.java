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

import com.virtual.loja.anything.model.Produto;
import com.virtual.loja.anything.service.ProdutoService;

/**
 * Descrição: End-point da api responsável por requisicoes de Produto.
 * 
 * @author "Fábio Campêllo"
 * @since 25/05/2019
 * @version 0.0.1
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	/**
	 * Descrição: Cadastrar/atualizar Produto
	 * 
	 * @param Produto produto
	 * @return Produto produto
	 */
	@RequestMapping(value = "updateSaveProduto", method = RequestMethod.PUT)
	public ResponseEntity<Produto> updateSaveProduto(@RequestBody Produto produto) {
		ResponseEntity<Produto> prod = null;
		try {
			prod = new ResponseEntity<Produto>(produtoService.updateSaveProduto(produto), HttpStatus.OK);
		} catch (Exception error) {
			error.printStackTrace();
		}
		return prod;
	}

	/**
	 * Descrição: Retornando Produto pelo id
	 * 
	 * @param id
	 * @return Produto
	 */
	@RequestMapping(value = "findById/{id}", method = RequestMethod.GET)
	public ResponseEntity<Produto> findById(@PathVariable("id") Long id) {
		ResponseEntity<Produto> prod = null;
		try {
			prod = new ResponseEntity<Produto>(produtoService.findById(id), HttpStatus.OK);
		} catch(Exception error) {
			error.printStackTrace();
		}
		return prod;
	}

	/**
	 * Descrição: Retornando todos os Produtos
	 * 
	 * @return List<Produto>
	 */
	@RequestMapping(value = "findAll", method = RequestMethod.GET)
	public ResponseEntity<List<Produto>> findAll() {
		ResponseEntity<List<Produto>> list = null;
		try {
			list = new ResponseEntity<List<Produto>>(produtoService.findAll(), HttpStatus.OK);
		} catch (Exception error) {
			error.printStackTrace();
		}
		return list;
	}

	/**
	 * Descrição: Removendo Produto pelo id
	 * 
	 * @param id
	 */
	@RequestMapping(value = "deleteById/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Long id) {
		try {
			produtoService.deleteById(id);
		} catch (Exception error) {
			error.printStackTrace();
		}
	}
	
}
