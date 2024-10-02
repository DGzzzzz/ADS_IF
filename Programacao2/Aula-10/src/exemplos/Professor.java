package exemplos;

public class Professor extends Pessoa{
	
	public String especializacao;
	
	public void imprimirProfessor() {
		this.imprimirPessoa();
		System.out.println(this.especializacao);
	}
}
