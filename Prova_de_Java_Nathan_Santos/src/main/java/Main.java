public class Main {
    public static void main(String[] args) {

        Personagem[] personagems = new Personagem[3];
        Astrologo a1 = new Astrologo("Astrologo 1",10,10,10);
        Samurai s1 = new Samurai("Samurai 1",10,10,10,100);
        Confessor c1 = new Confessor("Confessor 1",10,10,10);
personagems[0]=a1;
personagems[1]=s1;
personagems[2]=c1;

        for(Personagem personagem: personagems){
    if(personagem instanceof Samurai){
        s1.aprendeCura();
        s1.curar();
        s1.ganhaHabilidade();
        s1.passaLevel();
        s1.setFe(s1.getFe()-2);
        s1.setVitalidade(s1.getVitalidade()+5);
        s1.setInteligencia(s1.getInteligencia()-2);
        s1.mostraInfo();
        System.out.println( ); //espaço para dividir os funcionarios
    }
    if(personagem instanceof Confessor){
        c1.aprendeCura();
        c1.curar();
        c1.ganhaHabilidade();
        c1.passaLevel();
        c1.setInteligencia(c1.getInteligencia()-2);
        c1.setFe(c1.getFe()+5);
        c1.setVitalidade(c1.getVitalidade()-2);
        c1.mostraInfo();
        System.out.println( ); //espaço para dividir os funcionarios
    }
    if (personagem instanceof Astrologo) {
        a1.aprendeCura();
        a1.curar();
        a1.ganhaHabilidade();
        a1.passaLevel();
        a1.setInteligencia(a1.getInteligencia()+5);
        a1.setFe(a1.getFe()-2);
        a1.setVitalidade(a1.getVitalidade()-2);
        a1.mostraInfo();
        System.out.println( ); //espaço para dividir os funcionarios
    }
    }
        System.out.println("Numero de personagens: "+Personagem.contador);
    }
}
