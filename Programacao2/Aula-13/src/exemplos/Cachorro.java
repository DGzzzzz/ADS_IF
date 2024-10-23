package exemplos;

public class Cachorro extends Animal{
	
	private String cor;
	
	public Cachorro(String nome, String cor) {
		super(nome);
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public void emitirSom() {
		System.out.println("Auau");		
	}
}
