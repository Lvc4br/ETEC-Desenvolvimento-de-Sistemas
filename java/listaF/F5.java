package listaF;

import java.util.Scanner;
public class F5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double sa, cd, sn, rea, c1=1, c2=2, c3=3, c4=4, c5=5,c6=6 ;
		System.out.println("O salário atual do funcionário é: ");
		sa = sc.nextDouble();
		System.out.println("Digite o numero do codigo: ");
		cd = sc.nextDouble();
		if (cd == c1) {
			rea = (sa / 100) * 5;
			sn = sa + rea;
			System.out.println("O novo Salario é: "+sn);
		}else if (cd == c2) {
			rea = (sa / 100) * 10;
			sn = sa + rea;
			System.out.println("O novo Salario é: "+sn);
		}else if(cd == c3){
			rea = (sa / 100) * 15;
			sn = sa + rea;
			System.out.println("O novo Salario é: "+sn);
		}else if(cd == c4){
			rea = (sa / 100) * 20;
			sn = sa + rea;
			System.out.println("O novo Salario é: "+sn);
		}else if(cd == c5){
			rea = (sa / 100) * 25;
			sn = sa + rea;
			System.out.println("O novo Salario é: "+sn);
		}else {
			rea = (sa / 100) * 30;
			sn = sa + rea;
			System.out.println("O novo Salario é: "+sn);
		}

		System.out.println("O Salario antigo é: "+sa);
		System.out.println("O reajuste é: "+rea);
		System.out.println("O Salario novo é: "+sn);

	}

}
