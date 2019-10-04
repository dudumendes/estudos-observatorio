package desi.command;

public class SuperAppComando {
	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		Portao portao = new Portao();
		
		ComandoLampadaLigada lampadaOn = new ComandoLampadaLigada(lampada);
		ComandoLampadaDesligada lampadaOff = new ComandoLampadaDesligada(lampada);
		
		ComandoAbrirPortao portaoOn = new ComandoAbrirPortao(portao);
		ComandoFecharPortao portaoOff = new ComandoFecharPortao(portao);
		
		SuperControle controle = new SuperControle();
		controle.setComando(0, lampadaOn, lampadaOff);
		controle.setComando(1, portaoOn, portaoOff);
		
		
		controle.pressionarBotaoOn(0);
		controle.pressionarBotaoOff(0);
		
		controle.pressionarBotaoOn(1);
		controle.pressionarBotaoOff(1);
		
	}
}
