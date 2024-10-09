package exercicios2;

public class Comprador {
	
	private String nome;
	
	public Comprador(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void consulta(Produto p) {
		System.out.print("O comprador " + this.nome + " consultou o produto " + p.getNome());
	}
}
