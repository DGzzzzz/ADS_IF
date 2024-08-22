package pesquisa;

import java.util.ArrayList;

public class PesquisaLinear {
    public static ArrayList<Integer> pesquisaLinear(int lista[], int chave) {
        ArrayList<Integer> listaAchados = new ArrayList<Integer>();
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == chave) {
                listaAchados.add(i);
            }
        }
        return listaAchados;
    }

    public static void main(String[] args) {
        int lista[] = { 10, 20, 30, 30, 30, 40, 55, 60, 70, 80, 30 };
        int chave = 30;
        ArrayList<Integer> listaAchados = pesquisaLinear( lista, chave);
        if (!listaAchados.isEmpty()) {
            System.out.println("Chave encontrada nas posições: " + listaAchados);
        } else {
            System.out.println("Chave não encontrada");
        }
    }
}
