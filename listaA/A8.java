// package listaA;

import java.util.Scanner;

public class A8 {

	public static void main(String[] args) {
		double va, vb, suporte;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("O primeiro valor é:");
			va = leia.nextDouble();
		System.out.println("O segundo valor é:");
			vb = leia.nextDouble();
			suporte = va;
			va = vb;
			vb = suporte;
		System.out.println(" O valor A é:" + va );

	}

}
