package exercicios;

import java.util.Scanner;

public class Ex1 {
	
	private static Scanner s = new Scanner(System.in);
	private static String[] arr = new String[3];
	
	public static void main(String[] args) {
		
		int option;
		
		do {
			
			menu();
			option = Integer.parseInt(s.nextLine()); 
			
			switch(option) {
			
				case 1:
					adicionar();
					break;
				case 2:
					listar();
					break;
				case 3:
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opção inválida");
			}
			
		} while (option != 3);		
		
	}
	
	public static void menu() {
		System.out.println("Selecione uma das opções disponíveis: ");
		System.out.println("Adicionar 1:");
		System.out.println("Listar 2:");
		System.out.println("Sair 3:");
	}
	
	public static void adicionar() {
		for ( int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				String um = s.nextLine();
				arr[i] = um;
				break;
			}
		}
	}
	
	public static void listar() {
		System.out.println("Lista completa: ");
		for ( int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
