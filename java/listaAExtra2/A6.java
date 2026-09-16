package listaAExtra2;
import java.util.Scanner;

public class A6 {

    public static void main(String[] args) {
        double saldo, deb1, deb2, deb3;
        Scanner leia = new Scanner(System.in);

        System.out.println("Escreva o saldo da conta:");
        saldo = leia.nextDouble();

        System.out.println("Escreva o valor do primeiro débito:");
        deb1 = leia.nextDouble();

        if (saldo >= deb1) {
            saldo -= deb1;
            System.out.println("Débito realizado.");
            System.out.println("Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o primeiro débito.");
        }

        System.out.println("Escreva o valor do segundo débito:");
        deb2 = leia.nextDouble();

        if (saldo >= deb2) {
            saldo -= deb2;
            System.out.println("Débito realizado.");
            System.out.println("Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o segundo débito.");
        }

        System.out.println("Escreva o valor do terceiro débito:");
        deb3 = leia.nextDouble();

        if (saldo >= deb3) {
            saldo -= deb3;
            System.out.println("Débito realizado.");
            System.out.println("Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o terceiro débito.");
        }

        System.out.println("Saldo final da conta: " + saldo);
    }

}
