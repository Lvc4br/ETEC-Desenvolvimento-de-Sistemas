package listaAExtra;
import java.util.Scanner;


public class A2 {
    
    public static void main(String[] args) {
        int te, vb, vn, vv;
        double percentualBrancos, percentualNulos, percentualValidos;

        Scanner leia = new Scanner (System.in);
        
        System.out.println("Digite o total de eleitores:");
            te = leia.nextInt();

        System.out.println("Digite o número de votos brancos:");
            vb = leia.nextInt();

        System.out.println("Digite o número de votos nulos:");
            vn = leia.nextInt();

        System.out.println("Digite o número de votos válidos:");
            vv = leia.nextInt();
     
        percentualBrancos = (double) vb / te * 100;
        percentualNulos = (double) vn / te * 100;
        percentualValidos = (double) vv / te * 100;

        System.out.println("Percentual de votos brancos: " + percentualBrancos);
        System.out.println("Percentual de votos nulos: " + percentualNulos);
        System.out.println("Percentual de votos válidos: " + percentualValidos);

    }
}