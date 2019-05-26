package com.virtual.loja.anything.service;

import java.util.List;

import com.virtual.loja.anything.model.Pedido;

/**
 * Descrição: Interface de serviço de Pedido.
 * 
 * @author "Fábio Campêllo"
 * @since 25/05/2019
 * @version 0.0.1
 */
public interface PedidoService {
	
	Pedido updateSavePedido(Pedido pedido);

	Pedido findById(Long id);

	List<Pedido> findAll();

	void deleteById(Long id);

}
