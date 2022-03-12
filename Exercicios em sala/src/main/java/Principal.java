public class Principal {
    public static void main(String[] args) {
        Piloto piloto = new Piloto();
        Kart kart1 = new Kart();
        Kart kart2 = new Kart();
        kart1.nome =" Kart 1" ;
        kart2.nome ="Kart 2";
        kart1.motor.velocidadeMaxima = 120.02f;
                kart1.motor.cilindradas = "200";
        kart1.motor.velocidadeMaxima = 122.02f;
        kart1.motor.cilindradas = "300";

Piloto piloto1 = new Piloto();
Piloto piloto2 = new Piloto();

piloto1.nome = "piloto1";
piloto2.nome = "piloto2";

kart1.piloto = piloto1;
kart2.piloto = piloto2;

piloto1.soltaSuperPoder();
piloto2.soltaSuperPoder();

kart1.fazerDrift();
kart2.fazerDrift();

    }
}
