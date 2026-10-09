// package listaA;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		double vol, raio, alt;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Valor do raio:");
			raio = leia.nextDouble();
		System.out.println("Valor Altura:");
			alt = leia.nextDouble();
		
		vol =(3.14159*raio*raio*alt);
		System.out.println("O volume é "+ vol + ";");
		
	}

}
