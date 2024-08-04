package exercicios;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Digite o valor do sal�rio: ");
		double salario = Double.parseDouble(s.nextLine());
		
		System.out.println("Digite o valor do percentual de aumento: ");
		double percentualAaumento = Double.parseDouble(s.nextLine());
		
		double aumento = (salario * percentualAaumento) / 10;
		double novoSalario = salario + aumento;
		
		System.out.printf("Sal�rio atual: %.2f\nAumento: %.2f\nNovo Sal�rio:  %.2f", salario, aumento, novoSalario);

		s.close();
	}
}
