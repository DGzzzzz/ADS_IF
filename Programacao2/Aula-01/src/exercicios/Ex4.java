package exercicios;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double pi = 3.14159;

		System.out.println("Digite o raio da esfera");
		double raio = Double.parseDouble(s.nextLine());
		
		double cuboRaio = raio * raio * raio;
		
		double volume = 4 * pi * cuboRaio / 3;
		System.out.printf("Volume da esfera: %.2f", volume);

		s.close();
	}

}
