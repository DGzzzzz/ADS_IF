public class App {
    public static void main(String[] args) {
        // Passo 1: Declarar a matriz
        int[][] matriz;

        // Passo 2: Inicializar a matriz com 3 linhas e 4 colunas
        matriz = new int[3][4];

        // Passo 3: Atribuir valores à matriz
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[0][3] = 4;

        matriz[1][0] = 5;
        matriz[1][1] = 6;
        matriz[1][2] = 7;
        matriz[1][3] = 8;

        matriz[2][0] = 9;
        matriz[2][1] = 10;
        matriz[2][2] = 11;
        matriz[2][3] = 12;

        // Passo 4: Acessar e imprimir valores da matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}