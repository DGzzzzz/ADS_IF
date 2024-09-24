package ex2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite o nome do professor: ");
        String nomeProfessor = s.nextLine();
        System.out.println("Digite o sobrenome do professor: ");
        String sobrenomeProfessor = s.nextLine();
        System.out.println("Digite a especialidade do professor: ");
        String especialidadeProfessor = s.nextLine();

        System.out.println("Digite o nome da disciplina: ");
        String nomeDisciplina = s.nextLine();

        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = s.nextLine();
        System.out.println("Digite o sobrenome do aluno: ");
        String sobrenomeAluno = s.nextLine();
        System.out.println("Digite a matricula do aluno: ");
        int matriculaAluno = Integer.parseInt(s.nextLine());

        System.out.println("Digite o nome do curso: ");
        String nomeCurso = s.nextLine();

        Professor professor = new Professor(nomeProfessor, sobrenomeProfessor, especialidadeProfessor);
        Aluno aluno = new Aluno(nomeAluno, sobrenomeAluno, matriculaAluno);
        Disciplina disciplina = new Disciplina(nomeDisciplina, professor);
        Curso curso = new Curso(nomeCurso, disciplina, aluno);

        curso.impirmir();

        s.close();
    }
}
