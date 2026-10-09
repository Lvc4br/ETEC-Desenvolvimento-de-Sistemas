package listaAExtra2;
import java.util.Scanner;

public class A7 {

    public static void main(String[] args) {
        double sal = 1700, com = 0.15, venda, comissao, salarioFinal;
        Scanner leia = new Scanner(System.in);

        System.out.println("Escreva o valor das vendas do vendedor:");
            venda = leia.nextDouble();

        comissao = venda * com;
        salarioFinal = sal + comissao;

        System.out.println("Salário final do vendedor: " + salarioFinal);
    }

}