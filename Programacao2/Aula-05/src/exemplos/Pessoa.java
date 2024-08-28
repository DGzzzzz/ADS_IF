package exemplos;

public class Pessoa {

    public String nome;

    public int idade;

    //Método sem parâmetro e sem retorno
    public void imprimir() {
        System.out.println(this.nome + " tem " + this.idade + " anos.");
    }

    //Método que pega a idade do objeto e adiciona mais 1
    public void fazerAniversario() {
        this.idade++;
    }

    //Método sem retorno , possui um parâmetro
    public void falar(String frase) {
        System.out.println(this.nome + " falou: " + frase);
    }

    public void calcular(int a, int b) {
        // System.out.print("A soma deu: ");
        // System.out.println(a + b);
        int soma = a + b;
        System.out.println("A soma deu: " + soma);
    }

    //Método com um retorno do tipo int e com dois parametros
    public int multiplicar(int a, int b) {
        int resultado = a * b;
        return resultado;
    }

    //Método com retorno de idade em string
    public String idade() {
        return "21 Anos";
    }
}
