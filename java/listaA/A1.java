package listaA;
import java.util.Scanner;
/*Hello Word*/
//Hello Bianca, I'm Fred and Luca

public class A1 {

	public static void main(String[] args) {
		double num1, num2, num3, num4, mNum;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("escreva a primeira nota;");
			num1 = leia.nextDouble();
		System.out.println("escreva a segunda nota;");
			num2 = leia.nextDouble();
		System.out.println("escreva a terceira nota;");
			num3 = leia.nextDouble();
		System.out.println("escreva a quarta nota;");
			num4 = leia.nextDouble();
		
		mNum = (num1+num2+num3+num4)/4;
		
		System.out.println("O resultado da sua conta é "+ mNum + ";");
	}

}
