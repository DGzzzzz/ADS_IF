package exemplos.privatee;

public class Endereco {

    private String rua;
    private int numero;
    private String complemento;
    private String CEP;
    private String cidade;

    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getCEP() {
        return CEP;
    }
    public void setCEP(String cep) {
        CEP = cep;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
