// package listaA;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		double l1, l2, area;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("O primeiro lado do retângul é:");
		l1 = leia.nextDouble();
		System.out.println("O segundo lado do retângul é:");
		l2 = leia.nextDouble();
		
		area = (l1*l2);
		
		System.out.println("A área do retângulo é:" + area + ";");
		

	}

}
