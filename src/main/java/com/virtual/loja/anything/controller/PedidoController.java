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

import com.virtual.loja.anything.model.Pedido;
import com.virtual.loja.anything.service.PedidoService;

/**
 * Descrição: End-point da api responsável por requisicoes de Pedido.
 * 
 * @author "Fábio Campêllo"
 * @since 25/05/2019
 * @version 0.0.1
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/pedido")
public class PedidoController {
	
	@Autowired
	private PedidoService pedidoService;
	
	/**
	 * Descrição: Cadastrar/atualizar Pedido
	 * 
	 * @param Pedido pedido
	 * @return Pedido pedido
	 */
	@RequestMapping(value = "updateSavePedido", method = RequestMethod.PUT)
	public ResponseEntity<Pedido> updateSavePedido(@RequestBody Pedido pedido) {
		ResponseEntity<Pedido> pid = null;
		try {
			pid = new ResponseEntity<Pedido>(pedidoService.updateSavePedido(pedido), HttpStatus.OK);
		} catch (Exception error) {
			error.printStackTrace();
		}
		return pid;
	}

	/**
	 * Descrição: Retornando Pedido pelo id
	 * 
	 * @param id
	 * @return Pedido
	 */
	@RequestMapping(value = "findById/{id}", method = RequestMethod.GET)
	public ResponseEntity<Pedido> findById(@PathVariable("id") Long id) {
		ResponseEntity<Pedido> pid = null;
		try {
			pid = new ResponseEntity<Pedido>(pedidoService.findById(id), HttpStatus.OK);
		} catch(Exception error) {
			error.printStackTrace();
		}
		return pid;
	}

	/**
	 * Descrição: Retornando todos os Pedidos
	 * 
	 * @return List<Pedido>
	 */
	@RequestMapping(value = "findAll", method = RequestMethod.GET)
	public ResponseEntity<List<Pedido>> findAll() {
		ResponseEntity<List<Pedido>> list = null;
		try {
			list = new ResponseEntity<List<Pedido>>(pedidoService.findAll(), HttpStatus.OK);
		} catch (Exception error) {
			error.printStackTrace();
		}
		return list;
	}

	/**
	 * Descrição: Removendo Pedido pelo id
	 * 
	 * @param id
	 */
	@RequestMapping(value = "deleteById/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Long id) {
		try {
			pedidoService.deleteById(id);
		} catch (Exception error) {
			error.printStackTrace();
		}
	}

}
