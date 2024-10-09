package exemplos;

public class Edificio extends Imovel {
	
	private int numApartamentos;
	private boolean temHeliPorto;
	
	public Edificio(double valor, String latitude, String longitude, int numApartamentos, boolean temHeliPorto) {
		super(valor, latitude, longitude);
		this.numApartamentos = numApartamentos;
		this.temHeliPorto = temHeliPorto;
	}
	public int getNumApartamentos() {
		return numApartamentos;
	}
	public void setNumApartamentos(int numApartamentos) {
		this.numApartamentos = numApartamentos;
	}
	public boolean isTemHeliPorto() {
		return temHeliPorto;
	}
	public void setTemHeliPorto(boolean temHeliPorto) {
		this.temHeliPorto = temHeliPorto;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println(this.numApartamentos);
		if(this.temHeliPorto == true) {
			System.out.println("Tem Heliporto");
		} else {
			System.out.println("Não tem Heliporto");
		}
	}
}
