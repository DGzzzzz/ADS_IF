package ex1;

public class Filme {

    private String nome;
    private Diretor diretor;
    private Cidade cidade;

    public Filme(String nome, Diretor diretor, Cidade cidade) {
        this.nome = nome;
        this.diretor = diretor;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Diretor getDiretor() {
        return diretor;
    }
    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }
    public Cidade getCidade() {
        return cidade;
    }
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        this.diretor.imprimir();
        this.cidade.imprimir();
    }
}
