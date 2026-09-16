package listaA;
import java.util.Scanner;
/*Hello Word*/
//Hello Bianca, I'm Fred and Luca

public class A1 {

	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("escreva a primeira nota;");
			num1 = leia.nextInt();
		
		num2 = ++num1;
        num3 = num1++;
		
		System.out.println("O numero "+ num1 +"tem seu anteceçor é:"+ num2 + " e seu sucessor é: "+ num3);
	}

}
