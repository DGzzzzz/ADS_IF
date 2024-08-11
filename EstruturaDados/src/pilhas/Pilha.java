package pilhas;

import java.util.Arrays;

public class Pilha<T> {
    private T[] elementos;
    private int tamanho;

    public Pilha(int capacidade) {
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public void push(int i) {
        elementos[tamanho] = (T) Integer.valueOf(i);
        tamanho++;
    }  

    @Override
    public String toString() {
        return "Pilha elementos=" + Arrays.toString(elementos) + ", tamanho=" + tamanho + "";
    }

}
