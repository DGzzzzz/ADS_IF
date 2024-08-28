package exercicios;

public class Filme {
    public String nome;
    public String sinopse;
    public int anoLanc;

    public void imprimir() {
        System.out.println("Nome do filme: " + this.nome + "\nSinopse: " + this.sinopse + "\nAno do lançamento: " + this.anoLanc);
        System.out.println("--------");
    }
}
