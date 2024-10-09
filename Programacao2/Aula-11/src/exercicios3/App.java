package exercicios3;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	private static Scanner s = new Scanner(System.in);
	private static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

	public static void main(String[] args) {

		int option;

		do  {

			exibirMenu();
			option = Integer.parseInt(s.nextLine());

			switch (option) {
				case 0:
					System.out.println("Encerrando...");
					break;
				case 1:
					cadastrarPessoa();
					break;
				case 2:
					consultarPorCpf();
					break;
				case 3:
					consultarTodos();
					break;
				case 4:
					removerPorCpf();
					break;
				case 5:
					removerTodos();
					break;
				default:
					System.out.println("Opção invalida...");
			}

		} while (option != 0);

		s.close();
	}

	public static void exibirMenu() {

		System.out.println("================================");
		System.out.println("Sair: 0");
		System.out.println("Cadastrar: 1");
		System.out.println("Consulta por CPF: 2");
		System.out.println("Consultar todos: 3");
		System.out.println("Remover por cpf: 4");
		System.out.println("Remover todos: 5");
	}

	public static void cadastrarPessoa() {

		System.out.println("Nome: ");
		String nome = s.nextLine();
		System.out.println("CPF: ");
		String cpf = s.nextLine();
		System.out.println("Idade: ");
		Integer idade = Integer.parseInt(s.nextLine());

		pessoas.add(new Pessoa(nome, cpf, idade));
	}

	public static void consultarPorCpf() {

		System.out.println("Insira o CPF para consultar: ");
		String cpf = s.nextLine();
		Pessoa pessoa = pessoas.stream()
				.filter(p -> p.getCpf().equals(cpf))
				.findFirst()
				.orElse(null);

		if (pessoa != null) {
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("CPF: " + pessoa.getCpf());
			System.out.println("Idade: " + pessoa.getIdade());
		} else {
			System.out.println("CPF não encontrado");
		}
	}

	public static void consultarTodos() {

		pessoas.stream()
				.forEach(pessoa -> {
					System.out.println("Nome: " + pessoa.getNome());
					System.out.println("CPF: " + pessoa.getCpf());
					System.out.println("Idade: " + pessoa.getIdade());
				});
	}

	private static void removerPorCpf() {

		System.out.println("Insira o CPF para remover: ");
		String cpf = s.nextLine();

		Pessoa pessoaRemover = pessoas.stream()
				.filter(pessoa -> pessoa.getCpf().equals(cpf))
				.findFirst()
				.orElse(null);
		if (pessoaRemover != null) {
			pessoas.remove(pessoaRemover);
			System.out.println("Pessoa removida com sucesso.");
		} else {
			System.out.println("CPF não encontrado");
		}
	}

	public static void removerTodos() {

		if(pessoas.isEmpty()) {
			System.out.println("Não há pessoas para remover.");
		} else {
			pessoas.clear();
			System.out.println("Todas as Pessoas removidas com sucesso..");
		}
	}
}
