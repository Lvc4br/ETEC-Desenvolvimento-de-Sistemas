package listaAExtra2;
import java.util.Scanner;

public class A3 {

    public static void main(String[] args){
        int km;
        double litros, consumo;
        Scanner leia = new Scanner(System.in);

        System.out.println("escreva a quantidade de km percorridos;");
            km = leia.nextInt();

        System.out.println("escreva a quantidade de litros consumidos;");
            litros = leia.nextDouble();

        consumo = km / litros;

        System.out.println("A quantidade de km percorridos é: " + km);
        System.out.println("A quantidade de litros consumidos é: " + litros);
        System.out.println("O consumo do carro é: " + consumo + " km/l");
    }
}