package listaAExtra;
import java.util.Scanner;

public class A4 {
    
    public static void main(String[] args) {
        double cf, ct;

        Scanner leia = new Scanner (System.in);

        System.out.println("Digite o custo de fábrica do carro:");
        cf = leia.nextDouble();

        ct = cf+(cf * 0.28)+(cf * 0.45);

        System.out.println("O custo final do carro é: R$ " + ct);
    }
}