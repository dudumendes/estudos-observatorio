package desi.command;

public class SuperControle {
	Comando[] comandosOn = new Comando[2];
	Comando[] comandosOff = new Comando[2];
	
	public void setComando(int slot, Comando on, Comando off) {
		this.comandosOff[slot] = off;
		this.comandosOn[slot] = on;
	}
	
	public void pressionarBotaoOn(int slot) {
		comandosOn[slot].executar();
	}
	
	public void pressionarBotaoOff(int slot) {
		comandosOff[slot].executar();
	}
}
