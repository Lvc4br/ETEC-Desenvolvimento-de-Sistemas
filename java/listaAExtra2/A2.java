package listaAExtra2;
import java.util.Scanner;

public class A2 {

    public static void main(String[] args) {
        double pu, qt, total, debito, troco;
        Scanner leia = new Scanner (System.in);
        
        System.out.println("escreva o preço unitário;");
            pu = leia.nextDouble();
        
        System.out.println("escreva a quantidade;");
            qt = leia.nextDouble();

        System.out.println("escreva o valor do débito;");
            debito = leia.nextDouble();
        
        total = pu *qt;
        troco = total - debito;
        System.out.println("O valor total da compra é: " + total);
        System.out.println("O valor do débito é: " + debito);
        System.out.println("O valor do troco é: " + troco);
    }

}