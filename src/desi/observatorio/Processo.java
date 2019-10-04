package desi.observatorio;

public class Processo {
	private String reu;
	private String numero;
	
	private Estado estado;
	
	public Processo(String reu, String numero, Estado estado) {
		this.reu = reu;
		this.numero = numero;
		this.estado = estado;
		this.estado.setProcesso(this);
	}
	
	public void verificar() {
		System.out.println("=== PROCESSO: " + this.numero + "====");
		System.out.println("=== REU: " + this.reu + "====");
		System.out.println("=== Estado atual: " + this.estado + "====");
		estado.verificar();
	}
	
	public void executar(Long id) {
		estado.executar(id);
	}

	public String getReu() {
		return reu;
	}

	public void setReu(String reu) {
		this.reu = reu;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
}
