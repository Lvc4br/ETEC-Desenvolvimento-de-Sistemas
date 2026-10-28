package listaI;

public class I2 {
    public static void main(String[] args) {
        // Ordem crescente: a até z
        for (char letra = 'a'; letra <= 'z'; letra++) {
            System.out.print(letra + " ");
        }

        System.out.println("\n");

        // Ordem decrescente: z até a
        for (char letra = 'z'; letra >= 'a'; letra--) {
            System.out.print(letra + " ");
        }
    }
}
