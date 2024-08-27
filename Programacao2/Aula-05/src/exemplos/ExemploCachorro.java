package exemplos;

public class ExemploCachorro {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();

        cachorro.nome = "Bob";
        cachorro.cor = "Caramelo";
        cachorro.raca = "Cachorro caramelo";
        cachorro.idade = 7;

        // System.out.println("Nome: " + cachorro.nome + "\nCor: " + cachorro.cor + "\nRaça: " + cachorro.raca + "\nIdade: " + cachorro.idade);
        cachorro.imprimir();
    }
}
