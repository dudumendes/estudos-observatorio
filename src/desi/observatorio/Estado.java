package desi.observatorio;

import java.util.List;

public class Estado {
	protected String nome;
	protected Processo processo;
	protected Pergunta pergunta;
	
	public Estado() {}
	
	public Estado(Pergunta pergunta) {
		this.pergunta = pergunta;
	}
	
	public void verificar() {
		System.out.println(this.pergunta.getEnunciado());
		for (Resposta resposta : pergunta.getRespostas()) {
			System.out.println(resposta);
		}
	}
	
	public void executar(Long id) {
		Estado proximoEstado = null;
		
		List<Resposta> respostas = pergunta.getRespostas();
		
		for (Resposta r : respostas) {
			if (r.getId() == id) {
				proximoEstado = r.getProximoEstado();
			}
		}
		
		if (proximoEstado != null) {
			this.processo.setEstado(proximoEstado);
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pergunta getPergunta() {
		return pergunta;
	}

	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}

	
	public Processo getProcesso() {
		return processo;
	}

	public void setProcesso(Processo processo) {
		this.processo = processo;
	}
	
}
