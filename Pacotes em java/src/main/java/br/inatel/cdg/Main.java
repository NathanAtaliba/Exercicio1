package br.inatel.cdg;
import br.inatel.cdg.matematica.Calculo;
import br.inatel.cdg.matematica.Matematica;
public class Main {
    public static void main(String[] args) {
       //Usando fully qualified name
        //br.inatel.cdg.matematica.Matematica matematica = new br.inatel.cdg.matematica.Matematica();

        Matematica matematica = new Matematica();
        br.inatel.cdg.outramatematica.Matematica matematica2 = new br.inatel.cdg.outramatematica.Matematica();
        Calculo calculo = new Calculo();

    }
}
