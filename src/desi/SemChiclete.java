package desi;

public class SemChiclete implements Estado {
	MaquinaDeChiclete maquinaDeChiclete;

	public SemChiclete(MaquinaDeChiclete maquina) {
		this.maquinaDeChiclete = maquina;
	}

	@Override
	public void inserirMoeda() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void devolverMoeda() {
		throw new UnsupportedOperationException();

	}

	@Override
	public void acionarAlavanca() {
		throw new UnsupportedOperationException();

	}

	@Override
	public void entregarChiclete() {
		throw new UnsupportedOperationException();

	}

}
