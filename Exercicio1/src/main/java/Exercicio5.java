import java.util.Random;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner valorTeclado = new Scanner(System.in);

        Random rand = new Random();
        int x = rand.nextInt(10)+1;
        int numero;
        System.out.println("Um numero foi gerado de 0 a 10, tente adivinhar: ");
        do{
            System.out.println("Qual numero foi gerado: ");
            int n = valorTeclado.nextInt();
            numero=n;
        }while(x != numero);
        System.out.println("Voce acertou!");
        System.out.println("O numero é: "+x);


    }
}
