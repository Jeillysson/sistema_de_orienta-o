package com.jeillysson.ufal.sistemaespecialista.model;

import java.util.ArrayList;

public class Mensagens {
	private ArrayList<String> listaDeMensagens = new ArrayList<String>();


	public void addMensagem() {
		listaDeMensagens.add("Você Chegou ao Seu Destino"); //0
		listaDeMensagens.add("siga em frente\n"+"Passe pelo estacionamento\n"+
				"O prédio em frente e o Bloco das Coordenacoes\n"+
				"Voce Chegou no Bloco das Coordenacoes?"); //1
	}
	
	
	public String pegarMensagem(int num) {
		 return listaDeMensagens.get(num);
	}

}