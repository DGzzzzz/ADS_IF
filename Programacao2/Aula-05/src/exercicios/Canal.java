package exercicios;

public class Canal {
    public String nome;
    public String descricao;
    public int anoCriacao;

    public void imprimir() {
        System.out.println("Nome do canal: " + this.nome + "\nDescrição: " + this.descricao + "\nAno de criação: " + this.anoCriacao);
        System.out.println("--------");
    }
}
