package exercicios;

public class Casa extends Imovel {
	
	public String cor;
	
	public void imprimirCasa() {
		this.imprimirImovel();
		System.out.println(this.cor);
	}
}
