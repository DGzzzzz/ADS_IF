package exemplos;

import java.util.Arrays;

public class Exemplo2 {
	
	public static void main(String[] args) {
		String[] nomes = {"Douglas", "Matheus", "Jose", "Henrique"};
		
		Arrays.sort(nomes);
		
		for(String nome : nomes) {
			System.out.println("Nome: " + nome);
		}
		
		int index = Arrays.binarySearch(nomes, "Matheus");
		
		if(index < 0) {
			System.out.println("nao encontrado");
		} else {
			System.out.println("Encontrado no index " + index);
		}
	}
}
