package exemplos.privatee;

public class Pessoa {

    private String nome;
    private int idade;

    private Endereco end;

    //Serve para alterar o valor do atributo
    //Sets não retornam nada, somente setam valores nos atributos, tem parametro
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Get serve para retornar o valor do atributo
    //Gets não tem parametros, apenas retorno
    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        if(idade >= 0) {
            this.idade = idade;
        }
    }

    public int getIdade() {
        return this.idade;
    }
    
    public void setEnd(Endereco end) {
        this.end = end;
    }

    public Endereco getEnd() {
        return end;
    }
}
