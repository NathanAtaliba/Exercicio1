public class Carros {
    String cor;
    String marca;
    String modelo;
    double velocidadeMax;
    double velocidadeAtual;

Motor motor = new Motor();
    void mostraInfo(){
        System.out.println("Marca do carro: " + marca);
        System.out.println("modelo do carro: " + modelo);
        System.out.println("velocidade maxima: " + velocidadeMax + " Km");
        System.out.println("velocidade Atual: " + velocidadeAtual+ " Km");
        System.out.println("potencia do motor: "+ motor.potencia +" CV");
        System.out.println("tipo do motor: "+ motor.tipo);
    }

    void acelerar(){
        Carros carros;
        System.out.println("O carro da " + marca + " esta acelerando!");
    }
    void ligar(){
        System.out.println("O carro da "+ marca + " esta ligado!");
    }
}
