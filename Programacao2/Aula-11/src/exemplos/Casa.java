package exemplos;

public class Casa extends Imovel {
	
	private double area;
	private int numeroPisos;
	
	public Casa(double valor, String latitude, String longitude, double area, int numeroPisos) {
		super(valor, latitude, longitude);
		this.area = area;
		this.numeroPisos = numeroPisos;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public int getNumeroPisos() {
		return numeroPisos;
	}

	public void setNumeroPisos(int numeroPisos) {
		this.numeroPisos = numeroPisos;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println(this.area);
		System.out.println(this.numeroPisos);
	}
	
}
