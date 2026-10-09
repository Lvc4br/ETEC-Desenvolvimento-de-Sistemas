package listaF;

import java.util.Scanner;

public class F8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double valor1, valor2, valor3;
		
		System.out.println("Digite o 1º valor: ");
		valor1 = sc.nextDouble();
		System.out.println("Digite o 2º valor: ");
		valor2 = sc.nextDouble();
		System.out.println("Digite o 3º valor: ");
		valor3 = sc.nextDouble();
		
		if(valor1 <= valor2 && valor2 <= valor3){
            System.out.println(valor1 + " " + valor2 + " " + valor3);
		} else if (valor1 <= valor3 && valor3 <= valor2){
            System.out.println(valor1 + " " + valor2 + " " + valor3);
		} else if (valor2 <= valor1 && valor1 <= valor3){
            System.out.println(valor1 + " " + valor2 + " " + valor3);
        } else if (valor2 <= valor3 && valor3 <= valor1){
            System.out.println(valor1 + " " + valor2 + " " + valor3);
        } else if (valor3 <= valor1 && valor1 <= valor2){
            System.out.println(valor1 + " " + valor2 + " " + valor3);
        } else {
            System.out.println(valor1 + " " + valor2 + " " + valor3);
        }
	}

}
