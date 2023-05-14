public class principal {
    public static void main(String[]args){
        System.out.println("0 - Sem Semafaro");
        System.out.println("1 - Com Semafaro");
        System.out.print("Escolha: ");
        Jogador jogador = new Jogador();
        Thread[] threads = new Thread[3];
        for(int i=0;i<3;i++){
            threads[i] = new Thread(new ProcessoChute(jogador));
        }
        for (int i=0; i<3; i++ ){
            threads[i].start();
        }
        }
}
