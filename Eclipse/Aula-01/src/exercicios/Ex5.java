package exercicios;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Digite o valor do salário: ");
		double salario = Double.parseDouble(s.nextLine());
		
		System.out.println("Digite o valor do percentual de aumento: ");
		double percentualAaumento = Double.parseDouble(s.nextLine());
		
		double aumento = (salario * percentualAaumento) / 10;
		double novoSalario = salario + aumento;
		
		System.out.printf("Salário atual: %.2f\nAumento: %.2f\nNovo Salário:  %.2f", salario, aumento, novoSalario);
	}

}
