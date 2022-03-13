import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salarioTotal = 0;
        Jogador jogador1 = new Jogador("Nathan Santos Ataliba",1000,10,true);
        Jogador jogador2 = new Jogador("Renan Santos Rosa",1000,9,false);
        Estadio estadio = new Estadio();
        Time time = new Time();
        time.nome = " Real Madrid";
        time.corCamisa = "Branca";
        estadio.capacidade = 30;
        estadio.nome = " Bernabeu";
        estadio.cidade = "Madrid";

        for (int i = 0; i < 2; i++) {
            time.adicionaJogador();
        }
        jogador1.mostraInfo();
        }

    }
