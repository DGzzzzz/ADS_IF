package exercicios;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Componente[] componentes = new Componente[2];
		
		componentes[0] = new Monitor("Acer", "920", 1920);
		
		componentes[1] = new DiscoRigido("Asus", "32", 512);
		
		for(int i = 0; i < componentes.length; i++) {
			componentes[i].imprimir();
		}
		
		s.close();
	}
}
