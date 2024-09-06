package exercicios.publicc;

public class Cidade {
    public String nome;
    public int cod;
    public Prefeito prefeito;

    public void imprimir() {
        System.out.println("Nome da cidade: " + this.nome + " Cod. Nacional: " + this.cod);
        this.prefeito.imprimir();
    }
}
