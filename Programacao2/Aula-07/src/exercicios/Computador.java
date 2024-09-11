package exercicios;

public class Computador {
	
	private String marca;
	private String modelo;
	private String processador;
	
	//Constructor
	public Computador() {
		this.marca = "Desconhecido";
		this.modelo = "Desconhecido";
		this.processador = "Desconhecido";
	}
	
	//Constructor com parametros
	public Computador(String marca, String modelo, String processador) {
		this.marca = marca;
		this.modelo = modelo;
		this.processador = processador;
	}

	//Getters and setters	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}
}
