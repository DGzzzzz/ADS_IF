package exercicios.ex3;

public class Curso {
	
	public String nome;
    public String descricao;
    public String status;
    
	public Curso(String nome, String descricao, String status) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.status = status;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public void imprimir() {
		System.out.println("Nome: " + this.getNome() + "\nDescrição: " + this.getDescricao() + "\nStatus: " + this.getStatus());
	}
}
