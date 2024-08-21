package pesquisa;

import java.util.ArrayList;

public class PesquisaLinear {
    public static int pesquisaLinear(ArrayList<Integer> listaAchados,int lista[], int chave) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == chave) {
                if (listaAchados.isEmpty()) {
                    listaAchados.add(i);

                    int esquerda = i - 1;
                    while (esquerda >= 0 && lista[esquerda] == chave) {
                        listaAchados.add(esquerda);
                        esquerda--;
                    }

                    int direita = i + 1;
                    while (direita < lista.length && lista[direita] == chave) {
                        listaAchados.add(direita);
                        direita++;
                    }

                } else {
                    if (listaAchados.get(listaAchados.size() - 1) != i) {
                        listaAchados.add(i);
                    }
                }
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int lista[] = { 10, 20, 30, 30, 30, 40, 55, 60, 70, 80, 90 };
        int chave = 20;
        ArrayList<Integer> listaAchados = new ArrayList<Integer>();
        if (pesquisaLinear(listaAchados, lista, chave) != -1) {
            System.out.println("Chave encontrada nas posições: " + listaAchados);
        } else {
            System.out.println("Chave não encontrada");
        }
        
    }
}
