package ex1;

public class Cidade {

    private String nome;
    private String estado;
    private int habitantes;

    public Cidade(String nome, String estado, int habitantes) {
        this.nome = nome;
        this.estado = estado;
        this.habitantes = habitantes;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public int getHabitantes() {
        return habitantes;
    }
    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }    

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Estado: " + this.estado);
        System.out.println("Habitantes: " + this.habitantes);
    }
}
