import java.util.Scanner;
public class ProcessoChute implements Runnable {
    private Jogador jogador;
    public ProcessoChute(Jogador i){
        this.jogador = i;
    }
@Override
    public void run(){
    System.out.println(Thread.currentThread().getName()+ " pronto para chutar");
    jogador.chutarComSemSemafaro();
    }
}
