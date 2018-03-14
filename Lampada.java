//Class abstracting a lamp

package br.com.marcos.lampada;

public class Lampada {
	
	private boolean estadoLampada;
	private int watts = 40;
	Contador acesa = new Contador();
	
	void acenderLampada() {
		estadoLampada = true;
		acesa.incrementarEventos();
	}
	
	void apagarLampada() {
		estadoLampada = false;
	}
	
	boolean mostrarEstado() {
		return estadoLampada;
	}
	
	boolean eEconomica() {
		
		boolean economica = false;
		
		if(watts < 40) {
			economica = true;
		}
		return economica;
	}
	
	int mostrarUso() {
		return acesa.getEventos();
	}
}
