package exemplos;

import java.util.Scanner;

public class Leitura {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		String nome = leitor.nextLine();
		
		System.out.print("Informe sua idade: ");
		int idade = Integer.parseInt(leitor.nextLine());
		
		System.out.println("Olá " + nome + "!");
		System.out.println("Você tem " + idade + " anos");
	}

}
