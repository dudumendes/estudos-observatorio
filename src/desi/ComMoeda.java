package desi;

public class ComMoeda implements Estado {
	MaquinaDeChiclete maquinaDeChiclete;

	public ComMoeda(MaquinaDeChiclete maquina) {
		this.maquinaDeChiclete = maquina;
	}

	@Override
	public void inserirMoeda() {
		System.out.println("Uma moeda ja foi adicionada");
	}

	@Override
	public void devolverMoeda() {
		maquinaDeChiclete.setEstado(new SemMoeda(maquinaDeChiclete));
		System.out.println("Sua moeda foi devolvida");
	}

	@Override
	public void acionarAlavanca() {
		maquinaDeChiclete.setEstado(new ChicleteVendido(maquinaDeChiclete));
		System.out.println("Seu chiclete a caminho");
	}

	@Override
	public void entregarChiclete() {
		System.out.println("Acione a alavanca, por favor");

	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Com moeda: " + maquinaDeChiclete.quantidadeDeChicletes + " chicletes"; 
	}

}
