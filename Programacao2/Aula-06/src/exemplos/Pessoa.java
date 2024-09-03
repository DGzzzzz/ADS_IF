package exemplos;

public class Pessoa {
    public String nome;
    public Endereco endereco; //endereco é o do tipo Endereco(classe)

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
    }
}
