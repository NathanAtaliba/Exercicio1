public class Main {
    public static void main(String[] args) {
FETIN fetin = new FETIN();
Projetos projeto1 = new Projetos("P1",10);
Projetos projeto2 = new Projetos("P1",77);
Projetos projeto3 = new Projetos("P3",80);
fetin.addProjeto(projeto1);
fetin.addProjeto(projeto2);
fetin.addProjeto(projeto3);
        fetin.AvaliarProjetos();


    }
}
