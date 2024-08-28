package exercicios;

public class Casa {
    public String cor;
    public double valor;
    public int quartos;

    public void imprimir() {
        System.out.println("Essa casa de cor " + this.cor + " tem um valor de R$ " + this.valor + " e tem " + this.quartos + " quartos");
        System.out.println("--------");
    }

    public String vendido() {
        return " e foi vendida";
    }
}
