public class Main {

    public static void main(String[] args) {

        /*
        INICIALIZANDO VARIAVEIS DO TIPO INIMIGO , MAS COM INICIALICAÇAO EM OUTRAS CLASSES.
        Inimigo chefao1 = new Boss("Chefao 1",1000,100,100);
        Inimigo chefao2 = new Boss("Chefao 2",2000,120,120);
        Inimigo zumbi1 = new Zumbis("Zumbi 1",100,50,50);
        Inimigo zumbi2 = new Zumbis("Zumbi 2",200,60,60);

         */
/*
EXEMPLO DE FOR EACH(PERCORRENDO ARRAYS):
        Inimigo[] inimigos = new Inimigo[4];
          inimigos[0]= chefao1;
          inimigos[1]= chefao2;
          inimigos[2]= zumbi1;
          inimigos[3]= zumbi2;
           for(Inimigo inimigo: inimigos) {
              if (inimigo instanceof Boss) {
                  System.out.println("BOSS DO JOGO:");
                  inimigo.mostraInfo();
               }
               if (inimigo instanceof Zumbis){
                   System.out.println("ZUMBI DO JOGO:");
                inimigo.mostraInfo();
              }
            }
           */
        /* EXEMPLO QUE O THIS ALTERA A VARIAVEL DE FORA
        Inimigo inimigo = new Inimigo(20);
        System.out.println(inimigo.getVidaTeste());
        System.out.println("Numero de inimigos: "+inimigo.getnumInimigos());
        */
        /* EXEMPLO DE CASTING (MUDANÇA DE VARIAVEL)
       if(chefao1 instanceof Inimigo){
           Boss chefe = (Boss) chefao1;
           chefe.atacar();
       }
         */

        }
    }

