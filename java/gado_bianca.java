// package fazenda;

import java.util.Scanner;

public class gado_bianca {

	
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);// está sem fechamento,mas é possivel o uso do codigo sem o fechamento.
	int gado ;
	double pesado=0 , leve=0;
	
	System.out.println("Infrome a quantidade total de bois no lote");
	gado = sc.nextInt ();
	double porcentagem_Abatidos = (pesado*100)/gado;
	double porcentagem_Nao_Abatidos =(leve*100)/gado; //não precisava declarar em duas linhas, era possivel declarar em uma linha só, mas não tem problema.
		for(int i=1;i<= gado; i ++) {				
			System.out.println("Infrome o código do boi");
				int codigo = sc.nextInt();
			System.out.println("Infrome a idade do boi (em meses):");
				int idade = sc.nextInt();// não está sendo usado, mas poderia ser usado para validar se o boi está pronto para abate ou não.
			System.out.println("Infrome O peso do boi:");
				double peso = sc.nextInt();//double peso = sc.nextDouble();
				
			if (peso>=300) {
				System.out.println("O boi está pronto para abate" + " e o código do boi é: " + codigo);
				pesado++;
			}
			else {
				System.out.println("O boi não está pronto para abate" + " e o código do boi é: " + codigo);
				leve++;
			}
            // ============== não precisa ===============
			if( peso==pesado) {
				System.out.println("Quantidade " + pesado);
			}else if (peso==leve) {
				System.out.println("Quantidade " + leve);
			}
            //========================================
				porcentagem_Abatidos = (pesado*100)/gado;
	            porcentagem_Nao_Abatidos =(leve*100)/gado;
		}//for
		
		System.out.println("A porcentagem de bois abatidos é: " + porcentagem_Abatidos + "%");
		System.out.println("A porcentagem de bois que estão na engorda é: " + porcentagem_Nao_Abatidos + "%");
        //faltou o scanner.close(); //fechamento do scanner
}//void
}//public