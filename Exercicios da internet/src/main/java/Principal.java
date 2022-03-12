import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mediaSalarial = 0;
        System.out.println("Entre com o numero de funcionarios da empresa: ");
        int i = input.nextInt();
        double salario [];
        salario = new double[10];
        String grade[];
        grade = new String[10];
        for(int z=0;z<i;z++) {
            System.out.println("Entre com o valor do salario do empregado: ");
            salario[z] = input.nextDouble();
            input.nextLine();
            System.out.println(" Função do funcionario: ");
            grade[z] = input.nextLine();
            mediaSalarial=mediaSalarial+salario[z];
        }
        for (int t=0;t<i;t++){
            System.out.println("Função do funcionario "+ (t+1) +": "+grade[t] );
        }

        System.out.println("A média salarial da empresa é: ");
        System.out.println(mediaSalarial/i);
    }
}
