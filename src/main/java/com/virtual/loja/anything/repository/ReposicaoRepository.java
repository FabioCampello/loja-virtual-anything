package com.virtual.loja.anything.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtual.loja.anything.model.Reposicao;

/**
 * Descrição: Interface que implementa Jpa na camada de persistência
 * 
 * @author "Fábio Campêllo"
 * @since 25/05/2019
 * @version 0.0.1
 */
public interface ReposicaoRepository extends JpaRepository<Reposicao, Long> {

}
