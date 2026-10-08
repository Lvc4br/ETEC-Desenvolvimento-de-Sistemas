// package listaA;

import java.util.Scanner;

public class A5 {

    public static void main(String[] args) {

        int cv;
        double vv, sf, vc;
        double salarioFinal;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o número de carros vendidos:");
        cv = leia.nextInt();

        System.out.println("Digite o valor total das vendas:");
        vv = leia.nextDouble();

        System.out.println("Digite o salário fixo:");
        sf = leia.nextDouble();

        System.out.println("Digite o valor recebido por carro vendido:");
        vc = leia.nextDouble();

        salarioFinal = sf+(cv * vc)+(vv * 0.05);

        System.out.println("O salário final do vendedor é: R$ " + salarioFinal);
    }
}