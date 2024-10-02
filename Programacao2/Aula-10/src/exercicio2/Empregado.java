package exercicio2;

public class Empregado extends Pessoa {
	
	private Integer codigoSetor;
	private double salarioBruto;
	private double imposto;
	private double porcentagem;
	
	public Integer getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(Integer codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public double calculaImposto() {
		porcentagem = 4;
		return (salarioBruto * porcentagem) / 100;
	}
	
	public double calcularSalario() {
		return salarioBruto - imposto;
	}
	
	public String imprimeSalario() {
		return "salário de R$" + calcularSalario();
	}
}
