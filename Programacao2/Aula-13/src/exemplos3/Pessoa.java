package exemplos3;

public class Pessoa implements Imprimivel {
	
	private String nome;
	private String sobrenome;
	
	public Pessoa(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	@Override
	public void imprimir() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Sobrenome: " + this.getSobrenome());
	}	
}
