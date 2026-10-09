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

        System.out.println("Escreva o valor do segundo débito:");
        deb2 = leia.nextDouble();

        System.out.println("Escreva o valor do terceiro débito:");
            deb3 = leia.nextDouble();

        double totalDebito = deb1 + deb2 + deb3;
        double saldoFinal = saldo - totalDebito;

        System.out.println("Saldo final da conta: " + saldoFinal);
    }

}