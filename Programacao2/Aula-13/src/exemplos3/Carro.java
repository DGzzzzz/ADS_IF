package exemplos3;

public class Carro implements Imprimivel, Ligavel {
	
	private String marca;

	public Carro(String marca) {
		super();
		this.marca = marca;
	}
		
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public void imprimir() {
		System.out.println("Marca: " + this.marca);
	}

	@Override
	public void ligar() {
		System.out.println("Ligando...");
	}

	@Override
	public void desligar() {
		System.out.println("Desligando...");
	}
}
