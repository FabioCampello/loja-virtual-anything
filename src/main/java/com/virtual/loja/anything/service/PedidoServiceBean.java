package com.virtual.loja.anything.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.virtual.loja.anything.model.Pedido;
import com.virtual.loja.anything.model.Status;
import com.virtual.loja.anything.repository.PedidoRepository;

/**
 * Descrição: Classe de serviço de Pedido.
 * 
 * @author "Fábio Campêllo"
 * @since 25/05/2019
 * @version 0.0.1
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PedidoServiceBean implements PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;

	/**
	 * Descrição: Cadastrar/atualizar Pedido
	 * 
	 * @param Pedido pedido
	 * @return Pedido pedido
	 */
	@Override
	public Pedido updateSavePedido(Pedido pedido) {
		pedido.setStatus(Status.PENDENTE);
		return pedidoRepository.save(pedido);
	}

	/**
	 * Descrição: Retornando Pedido pelo id
	 * 
	 * @param id
	 * @return Pedido
	 */
	@Override
	public Pedido findById(Long id) {
		return pedidoRepository.findById(id).get();
	}

	/**
	 * Descrição: Retornando todos os Pedidos
	 * 
	 * @return List<Pedido>
	 */
	@Override
	public List<Pedido> findAll() {
		return pedidoRepository.findAll();
	}

	/**
	 * Descrição: Removendo Pedido pelo id
	 * 
	 * @param id
	 */
	@Override
	public void deleteById(Long id) {
		pedidoRepository.deleteById(id);
	}
}
