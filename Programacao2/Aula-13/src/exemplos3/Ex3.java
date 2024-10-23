package exemplos3;

import java.util.ArrayList;

public class Ex3 {
	public static void main(String[] args) {
		
		ArrayList<Imprimivel> imp = new ArrayList<Imprimivel>();
		
		imp.add(new Carro("Mustang"));
		imp.add(new Pessoa("Douglas", "Winter"));
		
		for (int i = 0; i < imp.size(); i++) {
			imp.get(i).imprimir();
		}
	}
}
