package desi.command;

public class ComandoLampadaLigada implements Comando {
	
	Lampada lampada;
	
	public ComandoLampadaLigada(Lampada lampada) {
		this.lampada = lampada;
	}
	
	@Override
	public void executar() {
		lampada.ligar();
	}

}
