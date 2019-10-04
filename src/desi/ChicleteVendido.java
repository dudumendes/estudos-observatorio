package desi;

public class ChicleteVendido implements Estado {
	MaquinaDeChiclete maquinaDeChiclete;

	public ChicleteVendido(MaquinaDeChiclete maquina) {
		this.maquinaDeChiclete = maquina;
	}

	@Override
	public void inserirMoeda() {
		System.out.println("Já tem moeda inserida");
		
	}

	@Override
	public void devolverMoeda() {
		System.out.println("Agora e tarde");

	}

	@Override
	public void acionarAlavanca() {
		System.out.println("Aguarde seu chiclete, a alavanca ja foi acionada");

	}

	@Override
	public void entregarChiclete() {
		maquinaDeChiclete.retirarUmChiclete();
		
		if (maquinaDeChiclete.temChiclete()) {
			maquinaDeChiclete.setEstado(new SemMoeda(maquinaDeChiclete));
		} else {
			maquinaDeChiclete.setEstado(new SemChiclete(maquinaDeChiclete));
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Chiclete Vendido: " + maquinaDeChiclete.quantidadeDeChicletes + " chicletes"; 
	}
}
