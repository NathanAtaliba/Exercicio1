public class Main{
    public static void main(String[] args) {
Funcionario[] funcionario = new Funcionario[3];
Gerente g1 = new Gerente("Nathan",20,20,22,1000);
Estagiario e1 = new Estagiario("Matheus",30,10,20);
funcionario[0]= g1;
funcionario[1]= e1;

        for(Funcionario funcionarios :funcionario){ //Vai percorrer o vetor (funcionario), [Funcionario funcionarios] é uma variavel auxiliar;
   if(funcionarios instanceof Gerente) {  //Testa se a instanciação de Gerente foi feita no funcionario(funcionarios);
       Gerente gerente = (Gerente) funcionarios; //
       gerente.apresentar();
         }
   if (funcionarios instanceof Estagiario){ //Testa se a instanciação de Estagiarios foi feita no funcionario(funcionarios);
       Estagiario estagiario = (Estagiario) funcionarios;  //
estagiario.apresentar();
   }
}
        }
    }

