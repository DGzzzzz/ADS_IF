package ex2;

public class Disciplina {
    
    private String nome;
    private Professor professor;

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void imprimir() {
        System.out.println("Disciplina: ");
        System.out.println("Nome: " + this.nome);
        this.professor.impirmir();
    }
}
