package com.virtual.loja.anything.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.virtual.loja.anything.model.Cliente;
import com.virtual.loja.anything.repository.ClienteRepository;

/**
 * Descrição: Classe de serviço de Cliente.
 * 
 * @author "Fábio Campêllo"
 * @since 25/05/2019
 * @version 0.0.1
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ClienteServiceBean implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	/**
	 * Descrição: Cadastrar/atualizar Cliente
	 * 
	 * @param Cliente cliente
	 * @return Cliente cliente
	 */
	@Override
	public Cliente updateSaveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	/**
	 * Descrição: Retornando Cliente pelo id
	 * 
	 * @param id
	 * @return Cliente
	 */
	@Override
	public Cliente findById(Long id) {
		return clienteRepository.findById(id).get();
	}

	/**
	 * Descrição: Retornando todos os Clientes
	 * 
	 * @return List<Cliente>
	 */
	@Override
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

	/**
	 * Descrição: Removendo Cliente pelo id
	 * 
	 * @param id
	 */
	@Override
	public void deleteById(Long id) {
		clienteRepository.deleteById(id);
	}

}
