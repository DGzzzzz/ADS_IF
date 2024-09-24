package ex2;

public class Professor {

    private String nome;
    private String sobrenome;
    private String especialidade;

    public Professor(String nome, String sobrenome, String especialidade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void impirmir() {
        System.out.println("Professor: ");
        System.out.println("Nome: " + this.nome + " " + this.sobrenome);
        System.out.println("Especialidade: " + this.especialidade);
    }
}
