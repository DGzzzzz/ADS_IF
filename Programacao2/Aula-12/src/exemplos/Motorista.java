package exemplos;

public class Motorista {
	
	private String nome;
	private int idade;
	
	public Motorista(String nome, int idade) throws Exception {
		this.setNome(nome);
		this.setIdade(idade);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if (nome.length() < 3) {
			throw new RuntimeException("nome com menos de 3 caracteres");
		}
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) throws Exception {
		if (idade < 18) {
			throw new Exception("Pode nao man");
		}
		this.idade = idade;
	}
}
