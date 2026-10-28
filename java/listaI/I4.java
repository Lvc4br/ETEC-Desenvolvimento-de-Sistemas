package listaI;

import java.util.Scanner;

public class I4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i, num, result;

        System.out.println("Digite um numero: ");
        num = sc.nextInt();

        for (i = 0; i <= 10; i++) {
            result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }
        sc.close();
    }
}
