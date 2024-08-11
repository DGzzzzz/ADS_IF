package pilhas;

public class App {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>(10);
        pilha.push(1);
        pilha.push(2);
        System.out.println(pilha);
    }
}
