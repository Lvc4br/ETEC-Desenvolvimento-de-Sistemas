package listaI;

import java.util.Scanner;
    
public class I6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalAprovados = 0;
        int totalReprovados = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite a media do aluno: " + i);
            double media = sc.nextDouble();

            
            if (media >= 7) {
                System.out.println("Aluno aprovado!");
                totalAprovados++;
            } else {
                System.out.println("Aluno reprovado!");
                totalReprovados++;
            }
        }

        System.out.println("O total de alunos aprovados é: " + totalAprovados);
        System.out.println("O total de alunos reprovados é: " + totalReprovados);
        sc.close();
    }
}
