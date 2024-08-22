package pesquisa;

import java.util.ArrayList;
import java.util.Collections;

public class PesquisaBinaria {
    public static ArrayList<Integer> pesquisaBinaria(ArrayList<Integer> listaAchados, int lista[], int chave) {
        int inicio = 0;
        int fim = lista.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (lista[meio] == chave) {
                listaAchados.add(meio);

                int esquerda = meio - 1;
                while (esquerda >= 0 && lista[esquerda] == chave) {
                    listaAchados.add(esquerda);
                    esquerda--;
                }

                int direita = meio + 1;
                while (direita < lista.length && lista[direita] == chave) {
                    listaAchados.add(direita);
                    direita++;
                }

                inicio = meio + 1;
                fim = meio - 1;

            } else if (lista[meio] < chave) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        Collections.sort(listaAchados);
        return listaAchados;
    }

    public static void main(String[] args) {
        int lista[] = { 10, 30, 30, 30, 30, 30, 55, 60, 70, 80, 90 };
        int chave = 30;
        ArrayList<Integer> listaAchados = new ArrayList<Integer>();
        pesquisaBinaria(listaAchados, lista, chave);
        if (!listaAchados.isEmpty()) {
            System.out.println("Chave encontrada nas posições: " + listaAchados);
        } else {
            System.out.println("Chave não encontrada");
        }
    }
}
