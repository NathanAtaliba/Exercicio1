import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner valorTeclado = new Scanner(System.in);

        float media;
        float somazumbi;
        int p1 = valorTeclado.nextInt();
        int p2 = valorTeclado.nextInt();
        int p3 = valorTeclado.nextInt();
        somazumbi = p1+p1+p3;
        media = somazumbi/3;
        System.out.println("O valor da soma de zumbis é:" + somazumbi);
        System.out.println("O valor da media por partida é:" + media);

    }
}
