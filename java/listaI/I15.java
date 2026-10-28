package listaI;

import java.util.Scanner;

public class I15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base, expoente, resultado = 1;

        System.out.print("Digite a base: ");
        base = sc.nextInt();

        System.out.print("Digite o expoente: ");
        expoente = sc.nextInt();

        if (expoente < 0) {
            System.out.println("Digite um expoente não negativo.");
        } else {
            for (int i = 1; i <= expoente; i++) {
                resultado *= base;
            }

            System.out.println(base + " elevado a " + expoente + " é: " + resultado);
        }

        sc.close();
    }
}