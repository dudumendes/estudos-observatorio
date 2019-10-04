package desi.observatorio;

import java.util.Scanner;

public class Observatorio {
	public static void main(String[] args) {
		
		Processo p1 = new Processo("Eduardo", "OIU987", new EstadoCadastrado());
		
		p1.verificar();
		
		Scanner scan = new Scanner(System.in);
		
		Long resposta = scan.nextLong();
		
		p1.executar(resposta);
		
		p1.verificar();
		
		resposta = scan.nextLong();
		
		p1.executar(resposta);
		
		p1.verificar();
	}
}	
