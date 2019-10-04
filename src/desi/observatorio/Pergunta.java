package desi.observatorio;

import java.util.ArrayList;
import java.util.List;

public class Pergunta {
	private String enunciado;
	
	private List<Resposta> respostas = new ArrayList<>();
	
	public Pergunta(String enunciado) {
		this.enunciado = enunciado;
	}
	
	public void addResposta(Resposta resposta) {
		respostas.add(resposta);
	}
	
	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public List<Resposta> getRespostas() {
		return respostas;
	}

	public void setRespostas(List<Resposta> respostas) {
		this.respostas = respostas;
	}
	
	
}
