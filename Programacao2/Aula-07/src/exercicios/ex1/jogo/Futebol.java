package exercicios.ex1.jogo;

import exercicios.ex1.jogo.equipamentos.Bols;
import exercicios.ex1.jogo.equipamentos.Campo;
import exercicios.ex1.jogo.pessoas.Juiz;

public class Futebol {
	
	private Equipe equipeAzul;
	private Equipe equipeVermelha;
	private Juiz juiz;
	private Campo campo;
	private Bols bola;
	
	public Futebol() {
		super();
	}
	

	public Equipe getEquipeAzul() {
		return equipeAzul;
	}

	public void setEquipeAzul(Equipe equipeAzul) {
		this.equipeAzul = equipeAzul;
	}

	public Equipe getEquipeVermelha() {
		return equipeVermelha;
	}

	public void setEquipeVermelha(Equipe equipeVermelha) {
		this.equipeVermelha = equipeVermelha;
	}

	public Juiz getJuiz() {
		return juiz;
	}

	public void setJuiz(Juiz juiz) {
		this.juiz = juiz;
	}

	public Campo getCampo() {
		return campo;
	}

	public void setCampo(Campo campo) {
		this.campo = campo;
	}

	public Bols getBola() {
		return bola;
	}

	public void setBola(Bols bola) {
		this.bola = bola;
	}
	
	public void imprimir() {
		System.out.println("Equipe 1: " + this.getEquipeAzul().getNome() + "\nEquipe 2: " + this.getEquipeVermelha().getNome());
		System.out.println("Juiz: " + this.getJuiz().getNome());
		System.out.println("Campo: \nComprimento: " + this.getCampo().getCompr() + "\nComprimento: " + this.getCampo().getLarg());
		System.out.println("Marca da bola: " + this.getBola().getMarca());
		System.out.println("Jogadores da equipe " + this.getEquipeAzul().getNome());
		System.out.println("Goleiro: " + this.getEquipeAzul().getGoleiro().getNome() + "\nZagueiro: " + this.getEquipeAzul().getZagueiro().getNome() + "\nAla Direita: " + this.getEquipeAzul().getAlaDireito().getNome() + "\nAla Esquerda: " + this.getEquipeAzul().getAlaEsquerdo().getNome() + "\nAtacante: " + this.getEquipeAzul().getAtacante().getNome());
		System.out.println("Jogadores da equipe " + this.getEquipeAzul().getNome());
		System.out.println("Goleiro: " + this.getEquipeVermelha().getGoleiro().getNome() + "\nZagueiro: " + this.getEquipeVermelha().getZagueiro().getNome() + "\nAla Direita: " + this.getEquipeVermelha().getAlaDireito().getNome() + "\nAla Esquerda: " + this.getEquipeVermelha().getAlaEsquerdo().getNome() + "\nAtacante: " + this.getEquipeVermelha().getAtacante().getNome());
	}	
}
