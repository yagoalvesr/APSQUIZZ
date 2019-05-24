package entities;

public class Jogador {

	private String nome;
	private Integer pontuacao;
	
	public Jogador(String nome) {
		this.nome = nome;
		this.pontuacao = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(Integer pontuacao) {
		this.pontuacao = pontuacao;
	}
	
	public int contarPontos() {
		pontuacao++;
		return pontuacao;
	}

	@Override
	public String toString() {
		return "Jogador: " + nome + "[Pontuação:" + pontuacao + "]";
	}
	
	
	

}
