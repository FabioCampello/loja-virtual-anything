package com.virtual.loja.anything.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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

}
