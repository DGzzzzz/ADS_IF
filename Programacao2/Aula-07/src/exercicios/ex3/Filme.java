package exercicios.ex3;

public class Filme {
	
	private String nome;
    private String sinopse;
    private int anoLanc;    
    
	public Filme(String nome, String sinopse, int anoLanc) {
		super();
		this.nome = nome;
		this.sinopse = sinopse;
		this.anoLanc = anoLanc;
	}	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	public int getAnoLanc() {
		return anoLanc;
	}
	public void setAnoLanc(int anoLanc) {
		this.anoLanc = anoLanc;
	}
	
	public void imprimir() {
		System.out.println("Nome: " + this.getNome() + "\nSinopse: " + this.getSinopse() + "\nAno lançamento: " + this.getAnoLanc());
	}
 }
