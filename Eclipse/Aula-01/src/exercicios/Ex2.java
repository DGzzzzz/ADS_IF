package exercicios;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int numero = Integer.parseInt(s.nextLine());
		
		if (numero % 2 == 0) {
			System.out.println("Par");
		} else { 
			System.out.println("Ímpar");
		}
	}

}
