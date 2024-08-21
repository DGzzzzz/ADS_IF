package pesquisa;

import java.util.ArrayList;

public class PesquisaBinaria {
    public static int pesquisaBinaria(ArrayList<Integer> listaAchados, int lista[], int chave) {
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

                return meio;

            } else if (lista[meio] < chave) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int lista[] = { 10, 20, 30, 30, 30, 40, 55, 60, 70, 80, 90 };
        int chave = 30;
        ArrayList<Integer> listaAchados = new ArrayList<Integer>();
        if (pesquisaBinaria(listaAchados, lista, chave) != -1) {
            System.out.println("Chave encontrada nas posições: " + listaAchados);
        } else {
            System.out.println("Chave não encontrada");
        }
    }
}
