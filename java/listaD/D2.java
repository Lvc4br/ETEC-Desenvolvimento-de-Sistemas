package listaD;

import java.util.Scanner;

public class D2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int num1, num2=100;
		
		System.out.println("Informe um número:");
		num1 = leia.nextInt();
		
		if (num1 > num2) {
			System.out.println("O número é maior que 100.");
		}if(num1<num2) {
			System.out.println("O número é menor que 100.");
		}if(num1 == num2) {
			System.out.println("O número é igual a 100.");
		}
	}

}
