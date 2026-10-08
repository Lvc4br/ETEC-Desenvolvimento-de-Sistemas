package listaAExtra2;
import java.util.Scanner;

public class A1 {

    public static void main(String[] args) {
        double lar, com, area;
        Scanner leia = new Scanner (System.in);

        System.out.println("valor do metro quadrado do terreno;");
            double valor = leia.nextDouble();
        
        System.out.println("escreva a largura do terreno;");
            lar = leia.nextDouble();
        
        System.out.println("escreva o comprimento do terreno;");
            com = leia.nextDouble();
        
        area = lar * com;
        
        System.out.println("A área do terreno é: " + area);
        System.out.println("O valor do terreno é: " + (area * valor));  
    }

}