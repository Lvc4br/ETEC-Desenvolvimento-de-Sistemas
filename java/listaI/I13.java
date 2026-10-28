package listaI;

public class I13 {
    public static void main(String[] args) {

        int soma = 0;
        int multiplicacao = 1;

        for (int i = 1; i <= 20; i++) {

            if (i % 2 == 1) {
                soma += i;
            } else {
                multiplicacao *= i;
            }

        }

        System.out.println("Soma dos números ímpares: " + soma);
        System.out.println("Multiplicação dos números pares: " + multiplicacao);
    }
}
