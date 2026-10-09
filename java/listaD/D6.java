package listaD;
import java.util.Scanner;

public class D6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int valor;
        
        System.out.println("Digite um número entre 0 e 10:");
        valor = sc.nextInt();

        if(valor == 0){
        	System.out.println(valor + " - zero");
        }if(valor == 1){
        	System.out.println(valor + " - um");
        }if(valor == 2){
        	System.out.println(valor + " - dois");
        }if(valor == 3){
        	System.out.println(valor + " - três");
        }if(valor == 4){
        	System.out.println(valor + " - quatro");
        }if(valor == 5){
        	System.out.println(valor + " - cinco");
        }if(valor == 6){
        	System.out.println(valor + " - seis");
        }if(valor == 7){
        	System.out.println(valor + " - sete");
        }if(valor == 8){
        	System.out.println(valor + " - oito");
        }if(valor == 9){
        	System.out.println(valor + " - nove");
        }if(valor == 10){
        	System.out.println(valor + " - dez");
        }
	}

}
