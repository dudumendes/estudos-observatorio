package desi;

public class App {
	public static void main(String[] args) {
		MaquinaDeChiclete maquina = new MaquinaDeChiclete(1);
		System.out.println(maquina);
		
		maquina.inserirMoeda();
		System.out.println(maquina);

		maquina.devolverMoeda();
		System.out.println(maquina);
		
		maquina.inserirMoeda();
		System.out.println(maquina);

		maquina.acionarAlavanca();
		System.out.println(maquina);
		
		maquina.devolverMoeda();
		System.out.println(maquina);
		
		maquina.entregarChiclete();
		System.out.println(maquina);
		
		maquina.inserirMoeda();
		System.out.println(maquina);

	}
}
