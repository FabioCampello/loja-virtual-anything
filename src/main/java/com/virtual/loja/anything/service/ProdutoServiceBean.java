package com.virtual.loja.anything.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.virtual.loja.anything.model.Produto;
import com.virtual.loja.anything.repository.ProdutoRepository;

/**
 * Descrição: Classe de serviço de Produto.
 * 
 * @author "Fábio Campêllo"
 * @since 25/05/2019
 * @version 0.0.1
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ProdutoServiceBean implements ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;

	/**
	 * Descrição: Cadastrar/atualizar Produto
	 * 
	 * @param Produto produto
	 * @return Produto produto
	 */
	@Override
	public Produto updateSaveProduto(Produto produto) {
		return produtoRepository.save(produto);
	}

	/**
	 * Descrição: Retornando Produto pelo id
	 * 
	 * @param id
	 * @return Produto
	 */
	@Override
	public Produto findById(Long id) {
		return produtoRepository.findById(id).get();
	}

	/**
	 * Descrição: Retornando todos os Produtos
	 * 
	 * @return List<Produto>
	 */
	@Override
	public List<Produto> findAll() {
		return produtoRepository.findAll();
	}

	/**
	 * Descrição: Removendo Produto pelo id
	 * 
	 * @param id
	 */
	@Override
	public void deleteById(Long id) {
		produtoRepository.deleteById(id);
	}

}
