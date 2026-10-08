package listaD;

import java.util.Scanner;

//Desenvolva um programa para ler dois números e realizar a divisão do maior pelo 
//menor, apresentando o resultado. 

public class D8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		double valor, valor1, res;
		
		System.out.println("Digite o primeiro número:");
        valor = sc.nextDouble();
        System.out.println("Digite o segundo número:");
        valor1 = sc.nextDouble();
        
        double maior = valor;
        double menor = valor1;
        if (valor1 > valor) {
        	maior = valor1;
        	menor = valor;
        }

        if (menor != 0) {
        	res = maior / menor;
        	System.out.println("Resultado da divisão do maior pelo menor: " + res);
        }
        if (menor == 0) {
        	System.out.println("Não é possível dividir por zero.");
        }
	}

}
