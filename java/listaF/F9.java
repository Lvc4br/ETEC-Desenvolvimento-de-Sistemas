package listaF;

import java.util.Scanner;

public class F9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int valor, resultado;
		
		System.out.println("Digite o numero que deseja calcular: ");
		valor = sc.nextInt();

		if ((valor % 4 == 0) && (valor % 5 == 0)) {
			System.out.println(valor);
		} else {
			System.out.println("Não é divisível por 4 e 5");
		}
		
	}

}
