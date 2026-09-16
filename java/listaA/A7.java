package listaA;

import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		double d, t, v, lu;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("O tempo gasto na viagem é:");
		t = leia.nextDouble();
		System.out.println("A velocidade média é:");
		v = leia.nextDouble();
		d = (t*v);
		lu = (d/12);
		System.out.println("O combustível utilizado foi:" + lu + ";");
		

	}

}
