package exemplos;

//Aluno é uma subclase de Pessoa
//todo aluno é uma pessoa, mas nem toda pessoa é aluno
public class Aluno extends Pessoa { //Classe Aluno extende da classe Pessoa
	
	public String matricula;
	public String curso;
	
	public void imprimirAluno() {
		this.imprimirPessoa();
		System.out.println(this.matricula);
		System.out.println(this.curso);
	}
}
