package listaAExtra2;
import java.util.Scanner;

public class A4{

    public static void main(String[] args){
        double cf, rv = 0.25, im = 0.45 , total;
        Scanner leia = new Scanner(System.in);

        System.out.println("escreva o custo de fábrica para a produção do automovel: ");
            cf = leia.nextDouble();
        
        total = cf + (cf* rv) + (cf*im);
        System.out.printf("O custo final do carro é: %.2f%n ;", total);

        System.out.printf("O valor do revendedor é: %.2f e o valor do imposto é: %.2f%n ;",
            rv * cf,
            im * cf
        );
        
    }
}