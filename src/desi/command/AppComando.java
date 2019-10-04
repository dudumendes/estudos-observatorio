package desi.command;

public class AppComando {
	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		
		ComandoLampadaLigada cl = new ComandoLampadaLigada(lampada);
		
		ControleRemoto controle = new ControleRemoto(cl);
		
		controle.pressionarBotao();
		
		controle.setBotao(new ComandoAbrirPortao(new Portao()));
		
		controle.pressionarBotao();
	}
}
