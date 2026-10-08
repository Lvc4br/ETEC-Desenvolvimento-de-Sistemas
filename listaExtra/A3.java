// package listaAExtra;
import java.util.Scanner;


public class A3 {
    public static void main(String[] args) {
        int anos, mes, dias, tt;
        

        Scanner leia = new Scanner (System.in);
        
        System.out.println("Digite a quantidade de anos:");
            anos = leia.nextInt();
        System.out.println("Digite a quantidade de meses:");
            mes = leia.nextInt();
        System.out.println("Digite a quantidade de dias:");
            dias = leia.nextInt();

        tt = anos * 365 + mes * 30 + dias;

        System.out.println("O total de dias é: " + tt);

    }
}