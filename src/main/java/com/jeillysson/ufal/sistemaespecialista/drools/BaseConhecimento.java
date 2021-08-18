package com.jeillysson.ufal.sistemaespecialista.drools;

import org.kie.api.runtime.KieContainer;


import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeillysson.ufal.sistemaespecialista.model.Localizacao;


@Service
public class BaseConhecimento {
	
	private final KieContainer kieContainer;

	@Autowired
	public BaseConhecimento(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}

	public Localizacao getProductDiscount(Localizacao localizacao) {
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(localizacao);
		kieSession.fireAllRules();
		kieSession.dispose(); 
		return localizacao;	
	}
}
