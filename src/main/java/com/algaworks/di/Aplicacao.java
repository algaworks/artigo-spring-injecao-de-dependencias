package com.algaworks.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Aplicacao {
	
	public static void main(String[] args) {
	    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	    
	    context.scan(Aplicacao.class.getPackage().getName());
	    context.refresh();
	    
	    ClienteServico servico = context.getBean(ClienteServico.class);
	    servico.salvar(new Cliente(1, "Aluno João da Silva", "joao.artilheiro@gmail.com"));
	    
	    context.close();
	}
}