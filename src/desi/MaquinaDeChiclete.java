package desi;

public class MaquinaDeChiclete {
	
	Estado estado = new SemChiclete(this);
	
	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	 int quantidadeDeChicletes = 0;
	
	public void retirarUmChiclete() {
		this.quantidadeDeChicletes--;
	}
	
	public boolean temChiclete() {
		return this.quantidadeDeChicletes > 0;
	}
	
	public MaquinaDeChiclete(int quantidade) {
		if (quantidade > 0) {
			this.quantidadeDeChicletes = quantidade;
			estado = new SemMoeda(this);
		}
	}
	
	public void inserirMoeda() {
		estado.inserirMoeda();
	}
	
	public void devolverMoeda() {
		estado.devolverMoeda();
	}
	
	public void acionarAlavanca() {
		estado.acionarAlavanca();
	}
	
	public void entregarChiclete() {
		estado.entregarChiclete();
	}
	
	public void reabastecer(int numChicletes) {
		this.quantidadeDeChicletes = numChicletes;
	}
	
	public String toString() {
		return "Estado da Maquina: " + this.estado 
				+ "\nQuantidade de Chicletes: " + this.quantidadeDeChicletes + "\n";
	}

}
