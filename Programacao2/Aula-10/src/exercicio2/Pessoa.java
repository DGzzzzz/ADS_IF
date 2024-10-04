package exercicio2;

public class Pessoa {
	
	private String nome;
	private String email;
	private String tel;

	public Pessoa(String nome, String email, String tel) {
		this.nome = nome;
		this.email = email;
		this.tel = tel;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	public void imprimeDadosPessoa() {
		System.out.println("Nome: " + this.nome);
		System.out.println("E-mail: " + this.email);
		System.out.println("Tel: " + this.tel);
	}
}
