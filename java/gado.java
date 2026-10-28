// package fazenda;

import java.util.Scanner;

public class gado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a quantidade total de bois no lote:");
        int totalBois = sc.nextInt();

        int totalAbate = 0, totalEngorda = 0, codigoMaisPesado = 0, codigoMenosPesado = 0;
        // Variáveis para controle do boi mais pesado e menos pesado
        double pesoMaisPesado = 0, pesoMenosPesado = 0;
        
        for (int i = 1; i <= totalBois; i++) {            
            System.out.println("\n--- Dados do Boi " + i + " ---");
            
            System.out.println("Informe o código do boi:");
            int codigo = sc.nextInt();
            
            System.out.println("Informe o peso do boi em kg:");
            double peso = sc.nextDouble();
            
            System.out.println("Informe a idade do boi (em meses):");
            int idade = sc.nextInt();
            
            // Verificação de Abate vs Engorda
            // Nota: O enunciado diz "se o peso ultrapassar 300kg". Vamos usar >= 300 para incluir o limite.
            if (peso >= 300 && idade >= 14) {
                System.out.println("Status:abate.");
                totalAbate++;
            } else {
                System.out.println("Status:engorda.");
                totalEngorda++;
            }
            
            // Lógica para descobrir o boi mais pesado e menos pesado
            if (i == 1) {
                // No primeiro boi, ele assume automaticamente os postos de mais e menos pesado
                codigoMaisPesado = codigo;
                pesoMaisPesado = peso;
                codigoMenosPesado = codigo;
                pesoMenosPesado = peso;
            } else {
                // Atualiza o mais pesado se encontrar um peso maior
                if (peso > pesoMaisPesado) {
                    pesoMaisPesado = peso;
                    codigoMaisPesado = codigo;
                }
                // Atualiza o menos pesado se encontrar um peso menor
                if (peso < pesoMenosPesado) {
                    pesoMenosPesado = peso;
                    codigoMenosPesado = codigo;
                }
            }
        } // Fim do for
        
        // Cálculos de percentuais
        double percentualAbate = (totalAbate * 100.0) / totalBois, percentualEngorda = (totalEngorda * 100.0) / totalBois;
        
        // Exibição do Relatório Final
		System.out.println("\n    Relatório Final    ");
        System.out.println("Total de bois prontos para abate: " + totalAbate);
        System.out.println("Total de bois na engorda: " + totalEngorda);
        System.out.printf("Percentual para abate: %.2f%%\n", percentualAbate);
        System.out.printf("Percentual na engorda: %.2f%%\n", percentualEngorda);
        System.out.println("Boi mais pesado -> Código: " + codigoMaisPesado + " | Peso: " + pesoMaisPesado + " kg");
        System.out.println("Boi menos pesado -> Código: " + codigoMenosPesado + " | Peso: " + pesoMenosPesado + " kg");
    
        
        sc.close();
    }
}