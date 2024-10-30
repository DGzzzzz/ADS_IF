package exemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PessoaApp {

	private static Scanner s = new Scanner(System.in);
	private static int opcao;
	private static int id;
	private static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public static void main(String[] args) {
		
		do {			
			menu();
			int opcao = Integer.parseInt(s.nextLine());
			switch (opcao) {
				case 1:
					adicionar();
					break;
				case 2:
					ordenar();
					break;
				case 3:
					buscarPorNome();
					break;
				case 4:
					listarTodos();
					break;
				case 5:
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opção inválida");
			}
		} while (opcao != 5);
	}

	private static void menu() {
		System.out.println("Digite a opção: ");
		System.out.println("[1] Adicionar nome na lista");
		System.out.println("[2] Ordenar");
		System.out.println("[3] Buscar por um nome");
		System.out.println("[4] Listar todos");
		System.out.println("[5] Sair");
	}
	
	private static void adicionar() {
		System.out.println("Digite o nome que deseja adicionar na lista: ");
		if(pessoas.isEmpty()) {
			id = 1;
		} else {
			id = pessoas.size() + 1;
		}
		String nome = s.nextLine();
		pessoas.add(new Pessoa (id, nome));
	}
	
	private static void ordenar() {
		//Collections.sort(pessoas);
	}
	
	private static void buscarPorNome() {
		System.out.println("Digite o nome que deseja pesquisar: ");
		String nome = s.nextLine();
		//Collections.sort(pessoas);
		//int index = Collections.binarySearch(pessoas, nome);
	}
	
	private static void listarTodos() {
		for ( Pessoa p : pessoas) {
			System.out.println("Nome: " + p.getName());
		}
	}
}
