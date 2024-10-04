package exercicio2;

public class Empregado extends Pessoa {
	
	private Integer codigoSetor;
	private double salarioBruto;

	public Empregado(String nome, String email, String tel, Integer codigoSetor, double salarioBruto) {
        super(nome, email, tel);
        this.codigoSetor = codigoSetor;
		this.salarioBruto = salarioBruto;
	}

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
	
	public double calculaImposto() {
		double porcentagem = 4;
		return (salarioBruto * porcentagem) / 100;
	}
	
	public double calcularSalario() {
		double imposto = calculaImposto();
		return salarioBruto - imposto;
	}
	
	public String imprimeSalario() {
		return "Salário com imposto: R$" + calcularSalario();
	}

	public void imprimeEmpregado() {
		this.imprimeDadosPessoa();
		System.out.println("Setor: " + this.codigoSetor);
		System.out.println("Salario Bruto: " + this.salarioBruto);
	}
}
