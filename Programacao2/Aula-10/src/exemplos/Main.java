package exemplos;

public class Main {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		a1.nome = "Douglas";
		a1.sobrenome = "Winter";
		a1.curso = "ADS";
		a1.matricula = "123456";
		a1.endereco = "nao sei";

		Professor p1 = new Professor();
		p1.nome = "Moser";
		p1.sobrenome = "nao sei";
		p1.especializacao = "POO";
		p1.endereco = "nao sei";
		
		a1.imprimirAluno();
		p1.imprimirProfessor();
		
		/*
		
		System.out.println("Aluno: ");
		System.out.println("Nome: " + a1.nome + " - Sobrenome: " + a1.sobrenome + " - Curso: " + a1.curso + " - Matricula: " + a1.matricula);
		
		System.out.println("Professor: ");
		System.out.println("Nome: " + p1.nome + " - Sobrenome: " + p1.sobrenome + " - Especializacao: " + p1.especializacao);
		
		*/
	}

}
