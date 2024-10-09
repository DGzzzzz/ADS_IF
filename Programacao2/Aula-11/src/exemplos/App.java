package exemplos;


public class App {

	public static void main(String[] args) {
		
		Imovel[] lista = new Imovel[3];
		
		lista[0] = new Casa(1500.00, "2", "3", 342.9, 2);
		lista[1] = new Edificio(30000.00, "4", "6", 74, true);
		lista[2] = new Edificio(90000.00, "7", "6", 774, false);
		
		for (int i = 0; i < lista.length; i++) {
			lista[i].imprimir();
		}
	}
}
