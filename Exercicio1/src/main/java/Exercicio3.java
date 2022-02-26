import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        float NPA;
        Scanner valorTeclado = new Scanner(System.in);
        System.out.print("Entre com a nota na NP1: ");
        float NP1 = valorTeclado.nextFloat();
        System.out.println("");
        System.out.print("Entre com a nota na NP2: ");
        float NP2 = valorTeclado.nextFloat();
        System.out.println("");

        NPA = (NP1+NP2)/2;
        if(NPA<=60){
            System.out.print("Entre com a nota na NP3: ");
            float NP3 = valorTeclado.nextFloat();
            if((NPA+NP3)<50){
                System.out.println("O aluno esta reprovado");
            }
            else{
                System.out.println("O aluno esta aprovado");
            }
        }else {
            System.out.println("O aluno esta aprovado!");
        }
    }
}

