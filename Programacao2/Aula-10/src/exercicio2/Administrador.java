package exercicio2;

public class Administrador extends Empregado {
	
	private double ajudaDeCusto;

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
		return "salário do admin R$" + calcularSalarioAdmin();
	}
}
