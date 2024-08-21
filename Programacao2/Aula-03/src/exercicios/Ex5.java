package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[] valores = new int[5];
        ArrayList<Integer> valoresNegativos = new ArrayList<>();

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite um valor: ");
            valores[i] = s.nextInt();
            if (valores[i] < 0) {
                valoresNegativos.add(valores[i]);
            } 
        }

        if(valoresNegativos.isEmpty()) {
            System.out.println("Não há valores negativos.");
        } else {
            System.out.println("A lista contêm " + valoresNegativos.size() + " valores negativos:");
        }   
        
        for (int valor : valores) {
            if (valor >= 0 ) {
                System.out.println(valor);
            }
        }

        s.close();
    }
}
