import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner valorTeclado = new Scanner(System.in);
        System.out.print("Entre com o numero de alunos: "); //10,20,30
        int naluno = valorTeclado.nextInt();
        switch(naluno){
            case 10:
                System.out.println("Sala utilizada é: I-15");
                break;
            case 20:
                System.out.println("Sala utilizada é: I-15");
                break;
            case 30:
                System.out.println("Sala utilizada é: I-22");
                break;
            default:
                System.out.println("Nao tem uma sala especifica pra essa quantidade de alunos");

        }

    }
}
