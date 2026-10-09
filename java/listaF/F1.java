package listaF;

import java.util.Scanner;

public class F1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod;
		
		System.out.println("Informe o código do Departamento");
		cod = sc.nextInt();
		
		if (cod == 10) {
			System.out.println("Contabilidade");
		} else if (cod == 12) {
			System.out.println("Almoxarifado");
		}else if (cod == 14){
			System.out.println("Informática");
		}else {
			System.out.println("Código inválido!");
		}
		
	}
}



