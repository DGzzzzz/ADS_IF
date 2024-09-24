package ex2;

public class Aluno {

    private String nome;
    private String sobrenome;
    private int matricula;

    public Aluno(String nome, String sobrenome, int matricula) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matricula = matricula;
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

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void imprimir() {
        System.out.println("Aluno: ");
        System.out.println("Nome: " + this.nome + " " + this.sobrenome);
        System.out.println("Matricula: " + this.matricula);
    }
}
