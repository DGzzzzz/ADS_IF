package exercicios;

public class Curso {
    public String nome;
    public String descricao;
    public String status;

    public void imprimir() {
        System.out.println("Nome do curso: " + this.nome + "\nDescrição: " + this.descricao + "\nStatus: " + this.status);
        System.out.println("--------");
    }
}
