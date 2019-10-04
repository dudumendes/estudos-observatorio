package desi.command;

public class ComandoFecharPortao implements Comando {
	Portao portao;
	
	public ComandoFecharPortao(Portao portao) {
		this.portao = portao;
	}

	@Override
	public void executar() {
		portao.fechar();
		
	}

}
