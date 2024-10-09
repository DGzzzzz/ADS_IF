package exercicios2;

public class Camiseta extends Produto {
	
	private String marca;

	public Camiseta(String nome, double valor, String marca) {
		super(nome, valor);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Marca da camiseta: " + this.marca);
	}
}
