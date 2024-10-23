package exemplos2;

import java.util.ArrayList;

public class Ex2 {
	public static void main(String[] args) {
		Gerente gerente = new Gerente("Douglas", "1651256265", 12345.00, 540.00, 123.00);
		
		ArrayList<Empregado> empregados = new ArrayList<Empregado>();
		
		empregados.add(gerente);
		
		for (int i = 0; i < empregados.size(); i++) {
			System.out.println(empregados.get(i).calcularSalario());
		}
	}
}
