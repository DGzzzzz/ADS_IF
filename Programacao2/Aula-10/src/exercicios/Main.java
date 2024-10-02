package exercicios;

public class Main {

	public static void main(String[] args) {

		Casa casa = new Casa();
		casa.valor = 12000;
		casa.propritario = "Cesar";
		casa.cor = "verde";
		
		casa.imprimirCasa();
		
		Fazenda fazenda = new Fazenda();
		fazenda.valor = 12000000;
		fazenda.propritario = "Gilberto";
		fazenda.ectares = 123;

		fazenda.imprimirFazenda();
	}

}
