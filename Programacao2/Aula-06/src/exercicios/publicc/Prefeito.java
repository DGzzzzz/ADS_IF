package exercicios.publicc;

public class Prefeito {
    public String nome;
    public int idade;
    public Partido partido;  

    public void imprimir() {
        System.out.println("Nome do prefeito: " + this.nome + " Idade: " + this.idade);
        this.partido.imprimir();
    }
}
