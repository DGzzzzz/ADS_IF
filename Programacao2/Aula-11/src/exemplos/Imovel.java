package exemplos;

public class Imovel {
	
	private double valor;
	private String latitude;
	private String longitude;
	
	
	public Imovel(double valor, String latitude, String longitude) {
		super();
		this.valor = valor;
		this.latitude = latitude;
		this.longitude = longitude;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public String getLatitude() {
		return latitude;
	}


	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}


	public String getLongitude() {
		return longitude;
	}


	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	public void imprimir() {
		System.out.println("R$" + this.valor);
		System.out.println(this.latitude + " - " + this.longitude);
	}
}
