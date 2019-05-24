package entities;

public class Respostas {
	
	private String opcaoA;
	private String opcaoB;
	private String opcaoC;
	private String opcaoD;
	private char opcaoCorreta;
		
	public Respostas(String opcaoA, String opcaoB, String opcaoC, String opcaoD, char opcaoCorreta) {
		this.opcaoA = opcaoA;
		this.opcaoB = opcaoB;
		this.opcaoC = opcaoC;
		this.opcaoD = opcaoD;
		this.opcaoCorreta = opcaoCorreta;
	}

	public String getOpcaoA() {
		return opcaoA;
	}

	public void setOpcaoA(String opcaoA) {
		this.opcaoA = opcaoA;
	}

	public String getOpcaoB() {
		return opcaoB;
	}

	public void setOpcaoB(String opcaoB) {
		this.opcaoB = opcaoB;
	}

	public String getOpcaoC() {
		return opcaoC;
	}

	public void setOpcaoC(String opcaoC) {
		this.opcaoC = opcaoC;
	}

	public String getOpcaoD() {
		return opcaoD;
	}

	public void setOpcaoD(String opcaoD) {
		this.opcaoD = opcaoD;
	}
	
	public char getOpcaoCorreta() {
		return opcaoCorreta;
	}

	public void setOpcaoCorreta(char opcaoCorreta) {
		this.opcaoCorreta = opcaoCorreta;
	}
	
	
	//Método de conferência de resposta//

	public void conferirResposta(char escolha, Jogador jogador) {
		if(escolha == opcaoCorreta) {
			System.out.println("Alternativa correta\n");
			jogador.contarPontos();
		}else
			System.out.println("Alternativa incorreta\n");
	}

	@Override
	public String toString() {
		return "Alternativa A: " + opcaoA + "\nAlternativa B: " + opcaoB + "\nAlternativa C: " + opcaoC + "\nAlternativa D: " + opcaoD;
	}	

}
