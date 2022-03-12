import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salarioTotal = 0;

        Estadio estadio = new Estadio();
        Time time = new Time();
        time.nome = " Real Madrid";
        time.corCamisa = "Branca";
        estadio.capacidade = 30;
        estadio.nome = " Bernabeu";
        estadio.cidade = "Madrid";
        time.adicionaJogador();

        for (int i = 0; i < 2; i++) {
            System.out.println("Entre com o nome do jogador: ");
            jogador[i].nome = input.next();
            System.out.println("Entre com o salario do jogador: ");
            jogador[i].salario = input.nextInt();
            input.nextLine();
            System.out.println("Entre com o numero da camisa do " + (i + 1) + " jogador: ");
            jogador[i].nCamisa = input.nextInt();
            input.nextLine();
            System.out.println("(true-Sim false-NAO) Jogador da base: ");
            jogador[i].base = input.nextBoolean();


        }
        salarioTotal = time.calculaTotalSalario();
        time.mostraInfo();
        System.out.println("Salario total do time: "+salarioTotal);
        for (int z = 0; z < 2; z++) {
            jogador[z].mostraInfo();

        }
    }
}