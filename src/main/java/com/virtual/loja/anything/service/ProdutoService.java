package com.virtual.loja.anything.service;

import java.util.List;

import com.virtual.loja.anything.model.Produto;

/**
 * Descrição: Interface de serviço de Produto.
 * 
 * @author "Fábio Campêllo"
 * @since 25/05/2019
 * @version 0.0.1
 */
public interface ProdutoService {

	Produto updateSaveProduto(Produto produto);

	Produto findById(Long id);

	List<Produto> findAll();

	void deleteById(Long id);
	
}
