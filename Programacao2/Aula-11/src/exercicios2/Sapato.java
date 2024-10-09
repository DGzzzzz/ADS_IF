package exercicios2;

public class Sapato extends Produto {

	private String marca;
	private boolean colecao;
	
	public Sapato(String nome, double valor, String marca, boolean colecao) {
		super(nome, valor);
		this.marca = marca;
		this.colecao = colecao;		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isColecao() {
		return colecao;
	}

	public void setColecao(boolean colecao) {
		this.colecao = colecao;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Marca do sapato: " + this.marca);
		if(this.colecao == true) {
			System.out.println("É de coleção");
		} else {
			System.out.println("Não é de coleção");
		}
	}
}
