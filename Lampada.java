//Class abstracting a lamp

package br.com.marcos.lampada;

public class Lampada {
	
	private boolean estadoLampada;
	
	void acenderLampada() {
		estadoLampada = true;
	}
	
	void apagarLampada() {
		estadoLampada = false;
	}
	
	boolean mostrarEstado() {
		return estadoLampada;
	}	
}
