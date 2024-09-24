package ex2;

public class Curso {

    private String nome;
    private Disciplina disciplina;
    private Aluno aluno;

    public Curso(String nome, Disciplina disciplina, Aluno aluno) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.aluno = aluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void impirmir() {
        System.out.println("Curso: ");
        System.out.println("Nome: " + this.nome);
        this.disciplina.imprimir();
        this.aluno.imprimir();
    }
}
