package exercicios;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número de vezes que será executado: ");
        int numeroVezes = Integer.parseInt(s.nextLine());

        if ( numeroVezes <=0 ) {
            System.out.println("Número de vezes inválido");
            s.close();
            return;
        }

        System.out.println("Digite um número: ");
        int primeiroNumero = Integer.parseInt(s.nextLine());
        int menor = primeiroNumero;
        int maior = primeiroNumero;

        for (int i = 1; i < numeroVezes; i++) {
            System.out.println("Digite um número: ");
            int numero = Integer.parseInt(s.nextLine());

            if (numero < menor) {
                menor = numero;
            } else if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O menor número digitado foi: " + menor);
        System.out.println("O maior número digitado foi: " + maior);

        s.close();
    }
}
