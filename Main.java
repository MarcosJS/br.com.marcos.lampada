//Program that modifies the status of the lamp and says if it is economical "Lampada_v1.1.0"

package br.com.marcos.lampada;

public class Main {
	public static void main(String[] args) {
		
		Lampada lamp = new Lampada();
		
		System.out.println("A lâmpada foi acesa: "+lamp.mostrarUso()+" vezes.");
		
		System.out.println("Lâmpada acesa.");
		lamp.acenderLampada();
		System.out.println("A lâmpada foi acesa: "+lamp.mostrarUso()+" vezes.");
		
		System.out.println("Lâmpada apagada.");
		lamp.apagarLampada();
		System.out.println("A lâmpada foi acesa: "+lamp.mostrarUso()+" vezes.");
		
		System.out.println("Acendendo e apagando a lâmpada varias vezes.");
		for(int i = 0; i < 40; i++) {
			lamp.acenderLampada();
			lamp.apagarLampada();
		}
		System.out.println("A lâmpada foi acesa: "+lamp.mostrarUso()+" vezes.");
	}
}
