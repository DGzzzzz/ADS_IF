package exercicios3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(new Pessoa("Douglas", "3921839283", 24));
		pessoas.add(new Pessoa("Gabriela", "765857390", 24));
		pessoas.add(new Pessoa("Matheus", "7473421531", 25));

		for ( int i = 0; i < pessoas.size(); i++) {
			System.out.println("Nome: " + pessoas.get(i).getNome());
			System.out.println("CPF: " + pessoas.get(i).getCpf());
			System.out.println("Idade: " + pessoas.get(i).getIdade());
		}
	}
}
