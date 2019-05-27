package com.virtual.loja.anything.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.virtual.loja.anything.model.Reposicao;
import com.virtual.loja.anything.repository.ReposicaoRepository;

/**
 * Descrição: Classe de serviço de Reposicao.
 * 
 * @author "Fábio Campêllo"
 * @since 25/05/2019
 * @version 0.0.1
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ReposicaoServiceBean implements ReposicaoService {

	@Autowired
	private ReposicaoRepository reposicaoRepository;

	/**
	 * Descrição: Cadastrar/atualizar Reposicao
	 * 
	 * @param Reposicao reposicao
	 * @return Reposicao reposicao
	 */
	@Override
	public Reposicao updateSaveReposicao(Reposicao reposicao) {
		return reposicaoRepository.save(reposicao);
	}

	/**
	 * Descrição: Retornando Reposicao pelo id
	 * 
	 * @param id
	 * @return Reposicao
	 */
	@Override
	public Reposicao findById(Long id) {
		return reposicaoRepository.findById(id).get();
	}

	/**
	 * Descrição: Retornando todos os Reposicaos
	 * 
	 * @return List<Reposicao>
	 */
	@Override
	public List<Reposicao> findAll() {
		return reposicaoRepository.findAll();
	}

	/**
	 * Descrição: Removendo Reposicao pelo id
	 * 
	 * @param id
	 */
	@Override
	public void deleteById(Long id) {
		reposicaoRepository.deleteById(id);
	}
	
}
