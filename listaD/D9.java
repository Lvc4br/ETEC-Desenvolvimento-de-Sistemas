package listaD;

import java.util.Scanner;

public class D9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		double sa, cd, sn, rea, c1=1, c2=2, c3=3 ;
		System.out.println("Informe o salário atual do funcionário:");
		sa = sc.nextDouble();
		System.out.println("Digite o código da função:");
		cd = sc.nextDouble();
		if (cd == c1) {
			rea = (sa / 100) * 5;
			sn = sa + rea;
			System.out.println("Novo salário: " + sn);
			System.out.println("Salário antigo: " + sa);
			System.out.println("Valor do reajuste: " + rea);
			System.out.println("Função: Operador.");
		}if (cd == c2) {
			rea = (sa / 100) * 10;
			sn = sa + rea;
			System.out.println("Novo salário: " + sn);
			System.out.println("Salário antigo: " + sa);
			System.out.println("Valor do reajuste: " + rea);
			System.out.println("Função: Programador.");
		}if(cd == c3){
			rea = (sa / 100) * 15;
			sn = sa + rea;
			System.out.println("Novo salário: " + sn);
			System.out.println("Salário antigo: " + sa);
			System.out.println("Valor do reajuste: " + rea);
			System.out.println("Função: Analista.");
		}

		
	}

}
