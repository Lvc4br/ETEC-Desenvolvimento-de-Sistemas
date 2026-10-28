package listaI;

import java.util.Scanner;

public class I7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, totalAlunos, idade, soma = 0;
        double media;

        System.out.println("Digite o total de alunos: ");
        totalAlunos = sc.nextInt();

        for ( i = 1; i <= totalAlunos; i++) {
            System.out.println("Digite a idade do aluno: " + i);
            idade = sc.nextInt();
            soma += idade;
        }
        media = (double) soma / totalAlunos;
        System.out.println("A média de idade dos alunos é: " + media);

        sc.close();
    }
}
