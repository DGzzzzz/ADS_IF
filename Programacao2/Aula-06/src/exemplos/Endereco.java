package exemplos;

public class Endereco {
    public String rua;
    public int numero;
    public String complemento;
    public String CEP;
    public String cidade;

    public void imprimirEnd() {
        System.out.println("Endereço ");
        System.out.println("Cidade: " + this.cidade + " Rua: " + this.rua + " Número: " + this.numero + " Complemento: " + this.complemento + " CEP: " + this.CEP);
    }
}
