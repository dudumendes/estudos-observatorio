package desi.command;

public class ControleRemoto {
	Comando botao;
	
	public ControleRemoto(Comando comando) {
		this.botao = comando;
	}
	
	public void pressionarBotao() {
		botao.executar();
	}
	
	public void setBotao(Comando comando) {
		this.botao = comando;
	}
}
