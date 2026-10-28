package listaI;
import java.util.Scanner;

public class I8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, totalFuncionarios, cod;
        double salario, reajuste, novosalario;
        
        System.out.println("Digite o total de funcionários: ");
        totalFuncionarios = sc.nextInt();

        for (i = 1; i <= totalFuncionarios; i++) {
            System.out.println("Digite o código do funcionário: " + i);
            cod = sc.nextInt();
            System.out.println("Digite o salário do funcionário: " + i);
            salario = sc.nextDouble();
            if(cod == 1) {
                reajuste = 5.0; // 5% de reajuste para funcionários com código 1
            } else if(cod == 2) {
                reajuste = 15.0; // 15% de reajuste para outros funcionários
            } else if(cod == 3) {
                reajuste = 25.0; // 25% de reajuste para outros funcionários
            } else if(cod == 4) {
                reajuste = 30.0; // 30% de reajuste para outros funcionários
            }else {
                System.out.println("Código inválido. O reajuste será de 0%.");
                reajuste = 0.0; // 0% de reajuste para códigos inválidos
            }
            novosalario = salario + (salario * (reajuste / 100));
            
            System.out.printf(
                "Funcionário %d (Código: %d)%nSalário antigo: R$ %.2f%nReajuste: R$ %.2f%nSalário novo: R$ %.2f%n",
                i, cod, salario, salario * (reajuste / 100), novosalario
            );
        }

        sc.close();
    }
}


