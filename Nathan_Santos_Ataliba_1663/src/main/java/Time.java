public class Time {
    String nome;
    String corCamisa;
    Jogador[] jogadores;

  Estadio estadio;
    void mostraInfo(){
        System.out.println("nome do time: " + nome);
        System.out.println("cor da camisa: " +corCamisa);
        for (int i = 0; i < jogadores.length ; i++) {
            jogadores[i].mostraInfo();
            System.out.println("---------------------");
        }
        System.out.println("-------------------------");
    }

    void adicionaJogador(){
        Jogador jogador = new Jogador();

    }

    double calculaTotalSalario(){
        for(int i=0;i<3;i++ ) {

        }
        return 0;
    }

    void mostraJogadoresBase(){

    }

}
