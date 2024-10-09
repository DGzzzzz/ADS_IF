package exercicios2;

public class Main {
	
	public static void main(String[] args) {
		
		Produto camiseta = new Camiseta("Camiseta", 139.99 ,"Nike");
		
		Comprador comprador = new Comprador("Douglas");
		
		comprador.consulta(camiseta);
	}
}
