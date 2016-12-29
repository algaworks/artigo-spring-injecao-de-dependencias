package com.algaworks.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("importante")
public class Email implements Notificador {

	@Override
	public void notificar(Mensagem mensagem) {
		System.out.println("AW ::: Notificando por e-mail: " + mensagem);
	}
}