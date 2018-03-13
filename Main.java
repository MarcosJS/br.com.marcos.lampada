//Program that modifies the status of the lamp and says if it is economical "Lampada_v1.1.0"

package br.com.marcos.lampada;

public class Main {
	public static void main(String[] args) {
		
		Lampada lamp = new Lampada();
		
		if(lamp.eEconomica()) {
			System.out.println("A lâmpada é econômica!");
		} else {
			System.out.println("A lâmpada não é econômica!");
		}
		
		if(lamp.mostrarEstado()) {
			System.out.println("A lâmpada está acesa!");
		} else {
			System.out.println("A lâmpada está apagada!");
		}
		
		System.out.println("Acendendo.");
		lamp.acenderLampada();
		
		if(lamp.mostrarEstado()) {
			System.out.println("A lâmpada está acesa!");
		} else {
			System.out.println("A lâmpada está apagada!");
		}
		
		System.out.println("Apagando.");
		lamp.apagarLampada();
		
		if(lamp.mostrarEstado()) {
			System.out.println("A lâmpada está acesa!");
		} else {
			System.out.println("A lâmpada está apagada!");
		}
	}
}
