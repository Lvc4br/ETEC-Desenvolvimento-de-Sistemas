package listaAExtra2;
import java.util.Scanner;

public class A9 {

    public static void main(String[] args) {
        int diasAtraso;
        double taxa, valor, prestacao;
        Scanner leia = new Scanner(System.in);

        System.out.println("Escreva o valor da prestação:");
            valor = leia.nextInt();

        System.out.println("Escreva a quantidade de dias em atraso:");
            diasAtraso = leia.nextInt();

        System.out.println("Escreva a taxa de juros:");
            taxa = leia.nextDouble();
        
        prestacao = valor+(valor*(taxa/100)*diasAtraso);

        System.out.println("O valor da prestação com juros é: " + prestacao);
    }

}