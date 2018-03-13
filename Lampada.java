//Class abstracting a lamp

package br.com.marcos.lampada;

public class Lampada {
	
	private boolean estadoLampada;
	private int watts = 40;
	
	void acenderLampada() {
		estadoLampada = true;
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
}
