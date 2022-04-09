public class Banda {

    private String nome;
    private String genero;
    Membro membros[] = new Membro[3];
    Musica musicas[] = new Musica[3];
    public String getNome() {
        return nome;
    }
    public String getGenero() {
        return genero;
    }

    public void mostraInfo(){
        for(Musica musicass: musicas){
            if(musicass!=null){
                System.out.println(musicas);
                break;
            }
        }
    }
    void addMusicaNova(Musica musica){

        for(int i=0;i< musicas.length;i++){
    if(musicas[i] == null){
        musicas[i]= musica;
        break;
    }
}
    }
    void addMembroNovo(Membro membro){
  for(int i=0;i<membros.length;i++)
        {
if(membros[i]==null){
membros[i]= membro;
break;
}
        }
    }
    public Banda(String nome,String genero){
        this.nome = nome;
        this.genero = genero;
    }
}

