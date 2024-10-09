package exercicios3;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		int option = 1000;
		
		do  {
			
			System.out.println("Opções: ");
			System.out.println("Sair: 0");
			System.out.println("Cadastrar: 1");
			System.out.println("Remover pelo CPF: 2");
			System.out.println("Remover todos: 3");
			System.out.println("Listar todos: 4");
			System.out.println("digite abaixo:");
			option = Integer.parseInt(s.nextLine());
			
			if(option == 1) {
				System.out.println("Informe um nome: ");
				String nome = s.nextLine();
				System.out.println("Informe o CPF: ");
				String cpf = s.nextLine();
				System.out.println("Informe a idade: ");
				Integer idade = Integer.parseInt(s.nextLine());
				pessoas.add(new Pessoa(nome, cpf, idade));
			}
			
			if(option == 2) {
				System.out.println("Informe o CPF para remover a pessoa: ");
				String cpf = s.nextLine();
				for (int i = 0; i < pessoas.size(); i++) {
					if ( cpf.equals(pessoas.get(i).getCpf())) {
						pessoas.remove(i);
					} else {
						System.out.println("CPF nao encontrado");
					}
				}
			}
			
			if(option == 3) {
				pessoas.clear();
			}
			
			if(option == 4) {
				for (int i = 0; i < pessoas.size(); i++) {
					System.out.println("Nome: " + pessoas.get(i).getNome());
					System.out.println("CPF: " + pessoas.get(i).getCpf());
					System.out.println("Idade: " + pessoas.get(i).getIdade());
				}
			}
			
			if(option == 5) {
				System.out.println("Informe o CPF para consultar seus dados: ");
				String consulta = s.nextLine();
				
			}
			
		} while (option != 0);
		
		s.close();
	}

}
