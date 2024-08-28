package exercicios;

public class Animal {
    public String especie;
    public String cor;
    public String sexo;

    public void imprimir() {
        System.out.println("Espécie: " + this.especie + "\nCor: " + this.cor + "\nSexo: " + this.sexo);
        System.out.println("--------");
    }
}
