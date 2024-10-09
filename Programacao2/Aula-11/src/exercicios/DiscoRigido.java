package exercicios;

public class DiscoRigido extends Componente {
	
	private int capacidade;

	public DiscoRigido(String fabricante, String modelo, int capacidade) {
		super(fabricante, modelo);
		this.capacidade = capacidade;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Capacidade: " + this.capacidade);
	}
}
