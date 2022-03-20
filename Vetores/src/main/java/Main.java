public class Main {

    public static void main(String[] args) {
        Socia[] socias = new Socia[2];
        Socia socia1 = new Socia("Elton",22);
        Socia socia2 = new Socia("Lzin",23);

   socias[0]=socia1;
   socias[1]=socia2;

        for(int i=0;i< socias.length;i++){
           socias[i].mostraInfo();
        }
    }
}
