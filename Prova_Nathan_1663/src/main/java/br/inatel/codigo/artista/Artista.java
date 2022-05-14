package br.inatel.codigo.artista;

public class Artista implements Comparable<Artista>{
    private String nome;
    private int ouvintesMensais;
    private String musicasMaisFamosas;
    private boolean internacional;

    @Override
    public int compareTo(Artista p){
        return nome.compareTo(p.nome);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getOuvintesMensais() {
        return ouvintesMensais;
    }

    public void setOuvintesMensais(int ouvintesMensais) {
        this.ouvintesMensais = ouvintesMensais;
    }

    public String getMusicasMaisFamosas() {
        return musicasMaisFamosas;
    }

    public void setMusicasMaisFamosas(String musicasMaisFamosas) {
        this.musicasMaisFamosas = musicasMaisFamosas;
    }

    public boolean isInternacional() {
        return internacional;
    }

    public void setInternacional(boolean internacional) {
        this.internacional = internacional;
    }
}
