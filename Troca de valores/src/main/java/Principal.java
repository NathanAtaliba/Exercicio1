import java.util.Scanner;
public class Principal {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome1 = "Mestre do universo";
        System.out.println("nome1="+ nome1);
        String nome2;
        String aux;
        System.out.println("Entre com o nome 2: ");
        nome2 = input.nextLine();

        aux = nome1;
       nome1= nome2;
       nome2 = aux;
        System.out.println("NOMES:" +"nome 1 = " +nome1 +" nome 2 = "+ nome2);
        input.nextLine();

    }
}
