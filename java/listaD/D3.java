package listaD;

import java.util.Scanner;

public class D3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int num1;
		
		System.out.println("Digite o código do departamento:");
		num1 = leia.nextInt();
		
		if (num1 == 1) {
			System.out.println("Departamento: Expedição.");
		}if(num1 == 2) {
			System.out.println("Departamento: Recursos Humanos.");
		}if(num1 == 3) {
			System.out.println("Departamento: Logística.");
		}if(num1 == 4) {
			System.out.println("Departamento: Contabilidade.");
		}
	}

}
