package listaA;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		double tf, tc ;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("A temperatura em centigrados:");
			tc = leia.nextDouble();
		tf = (9*tc+160)/5;
		System.out.println("A temperatura em fahrenheit " + tf +";");

	}

}
