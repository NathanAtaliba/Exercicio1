public class Main {
    public static void main(String[] args) {
Zumbi zumbi1 = new Zumbi(200,"Zumbi 1");
Zumbi zumbi2 = new Zumbi(100,"Zumbi 2");

zumbi1.transfereVida(zumbi2,300);
       zumbi1.mostraVida();
       zumbi2.mostraVida();
    }
}
