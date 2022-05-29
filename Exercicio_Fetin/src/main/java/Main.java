import Exceptions.NomeException;

public class Main {
    public static void main(String[] args) {
        FETIN fetin = new FETIN();  //CRIANDO UMA FETIN
        Projetos p1 = new Projetos("nathan", 100);   //CRIANDO UM NOVO PROJETO
        Projetos p2 = null;   //CRIANDO UM NOVO PROJETO
        Projetos p3 = new Projetos("bak", 100);     //CRIANDO UM NOVO PROJETO
        Projetos p4 = new Projetos("two", 100);     //CRIANDO UM NOVO PROJETO
        try {
            fetin.addProjeto(p1);  //INSERINDO PROJETOS NO ARQUIVO
            fetin.addProjeto(p2);  //INSERINDO PROJETOS NO ARQUIVO
            fetin.addProjeto(p3);  //INSERINDO PROJETOS NO ARQUIVO
            fetin.addProjeto(p4);  //INSERINDO PROJETOS NO ARQUIVO
        }catch (Exception e){

        }
            fetin.AvaliarProjetos();  //PERCORRENDO O ARQUIVO E LENDO O HASHMAP

    }
}
