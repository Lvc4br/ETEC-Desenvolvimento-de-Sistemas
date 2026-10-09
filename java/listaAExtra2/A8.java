package listaAExtra2;

import java.util.Scanner;

public class A8 {

    public static void main(String[] args) {

        double tp, qp, vp, totalPago, saldoDevedor;

        Scanner leia = new Scanner(System.in);

        System.out.println("Escreva o número total de prestações:");
        tp = leia.nextDouble();

        System.out.println("Escreva o número de prestações pagas:");
        qp = leia.nextDouble();

        System.out.println("Escreva o valor da prestação atual:");
        vp = leia.nextDouble();

        totalPago = qp * vp;

        saldoDevedor = (tp - qp) * vp;

        System.out.println("Total pago: " + totalPago);
        System.out.println("Saldo devedor: " + saldoDevedor);
    }
}