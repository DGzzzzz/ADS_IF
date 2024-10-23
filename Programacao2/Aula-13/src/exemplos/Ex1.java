package exemplos;

public class Ex1 {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro("Dog", "Caramelo");
		Gato g1 = new Gato("Ted", "Malhado");
		
		Animal[] animais = new Animal[3];
		
		animais[0] = c1;
		animais[1] = g1;
		animais[2] = new Gato("Flora", "branca");
		
		for (int i = 0; i < animais.length; i++) {
			animais[i].emitirSom();
		}
	}
}
