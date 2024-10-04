package exercicio2;

public class Operario extends Empregado {

	private double valorProducao;

	public Operario(String nome, String email, String tel, Integer codigoSetor, double salarioBruto, double valorProducao) {
		super(nome, email, tel, codigoSetor, salarioBruto);
		this.valorProducao = valorProducao;
	}

	public double getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	
	public double calcularComissaoOperador() {
		double porcentagemComissao = 4;
		return (valorProducao * porcentagemComissao) / 100;
	}
	
	public double calcularSalarioOperario() {
		return this.calcularSalario() + calcularComissaoOperador();
	}
	
	public String imprimirSalarioOperario() {
		return "Salário do operador: R$" + calcularSalarioOperario();
	}

	public void imprimirDadosOperador() {
		this.imprimeEmpregado();
		System.out.println("Valor de produção: " + this.valorProducao);
		System.out.println(imprimirSalarioOperario());
	}
}
