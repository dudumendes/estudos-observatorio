package desi.observatorio;

public class Resposta {
	private Long id;
	private String texto;
	private Estado proximoEstado;
	
	public Resposta(Long id, String texto) {
		this.id = id;
		this.texto = texto;
	}
	
	public String toString() {
		return "Digite [" + this.id + "] para " + this.texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Estado getProximoEstado() {
		return proximoEstado;
	}

	public void setProximoEstado(Estado proximoEstado) {
		this.proximoEstado = proximoEstado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
