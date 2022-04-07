public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionario = new Funcionario[3];
        GerenteRegional g1 = new GerenteRegional("Nathan",1663,1000,"medico");
        Vendedor v1 = new Vendedor("Joao",190,4000,1000);
        Contador c1 = new Contador("Richard",140,3000,100);
funcionario[0]=g1;
funcionario[1]=v1;
funcionario[2]=c1;

for (Funcionario funcionarios : funcionario){
    if(funcionarios instanceof GerenteRegional){
        g1.mostraInfo();
    }
    if(funcionarios instanceof Vendedor){
        v1.mostraInfo();
    }
    if (funcionarios instanceof Contador){
        c1.mostraInfo();
    }
}
    }

}
