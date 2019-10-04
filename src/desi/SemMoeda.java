package desi;

public class SemMoeda implements Estado {
	MaquinaDeChiclete maquinaDeChiclete;
	
	public SemMoeda(MaquinaDeChiclete maquina) {
		this.maquinaDeChiclete = maquina;
	}
	
	@Override
	public void inserirMoeda() {
		System.out.println("Voce inseriu moeda");
		maquinaDeChiclete.setEstado(new ComMoeda(maquinaDeChiclete));
	}

	@Override
	public void devolverMoeda() {
		System.out.println("Voce nao inseriu moedas");
		
	}

	@Override
	public void acionarAlavanca() {
		System.out.println("Vc nao inseriu moedas");
		
	}

	@Override
	public void entregarChiclete() {
		System.out.println("Voce precisa pagar primeiro");
		
	}
	
	@Override
	public String toString() {
		return "Sem moeda: Esperando adicao de moeda - " + maquinaDeChiclete.quantidadeDeChicletes + " chicletes";
	}

}
