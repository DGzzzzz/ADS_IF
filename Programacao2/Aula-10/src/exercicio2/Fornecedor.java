package exercicio2;

public class Fornecedor extends Pessoa {
	
	private double valorDivida;
	private double valorCredito;

	public Fornecedor(String nome, String email, String tel, double valorDivida, double valorCredito) {
		super(nome, email, tel);
		this.valorDivida = valorDivida;
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(int valorDivida) {
		this.valorDivida = valorDivida;
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(int valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double obterSaldo() {
		return valorCredito - valorDivida;
	}
	
	public String imprimirSaldo() {
		return "Saldo remanescente R$: " + obterSaldo();
	}

	public void imprimirDadosFornecedor() {
		this.imprimeDadosPessoa();
		System.out.println("Valor divida R$: " + this.valorDivida);
		System.out.println("Valor crédito R$: " + this.valorCredito);
	}
}
