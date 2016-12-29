package com.algaworks.di;

public class Mensagem {
	
	private String para;
	
	private String assunto;
	
	private String texto;
	
	public Mensagem(String para, String assunto, String texto) {
		this.para = para;
		this.assunto = assunto;
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "Mensagem [para=" + para + ", assunto=" + assunto + ", texto=" + texto + "]";
	}
}
