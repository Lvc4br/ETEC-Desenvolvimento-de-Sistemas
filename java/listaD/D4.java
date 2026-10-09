package listaD;

import java.util.Scanner;

public class D4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int num1, num2, res;
		
		System.out.println("Digite o primeiro número:");
		num1 = leia.nextInt();
		System.out.println("Digite o segundo número:");
		num2 = leia.nextInt();
		
		if (num1 > num2) {
			res = num1 - num2;
			System.out.println("A diferença entre o maior e o menor é: " + res);
		}
		if (num2 > num1) {
			res = num2 - num1;
			System.out.println("A diferença entre o maior e o menor é: " + res);
		}
		if (num1 == num2) {
			System.out.println("A diferença entre o maior e o menor é: 0");
		}
		
		
	}

}
