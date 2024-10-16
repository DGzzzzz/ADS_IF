package exemplos;

public class Teste3 {

	public static void main(String[] args) {
		
		try {
			Motorista m = new Motorista("Zéeee", 16);
			System.out.println(m);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
}
