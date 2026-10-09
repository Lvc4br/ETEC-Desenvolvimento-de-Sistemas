package listaF;

import java.util.Scanner;

public class F7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double l1, l2, l3;
		
		System.out.println("Digite o tamanho do lado 1: ");
		l1 = sc.nextDouble();
		System.out.println("Digite o tamanho do lado 2: ");
		l2 = sc.nextDouble();
		System.out.println("Digite o tamanho do lado 3: ");
		l3 = sc.nextDouble();
		
		if(l1 < l2 + l3 && l2 < l1 + l3 && l3 < l1 + l2){
			if (l1 == l2 && l2 == l3) {
				System.out.println("Triângulo equilátero."); 
			} else if (l1 == l2 || l1 == l3 || l2 == l3){
				System.out.println("Triângulo isósceles."); 
			} else {
				System.out.println("Triângulo escaleno."); 
			}
		} else {
			System.out.println("Não é um triângulo.");
		}
	}

}
