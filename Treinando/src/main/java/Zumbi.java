public class Zumbi {

    public double vida;
public String nome;

public Zumbi(double vida,String nome){
    this.nome = nome;
    this.vida = vida;
}
public void mostraVida(){
    System.out.println("Vida: "+vida);

}
public void transfereVida(Zumbi zumbiAlvo,double quantia){
if(quantia<=vida){
    zumbiAlvo.vida = zumbiAlvo.vida+quantia;
    vida = vida-quantia;
}
else
    System.out.println("Nao e possivel transferir a vida!");
}

}
