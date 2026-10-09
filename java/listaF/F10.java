package listaF;

import java.util.Scanner;

public class F10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num1, num2, num3, num4, num5, maior, menor;
		
		System.out.println("Digite o 1º numero: ");
		num1 = sc.nextInt();
        System.out.println("Digite o 2º numero: ");
		num2 = sc.nextInt();
        System.out.println("Digite o 3º numero: ");
		num3 = sc.nextInt();
        System.out.println("Digite o 4º numero: ");
		num4 = sc.nextInt();
        System.out.println("Digite o 5º numero: ");
		num5 = sc.nextInt();

		// Descobrindo o maior 
        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
            maior = num1; 
        } else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
            maior = num2; 
        }else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
            maior = num3; 
        } else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
            maior = num4; 
        } else {
            maior = num5; 
        } 
        // Descobrindo o menor 
        if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
            menor = num1; 
        } else if (num2 <	num1 &&	num2 <	num3 &&	num2 <	num4 &&	num2 <	num5) {
            menor =	num2; 
        } else if (num3 <	num1 &&	num3 <	num2 &&	num3 <	num4 &&	num3 <	num5) {
            menor =	num3; 
        } else if (num4 <	num1 &&	num4 <	num2 &&	num4 <	num3 &&	num4 <	num5) {
            menor =	num4; 
        } else {
            menor =	num5; 
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

	}

}
