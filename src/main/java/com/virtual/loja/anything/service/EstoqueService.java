package com.virtual.loja.anything.service;

import java.util.List;

import com.virtual.loja.anything.model.Estoque;

/**
 * Descrição: Interface de serviço de Estoque.
 * 
 * @author "Fábio Campêllo"
 * @since 25/05/2019
 * @version 0.0.1
 */
public interface EstoqueService {

	Estoque updateSaveEstoque(Estoque estoque);

	Estoque findById(Long id);

	List<Estoque> findAll();

	void deleteById(Long id);
	
}
