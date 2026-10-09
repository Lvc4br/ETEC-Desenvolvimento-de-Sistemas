package listaD;

import java.util.Scanner;

public class D1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Informe o primeiro valor:");
		num1 = leia.nextInt();
		System.out.println("Informe o segundo valor:");
		num2 = leia.nextInt();
		
		if (num1 > num2) {
			System.out.println("O primeiro valor é maior que o segundo.");
		}if(num1<num2) {
			System.out.println("O primeiro valor é menor que o segundo.");
		}if(num1 == num2) {
			System.out.println("Os dois valores são iguais.");
		}
	}

}
