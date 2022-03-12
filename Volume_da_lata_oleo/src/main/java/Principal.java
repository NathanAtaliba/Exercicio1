import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       double V,R,A;
       double Pi = 3.14159;
        System.out.println("Entre com o valor do raio: ");
        R = input.nextDouble();
        input.nextLine();
        System.out.println("Entre com o valor da altura: ");
        A = input.nextDouble();
        input.nextLine();
        V =A*(R*R)*Pi;
        LataDeOleo latinha = new LataDeOleo(V,R,A,Pi);
        latinha.mostraVolume();
    }
}
