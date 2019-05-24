package entities;

public class Perguntas {


	private String pergunta;
	private Respostas respostas;

	public Perguntas() {
	}

	public Perguntas(String pergunta, Respostas respostas) {
		this.pergunta = pergunta;
		this.respostas = respostas;
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public Respostas getRespostas() {
		return respostas;
	}

	public void setRespostas(Respostas respostas) {
		this.respostas = respostas;
	}
	
	@Override
	public String toString() {
		return "Questão: " + pergunta + "\n" + respostas;
	}
	
	

}
