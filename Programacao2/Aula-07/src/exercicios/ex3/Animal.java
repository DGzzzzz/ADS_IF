package exercicios.ex3;

public class Animal {
	
	private String especie;
    private String cor;
    private String sexo;
    
	public Animal(String especie, String cor, String sexo) {
		super();
		this.especie = especie;
		this.cor = cor;
		this.sexo = sexo;
	}

	public String getEspecie() {
		return especie;
	}


	public void setEspecie(String especie) {
		this.especie = especie;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void imprimir() {
		System.out.println("Especie: " + this.getEspecie() + "\nCor: " + this.getCor() + "\nSexo: " + this.getSexo());
	}
}
