package exemplo2;

public class Prefeito extends Pessoa {
	
	private String partido;

	public Prefeito(String nome, String partido) {
		super(nome);
		this.partido = partido;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Partido: " + this.partido);
	}
}
