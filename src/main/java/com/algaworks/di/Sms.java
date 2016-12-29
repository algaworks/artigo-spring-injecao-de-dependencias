package com.algaworks.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("urgente")
public class Sms implements Notificador {

	@Override
	public void notificar(Mensagem mensagem) {
		System.out.println("AW ::: Notificando por SMS: " + mensagem);
	}
}