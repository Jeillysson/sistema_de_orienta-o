package com.jeillysson.ufal.sistemaespecialista.controller;

import java.io.UnsupportedEncodingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jeillysson.ufal.sistemaespecialista.drools.BaseConhecimento;
import com.jeillysson.ufal.sistemaespecialista.model.Localizacao;

@Controller
@RequestMapping("/sistema")
public class SistemaController{
	private final BaseConhecimento baseconhecimento;
	private Localizacao localizacao = new Localizacao();
	
	@Autowired
	public SistemaController(BaseConhecimento baseconhecimento) {
		this.baseconhecimento = baseconhecimento;
	}
	
	@RequestMapping(value = "boasvindas", method = RequestMethod.GET)
	public ModelAndView boasVindas(@RequestParam(value = "saida", required = true) String saida,
			@RequestParam(value = "destino", required = true) String destino
			) throws UnsupportedEncodingException {

		ModelAndView modelAndView = new ModelAndView("boasVindas");
		
		int saidaInt = Integer.parseInt(saida);
		int destinoInt = Integer.parseInt(destino);
		
		localizacao.setSaida(saidaInt);
		localizacao.setDestino(destinoInt);
		localizacao.setTemp(0);
 	
		baseconhecimento.getProductDiscount(localizacao);
	
		String mensagemreal  =localizacao.getOrientacao();
	
		
		modelAndView.addObject("mensagem", localizacao.getOrientacao());
		System.out.println(localizacao.getSaida());
		System.out.println(mensagemreal);
		return modelAndView;
	}
	
	@RequestMapping("/boasvindas2")
	public ModelAndView boasVindas(){

		ModelAndView modelAndView = new ModelAndView("boasVindas2");

		baseconhecimento.getProductDiscount(localizacao);
		modelAndView.addObject("mensagem2", localizacao.getOrientacao() );
		System.out.println(localizacao.getSaida());
		return modelAndView;
	}	
	
	
	@RequestMapping("/maps")
	public ModelAndView maps(){

		ModelAndView modelAndView = new ModelAndView("maps");
		return modelAndView;
	}

}