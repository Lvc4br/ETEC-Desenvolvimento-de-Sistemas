// package listaA;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
	double ht, vh, pd, sb, td, sl;
	Scanner leia = new Scanner (System.in);
	
	System.out.println("As horas trabalhadas do funcionário é:");
	ht = leia.nextDouble();
	System.out.println("O valor da hora trabalhada é:");
	vh = leia.nextDouble();
	System.out.println("O percentual de desconto é:");
	pd = leia.nextDouble();
	sb = (ht*vh);
	td = ((pd/100)*sb);
	sl = (sb-td);
	System.out.println("O salário líqiuido é:" + sl + ";");
	System.out.println("O salário bruto é:" + sb + ";");
	System.out.println("O desconto total é:" + td + ";");
	}

}
