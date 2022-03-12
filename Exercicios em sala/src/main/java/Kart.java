public class Kart {
    String nome;
    Piloto piloto;
    Motor motor = new Motor();

    void pular(){
        System.out.println("Carro"+ nome + " esta pulando.");
    }
    void soltarTurbo(){
        System.out.println("Carro"+ nome + " esta soltando turbo.");
    }
    void fazerDrift(){
        System.out.println("Carro"+ nome +" esta fazendo drift.");
    }
}
