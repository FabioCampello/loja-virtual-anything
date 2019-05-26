package com.virtual.loja.anything.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.virtual.loja.anything.model.Estoque;
import com.virtual.loja.anything.repository.EstoqueRepository;

/**
 * Descrição: Classe de serviço de Estoque.
 * 
 * @author "Fábio Campêllo"
 * @since 25/05/2019
 * @version 0.0.1
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class EstoqueServiceBean implements EstoqueService {

	@Autowired
	private EstoqueRepository estoqueRepository;

	/**
	 * Descrição: Cadastrar/atualizar Estoque
	 * 
	 * @param Estoque estoque
	 * @return Estoque estoque
	 */
	@Override
	public Estoque updateSaveEstoque(Estoque estoque) {
		return estoqueRepository.save(estoque);
	}

	/**
	 * Descrição: Retornando Estoque pelo id
	 * 
	 * @param id
	 * @return Estoque
	 */
	@Override
	public Estoque findById(Long id) {
		return estoqueRepository.findById(id).get();
	}

	/**
	 * Descrição: Retornando todos os Estoque
	 * 
	 * @return List<Estoque>
	 */
	@Override
	public List<Estoque> findAll() {
		return estoqueRepository.findAll();
	}

	/**
	 * Descrição: Removendo Estoque pelo id
	 * 
	 * @param id
	 */
	@Override
	public void deleteById(Long id) {
		estoqueRepository.deleteById(id);
	}

}
