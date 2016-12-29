package com.algaworks.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AplicacaoConfig {
	
	@Bean
	public ArquivoNuvem arquivoNuvem() {
		ArquivoNuvem nuvem = new ArquivoNuvem();
		return nuvem;
	}
}