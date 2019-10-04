package desi.observatorio;

public class EstadoCadastrado extends Estado {
	public EstadoCadastrado() {
		this.pergunta = new Pergunta("Houve a audiência de custodia?");
		this.pergunta.addResposta(new Resposta(1L, "Sim"));
		this.pergunta.addResposta(new Resposta(2L, "Não"));
	}
	
	public EstadoCadastrado(Pergunta pergunta) {
		super(pergunta);
	}
	
	public void executar(Long id) {
		if (id == 1) {
			this.processo.setEstado(new EstadoAudienciaDeCustodiaOcorrida());
		} else if (id == 2) {
			this.processo.setEstado(new EstadoCadastrado());
		}
	}
}
