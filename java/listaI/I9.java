package listaI;

import java.util.Scanner;
public class I9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int SDN = 0,
        MAT = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.printf("Qual é a melhor saga de Filme %n 1) Senhor dos Anéis %n 2) Matrix %n escolha:" );
            String resposta = sc.nextLine();

            if (resposta.equals("Senhor dos Anéis")) {
                SDN++;
            } else if (resposta.equals("Matrix")) {
                MAT++;
            } else {
                System.out.println("Opção inválida. Por favor, digite 'Senhor dos Anéis' ou 'Matrix'.");
            }
        }

        if (SDN > MAT) {
            System.out.println("A saga Senhor dos Anéis é a mais votada!" + SDN);
        } else if (MAT > SDN) {
            System.out.println("A saga Matrix é a mais votada!" + MAT);
        } else {
            System.out.println("As duas sagas empataram!");
        }
        sc.close();
    }
}
