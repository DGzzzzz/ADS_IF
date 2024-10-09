package exemplo2;

public class Eleitor extends Pessoa{
	
	private String titulo;
	
	public Eleitor(String nome, String titulo) {
		super(nome);
		this.titulo = titulo;
	}
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Titulo: " + this.titulo);
	}
}
