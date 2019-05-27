package com.virtual.loja.anything.service;

import java.util.List;

import com.virtual.loja.anything.model.Reposicao;

/**
 * Descrição: Interface de serviço de Reposicao.
 * 
 * @author "Fábio Campêllo"
 * @since 25/05/2019
 * @version 0.0.1
 */
public interface ReposicaoService {

	Reposicao updateSaveReposicao(Reposicao reposicao);

	Reposicao findById(Long id);

	List<Reposicao> findAll();

	void deleteById(Long id);
	
}
