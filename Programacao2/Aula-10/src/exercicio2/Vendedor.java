package exercicio2;

public class Vendedor extends Empregado {
	
	private double valorVendas;

	public Vendedor(String nome, String email, String tel, Integer codigoSetor, double salarioBruto, double  valorVendas) {
		super(nome, email, tel, codigoSetor, salarioBruto);
		this.valorVendas = valorVendas;
	}

	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	
	public double calculaComissao() {
		double porcentagemComissao = 4;
		return (valorVendas * porcentagemComissao) / 100;
	}
	
	public double calcularSalarioVendedor() {
		return this.calcularSalario() + calculaComissao();
	}
	
	public String imprimirSalarioVendedor() {
		return "Salario com comissao: R$" + calcularSalarioVendedor();
	}

	public void imprimirDadosVendedor() {
		this.imprimeEmpregado();
		System.out.println("Valor de vendas: R$" + this.valorVendas);
		System.out.println(imprimirSalarioVendedor());
	}

}
