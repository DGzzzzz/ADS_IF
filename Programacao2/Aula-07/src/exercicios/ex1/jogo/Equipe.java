package exercicios.ex1.jogo;

import exercicios.ex1.jogo.pessoas.Jogador;
import exercicios.ex1.jogo.pessoas.Treinador;

public class Equipe {
	
	private String nome;
	private Treinador treinador;
	private Jogador goleiro;
	private Jogador zagueiro;
	private Jogador alaDireito;
	private Jogador alaEsquerdo;
	private Jogador atacante;
	
	public Equipe() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Treinador getTreinador() {
		return treinador;
	}

	public void setTreinador(Treinador treinador) {
		this.treinador = treinador;
	}

	public Jogador getGoleiro() {
		return goleiro;
	}

	public void setGoleiro(Jogador goleiro) {
		this.goleiro = goleiro;
	}

	public Jogador getZagueiro() {
		return zagueiro;
	}

	public void setZagueiro(Jogador zagueiro) {
		this.zagueiro = zagueiro;
	}

	public Jogador getAlaDireito() {
		return alaDireito;
	}

	public void setAlaDireito(Jogador alaDireito) {
		this.alaDireito = alaDireito;
	}

	public Jogador getAlaEsquerdo() {
		return alaEsquerdo;
	}

	public void setAlaEsquerdo(Jogador alaEsquerdo) {
		this.alaEsquerdo = alaEsquerdo;
	}

	public Jogador getAtacante() {
		return atacante;
	}

	public void setAtacante(Jogador atacante) {
		this.atacante = atacante;
	}
}
