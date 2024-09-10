package exemplos;

public class Carro {
	
	private String placa;
	private String marca;
	private String modelo;
	private int ano;
	private String cor;
	private boolean automatico;
	private boolean bancoCouro;
	
	public Carro(
			String placa, 
			String marca, 
			String modelo, 
			int ano, 
			String cor, 
			boolean automatico,
			boolean bancoCouro
		) {
		
		super();
		
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.automatico = automatico;
		this.bancoCouro = bancoCouro;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

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

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isAutomatico() {
		return automatico;
	}

	public void setAutomatico(boolean automatico) {
		this.automatico = automatico;
	}

	public boolean isBancoCouro() {
		return bancoCouro;
	}

	public void setBancoCouro(boolean bancoCouro) {
		this.bancoCouro = bancoCouro;
	}	
}
