public class Time {
    String nome;
    String corCamisa;
    Jogador[] jogadores;

  Estadio estadio;
    void mostraInfo(){
        System.out.println("nome do time: " + nome);
        System.out.println("cor da camisa: " +corCamisa);
    }

    void adicionaJogador(){
        jogadores = new Jogador[0];
    }

    double calculaTotalSalario(){

        return 0;
    }

    void mostraJogadoresBase(){

    }

}
