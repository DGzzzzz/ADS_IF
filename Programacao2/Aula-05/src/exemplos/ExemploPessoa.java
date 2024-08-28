package exemplos;

public class ExemploPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Douglas";
        pessoa.idade = 24;

        pessoa.imprimir();
        pessoa.fazerAniversario();
        pessoa.imprimir();

        pessoa.falar("Olá");

        pessoa.calcular(22, 2);

        int m = pessoa.multiplicar(10, 2);
        System.out.println("Multiplicação: " + m);

        System.out.println(pessoa.idade());
    }
}
