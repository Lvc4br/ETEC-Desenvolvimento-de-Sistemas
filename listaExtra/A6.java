// package listaA;

import java.util.Scanner;

public class A5 {

    public static void main(String[] args) {
        double qs, qm;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a quantidade de carvão solicitada pela siderúrgica:");
        qs = leia.nextDouble();

        qm = qs / (0.98 * 0.97);

        System.out.println("Quantidade de carvão que deve ser extraída da mina: " + qm);
    }
}