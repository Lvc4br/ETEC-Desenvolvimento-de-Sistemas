package listaAExtra2;
import java.util.Scanner;

public class A5 {

    public static void main(String[] args) {
        double p1, p2, p3, media;
        Scanner leia = new Scanner(System.in);

        System.out.println("escreva a nota da primeira prova;");
            p1 = leia.nextDouble();
            //p1 = leia.nextDouble(); * 2
        System.out.println("escreva a nota da segunda prova;");
            p2 = leia.nextDouble();
            //p2 = leia.nextDouble(); * 3
        System.out.println("escreva a nota da terceira prova;");
            p3 = leia.nextDouble();
            //p3 = leia.nextDouble(); * 5

        //media = (p1 + p2 + p3) / 3;
        media = ((p1*2) + (p2*3) + (p3*5)) / 10;
        System.out.printf("A média final do aluno é: %.2f%n ;", media);
    }
}