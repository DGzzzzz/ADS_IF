package exercicio2;

public class Fornecedor extends Pessoa {
	
	private int valorDivida;
	private int valorCredito;
	
	public int getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(int valorDivida) {
		this.valorDivida = valorDivida;
	}

	public int getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(int valorCredito) {
		this.valorCredito = valorCredito;
	}

	public int obterSaldo() {
		return valorCredito - valorDivida;
	}
	
	public String imprimirSaldo() {
		return "" + obterSaldo();
	}
}
