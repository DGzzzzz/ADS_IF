package exemplo4;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Carro> carros = new ArrayList<Carro>();
		
		carros.add(new Carro("Chevrolet", "Prisma"));
		carros.add(new Carro("Chevrolet", "Onix"));
		carros.add(new Carro("Fiat", "Toro"));
		
		for (int i = 0; i < carros.size(); i++) {
			System.out.println(carros.get(i).getMarca());
			System.out.println(carros.get(i).getModelo());
		}
	}
}
