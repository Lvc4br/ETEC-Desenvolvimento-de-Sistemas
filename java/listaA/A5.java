package listaA;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
	double p, d, pv;
	Scanner leia = new Scanner (System.in);
	
	System.out.println("O preço bruto do produto é:");
		p = leia.nextDouble();
		d = ((p/100)*10);
		System.out.println("O desconto do produto é:" + d );
		pv = (p-d);
		System.out.println("O preço líquido do produto é:" + pv + ";");
	}

}
