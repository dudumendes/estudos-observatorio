package desi.command;

public class ComandoAbrirPortao implements Comando {
	Portao portao;
	
	public ComandoAbrirPortao(Portao portao) {
		this.portao = portao;
	}

	@Override
	public void executar() {
		portao.abrir();
		
	}

}
