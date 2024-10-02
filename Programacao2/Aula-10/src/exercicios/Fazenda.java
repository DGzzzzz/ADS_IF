package exercicios;

public class Fazenda extends Imovel {
	
	public int ectares; 
	
	public void imprimirFazenda() {
		this.imprimirImovel();
		System.out.println(this.ectares);
	}
}
