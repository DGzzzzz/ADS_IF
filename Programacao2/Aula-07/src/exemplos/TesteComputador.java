package exemplos;

public class TesteComputador {

	public static void main(String[] args) {
		
		Computador pc = new Computador("Dell", "Modelo", "Intel");
		Computador pc2 = new Computador();

		System.out.println(pc.getMarca());
		System.out.println(pc.getModelo());
		System.out.println(pc.getProcessador());
		
		System.out.println(pc2.getMarca());
		System.out.println(pc2.getModelo());
		System.out.println(pc2.getProcessador());
	}

}
