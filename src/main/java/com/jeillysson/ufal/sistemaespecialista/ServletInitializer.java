package com.jeillysson.ufal.sistemaespecialista;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {
	
	/*Essa classe já veio implementada quando iniciei o spring 
	 * não mexi em nada dela
	 */

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SistemaOrientacaoApplication.class);
	}

}
