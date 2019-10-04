package desi.observatorio;

public class EstadoAudienciaDeCustodiaOcorrida extends Estado {
	public EstadoAudienciaDeCustodiaOcorrida() {
		this.pergunta = new Pergunta("Qual foi a decisao da audicencia");
		this.pergunta.addResposta(new Resposta(1L, "Liberdade Concedida"));
		this.pergunta.addResposta(new Resposta(2L, "Prisao Mantida"));		
	}
	
	public EstadoAudienciaDeCustodiaOcorrida(Pergunta pergunta) {
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
