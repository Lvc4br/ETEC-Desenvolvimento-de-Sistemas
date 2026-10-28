package listaI;

import java.util.Scanner;

public class I14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, fatorial = 1;

        System.out.print("Digite um número inteiro não negativo: ");
        numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Não é possível calcular o fatorial de um número negativo.");
        } else {
            for (int i = numero; i >= 1; i--) {
                fatorial *= i;
            }

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        sc.close();
    }
}