package br.inatel.codigo;
import br.inatel.codigo.arquivo.Arquivo;
import br.inatel.codigo.artista.Artista;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        br.inatel.codigo.artista.Artista a1 = new br.inatel.codigo.artista.Artista();
        Artista a2 = new Artista();
        Artista a3 = new Artista();
        Artista a4 = new Artista();


        a1.setNome("Nathan");
        a1.setMusicasMaisFamosas("Ruby");
        a1.setInternacional(true);

        a2.setNome("Joao");
        a2.setMusicasMaisFamosas("Diamante");
        a2.setInternacional(true);

        a3.setNome("Renan");
        a3.setMusicasMaisFamosas("Prata");
        a3.setInternacional(true);

        a4.setNome("Betoven");
        a4.setMusicasMaisFamosas("Ouro");
        a4.setInternacional(true);
        try {
            a1.setOuvintesMensais(100);
            a2.setOuvintesMensais(200);
            a3.setOuvintesMensais(500);
            a4.setOuvintesMensais(400);

        }catch(Exception OuvitesMensaisException){
            if(a1.getOuvintesMensais()<10000 ||a2.getOuvintesMensais()<10000||a3.getOuvintesMensais()<10000||a4.getOuvintesMensais()<10000){
            System.out.println("Erro de Valor: "+ OuvitesMensaisException);
            }}

        Arquivo arquivo = new Arquivo();
        arquivo.escrever(a1);
        arquivo.escrever(a2);
        arquivo.escrever(a3);
        arquivo.escrever(a4);
       ArrayList<Artista> artistas = new ArrayList<>();
        artistas = arquivo.ler();
        Collections.sort(artistas);
        Collections.reverse(artistas);
        for(Artista artista1 : artistas){

            System.out.println("Nome: " + artista1.getNome());
            System.out.println("Ouvintes mensais: " + artista1.getOuvintesMensais());
            System.out.println("musicas mais famosas: " + artista1.getMusicasMaisFamosas());
        }
        }
    }

