package exercicio2;

public class Operario extends Empregado {

	private double valorProducao;
	private double porcentagemComissao;
	private double comissao;
	
	public double getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double calcularComissaoOperador() {
		porcentagemComissao = 4;
		return (valorProducao * porcentagemComissao) / 100;
	}
	
	public double calcularSalarioOperario() {
		return this.calcularSalario() + calcularComissaoOperador();
	}
	
	public String imprimirSalarioOperario() {
		return "R$" + calcularSalarioOperario();
	}
}
