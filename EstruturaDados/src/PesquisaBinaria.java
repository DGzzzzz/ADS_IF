public class PesquisaBinaria {
    public static void binary(int[] array, int item) {
        int baixo = 0;
        int alto = array.length - 1;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            int chute = array[meio];
            if (chute == item) {
                System.out.println("Item encontrado na posição " + meio);   
                return;             
            } 
            else if (chute > item) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }
        System.out.println("Item não encontrado");
    }

    public static void main(String[] args) {
        int[] array = { 1, 3, 5, 7, 9 };
        binary(array, 3);
    }
}
