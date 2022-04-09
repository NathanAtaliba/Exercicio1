public class Main {
    public static void main(String[] args) {

            Inimigo zumbilerdo = new ZumbiLerdo("Zumbi lerdo","Morder",100);
            Inimigo cavaleiroNegro = new CavaleiroNegro("Cavaleiro Negro","Espadada",200);
            Jogador jogador = new Jogador();
            if(zumbilerdo instanceof ZumbiLerdo){
                 ZumbiLerdo zumbi = (ZumbiLerdo) zumbilerdo;
             zumbi.atacar();
            }
            if(cavaleiroNegro instanceof CavaleiroNegro) {
                CavaleiroNegro cavaleiro = (CavaleiroNegro) cavaleiroNegro;
                cavaleiro.atacar();
            }
            jogador.atacar(zumbilerdo);
    }
}
