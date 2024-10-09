package exercicios;

public class Monitor extends Componente {
	
	private int resolucao;
	
	public Monitor(String fabricante, String modelo, int resolucao) {
		super(fabricante, modelo);
		this.resolucao = resolucao;
	}

	public int getResolucao() {
		return resolucao;
	}

	public void setResolucao(int resolucao) {
		this.resolucao = resolucao;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Resolução: " + this.resolucao);
	}
}
