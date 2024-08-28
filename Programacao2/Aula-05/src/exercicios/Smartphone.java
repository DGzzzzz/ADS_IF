package exercicios;

public class Smartphone {
    public String marca;
    public int anoFabr;
    public String cor;

    public void imprimir() {
        System.out.println("Marca: " + this.marca + "\nCor: " + this.cor + "\nAno fabricação: " + this.anoFabr);
        System.out.println("--------");
    }
}
