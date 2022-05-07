import java.util.Collections;
import java.util.ArrayList;
public abstract class Inimigo implements Comparable<Inimigo>{
private String nome;
private double dano;
public Inimigo(String nome, double dano) {
    this.dano = dano;
    this.nome = nome;
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDano() {
        return dano;
    }

    public void setDano(double dano) {
        this.dano = dano;
    }

    @Override
    public int compareTo(Inimigo inimigo){
    int dan = (int)getDano();
    int dan1 =(int)inimigo.dano;

    return Integer.compare(dan,dan1);
}
}
