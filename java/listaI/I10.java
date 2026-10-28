package listaI;

import java.util.Scanner;
public class I10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare as variáveis
        int quantidade, maior=0, menor=0;

        // Leia a quantidade de números
        System.out.print("Digite a quantidade de números: ");
        quantidade = sc.nextInt();

        // Crie o for para ler os números
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = sc.nextInt();

            if (i == 0) {
                maior = numero;
                menor = numero;
            } else {
                if (numero > maior) {
                    maior = numero;
                }

                if (numero < menor) {
                    menor = numero;
                }
}
        }

        // Exiba os resultados
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        sc.close();
    }
}

