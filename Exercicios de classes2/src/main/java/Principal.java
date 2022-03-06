public class Principal {
    public static void main(String[] args) {
Carros carros = new Carros();
carros.velocidadeAtual = 100;
carros.velocidadeMax = 200;
carros.marca = "Mercedes benz";
carros.cor = "Amarelo";
carros.modelo = "sedan";
carros.addMotor(new Motor(300,"motor novo"));
carros.mostraInfo();
carros.ligar();
carros.acelerar();


        System.out.println("----------------------------");
        Carros carros1 = new Carros();
        carros1.velocidadeAtual = 50;
        carros1.velocidadeMax = 100;
        carros1.marca = "Volksvagem";
        carros1.cor = "Azul";
        carros1.modelo = "sedã";
        carros1.addMotor(new Motor(200,"desconhecido"));
        carros1.mostraInfo();
        carros1.ligar();
        carros1.acelerar();
    }
}
