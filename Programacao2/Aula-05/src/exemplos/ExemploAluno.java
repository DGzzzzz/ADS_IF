package exemplos;

public class ExemploAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Aluno aluno2 = new Aluno();
        
        aluno.nome = "Douglas";
        aluno.idade = 24;
        aluno.matricula = "230320302";
        // System.out.println("Nome: " + aluno.nome + " \nIdade: " + aluno.idade + " \nMatrícula: " + aluno.matricula);
        aluno.imprimir();

        System.out.println("-------------------------");

        aluno2.nome = "Tiago";
        aluno2.idade = 32;
        aluno2.matricula = "234352333";
        aluno2.imprimir();
    }
}
