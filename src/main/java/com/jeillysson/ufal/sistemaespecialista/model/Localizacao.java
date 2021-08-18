package com.jeillysson.ufal.sistemaespecialista.model;

import java.util.ArrayList;

public class Localizacao {
	
	    private ArrayList<String> listaDeLocais = new ArrayList<String>();
	    
	    
	    
		private int saida;
		private int destino;
		private int temp;
		private String orientacao;
		
		public Localizacao() {
			addLocais();
		}
		
		public int getSaida() {
			return saida;
		}
		
		public void setSaida(int saida) {
			this.saida = saida;
		}
		
		public int getTemp() {
			return temp;
		}
		
		public void setTemp(int temp) {
			this.temp = temp;
		}
		
		public int getDestino() {
			return destino;
		}
		
		public void setDestino(int destino) {
			this.destino = destino;
		}
		
		public String getOrientacao() {
			return orientacao;
		}
		
		public void setOrientacao(String orientacao) {
			this.orientacao = orientacao;
		}
		
		public void addLocais() {
			listaDeLocais.add("GUARITA"); //0
			listaDeLocais.add("BLOCO DE COORDENAÇÃO"); //1
			listaDeLocais.add("AUDITÓRIO"); // 2
			listaDeLocais.add("BLOCO A"); //3
			listaDeLocais.add("BIBLIOTECA"); // 4
			listaDeLocais.add("NAE"); //5
			listaDeLocais.add("BLOCO B"); //6
			listaDeLocais.add("BLOCO B2"); //7
			listaDeLocais.add("BLOCO C"); //8
			listaDeLocais.add("LECC 1"); //9
		}
		
		public String pegarLocal(int local) {
			 return listaDeLocais.get(local);
		}
		
	
}
