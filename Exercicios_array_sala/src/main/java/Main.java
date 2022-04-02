public class Main {
    public static void main(String[] args) {

       Banda banda = new Banda("Bando de loucos","Time");
       banda.addMembroNovo(new Membro("nathan","cantor"));
        banda.addMembroNovo(new Membro("nathan santos ","baterista"));
        banda.addMembroNovo(new Membro("nathan santos ataliba","guitarrista"));
        banda.addMusicaNova(new Musica("read",2.34));
        banda.addMusicaNova(new Musica("rea",1.24));
        banda.addMusicaNova(new Musica("re",3.50));
        banda.mostraInfo();




    }
}