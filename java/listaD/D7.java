package listaD;

import java.util.Scanner;

public class D7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int valor;
        
        System.out.println("Digite um número:");
        valor = sc.nextInt();
		
		if(valor < 5){
        	System.out.println(valor + " é menor que 5.");
        }if( valor > 10){
        	System.out.println(valor + " é maior que 10.");
        }if(valor >=5 && valor <=10){
        	System.out.println(valor + " está entre 5 e 10, inclusive.");
        }
	}

}
