package listaF;

import java.util.Scanner;

public class F4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
double n1, n2, n3, n4, nSoma, nMedia, nExame, nRec;
		
		System.out.println("Digite a 1ª nota");
		n1 = sc.nextDouble();
		System.out.println("Digite a 2ª nota");
		n2 = sc.nextDouble();
		System.out.println("Digite a 3ª nota");
		n3 = sc.nextDouble();
		System.out.println("Digite a 4ª nota");
		n4 = sc.nextDouble();
		nSoma = (n1+n2+n3+n4);
		nMedia = (nSoma/4);
		
		if (nMedia >= 7) {
			System.out.println("Sua média foi " + nMedia + ". Parabéns, você foi aprovado!");
		
		}
		
		else if (nMedia < 7){
			System.out.println("Sua média foi " + nMedia + ".Você deverá realizar o exame.");
			System.out.println("Digite a nota do exame");
			nExame = sc.nextDouble();
			nRec = (nMedia+nExame);
			if (nRec >= 5) {
				System.out.println("Sua nota de recuperação foi " + nRec + ". Parabéns, você foi aprovado após realizar o exame de recuperação!");
			}
			else {
				System.out.println("Sua nota de recuperação foi " + nRec + ". Você foi reprovado por não atingir a meta.");
			}
		}
		else {
			System.out.println("Sua média foi " + nMedia + ". Você foi reprovado sem realizar o exame");
		}
		

	}

}
