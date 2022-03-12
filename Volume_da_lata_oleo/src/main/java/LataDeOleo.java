

public class LataDeOleo {
    double volume;
    double raio;
    double altura;
    double pi = 3.14159;

    public LataDeOleo(double volume,double raio,double altura,double pi){
        this.volume = volume;
        this.raio = raio;
        this.altura = altura;
        this.pi = pi;
    }
void mostraVolume(){
    System.out.println("O volume é: "+ volume);
}
}
