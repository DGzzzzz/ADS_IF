package exercicio2;

public class Administrador extends Empregado {
	private double ajudaDeCusto;

	public Administrador(String nome, String email, String tel, Integer codigoSetor, double salarioBruto, double ajudaDeCusto) {
		super(nome, email, tel, codigoSetor, salarioBruto);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public double calcularSalarioAdmin() {
		return this.calcularSalario() + ajudaDeCusto;
	}
	
	public String imprimeSalarioAdmin() {
		return "sal�rio do admin R$" + calcularSalarioAdmin();
	}

	public void imprimeDadosAdm() {
		this.imprimeEmpregado();
		System.out.println("Ajuda de custo: R$" + this.ajudaDeCusto);
		System.out.println(imprimeSalarioAdmin());
	}
}
