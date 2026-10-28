package listaI;

import java.util.Scanner;

public class I5 {
    public static void main(String[] args) {
        int aluno, n1, n2, n3, n4;
        double media;
        Scanner sc = new Scanner(System.in);

        
        for (aluno = 1; aluno <= 10; aluno++) {
            System.out.println("Digite a primeira nota do aluno: ");
            n1 = sc.nextInt();
            System.out.println("Digite a segunda nota do aluno: ");
            n2 = sc.nextInt();
            System.out.println("Digite a terceira nota do aluno: ");
            n3 = sc.nextInt();
            System.out.println("Digite a quarta nota do aluno: ");
            n4 = sc.nextInt();

            media = (n1 + n2 + n3 + n4) / 4.0;
            System.out.println("Média do aluno " + aluno + ": " + media);
        }
        sc.close();
    }
}
