import java.util.concurrent.Semaphore;
import java.util.Scanner;
public class Jogador {
    private Semaphore semafaro = new Semaphore(1);
    Scanner input = new Scanner(System.in);
    int escolha = input.nextInt();
    public void chutarSemSemafaro(){
        System.out.println( Thread.currentThread().getName() + " esta chutando");
        System.out.println("Bola do " + Thread.currentThread().getName() + " foi chutada!");
    }
    public void chutarComSemafaro(){
    try{
        semafaro.acquire();
        System.out.println( Thread.currentThread().getName()+ " esta chutando");
        }
    catch (InterruptedException e){
    }
    finally {
    System.out.println("Bola do " + Thread.currentThread().getName()+ " foi chutada!");
    semafaro.release();
}}
    public void chutarComSemSemafaro(){
        switch (escolha){
            case 0:
                chutarSemSemafaro();
                break;
            case 1:
                chutarComSemafaro();
                break;
        }
        }
    }
