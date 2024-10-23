package exemplos2;

public class Gerente extends Empregado {
	
	private double descontos;
	private double comissao;
	private double salario;

	public Gerente(String nome, String cpf, double salario, double descontos, double comissao) {
		super(nome, cpf);
		this.descontos = descontos;
		this.comissao = comissao;
		this.salario = salario;
	}

	public double getDescontos() {
		return descontos;
	}

	public void setDescontos(double descontos) {
		this.descontos = descontos;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public double calcularSalario() {
		double salarioBruto = salario + comissao - descontos;
		return salarioBruto;
	}
	
}
