package listaD;

import java.util.Scanner;

public class D5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		double A, B, C;
        
        System.out.println("Digite o valor de A:");
        A = sc.nextDouble();
        System.out.println("Digite o valor de B:");
        B = sc.nextDouble();
        System.out.println("Digite o valor de C:");
        C = sc.nextDouble();
        
        double auxiliar;
        if (A > B) {
            auxiliar = A;
            A = B;
            B = auxiliar;
        }
        if (B > C) {
            auxiliar = B;
            B = C;
            C = auxiliar;
        }
        if (A > B) {
            auxiliar = A;
            A = B;
            B = auxiliar;
        }

        System.out.println("Valores em ordem crescente: " + A + " " + B + " " + C);
		
	}

}
