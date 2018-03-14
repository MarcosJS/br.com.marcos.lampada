package br.com.marcos.lampada;

public class Contador {
	int quantidade;
	
	Contador() {
		quantidade = 0;
	}
	Contador(int quant) {
		quantidade = quant;
	}
	
	void zerarEventos() {
		quantidade = 0;
	}
	
	void incrementarEventos() {
		quantidade++;
	}
	
	int getEventos() {
		return quantidade;
	}
}
