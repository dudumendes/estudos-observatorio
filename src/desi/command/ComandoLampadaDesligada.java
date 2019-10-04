package desi.command;

public class ComandoLampadaDesligada implements Comando {
	
	Lampada lampada;
	
	public ComandoLampadaDesligada(Lampada lampada) {
		this.lampada = lampada;
	}
	
	@Override
	public void executar() {
		lampada.desligar();
	}

}
