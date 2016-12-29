package com.algaworks.di;

import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepositorioJPA implements ClienteRepositorio {
	
	@Override
	public void salvar(Cliente cliente) {
		System.out.println("AW ::: Salvando o cliente com JPA: " + cliente);
	}
}