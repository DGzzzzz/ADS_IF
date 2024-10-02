package exercicio2;

public class Vendedor extends Empregado {
	
	private double valorVendas;
	private double porcentagemComissao;
	private double comissao;
	
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double calculaComissao() {
		porcentagemComissao = 4;
		return (valorVendas * porcentagemComissao) / 100;
	}
	
	public double calcularSalarioVendedor() {
		return this.calcularSalario() + calculaComissao();
	}
	
	public String imprimirSalarioVendedor() {
		return "R$" + calcularSalarioVendedor();
	}
}
