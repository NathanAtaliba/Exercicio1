public class Ashen {
    String nome;
    int vida=100;
    Arma arma = new Arma();
    void usaArma(){
    arma.resistencia = arma.resistencia -2;
    arma.mostraInfoArma();
    }
    void tomarDano()
    {
        vida=vida-5;
        System.out.println("Sua vida esta em: "+vida );
    }

}
