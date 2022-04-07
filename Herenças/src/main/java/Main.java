public class Main{
    public static void main(String[] args) {
        Funcionario[] funcionario = new Funcionario[2];
        Gerente g1 = new Gerente("Nathan Santos Ataliba",80,"Comandar",15,21,2000);
        Estagiario e1 = new Estagiario("Hugo Alvez",50,"Trabalhar",20,20);
    funcionario[0]= g1;
    funcionario[1]= e1;
    for(Funcionario funcionarios: funcionario){
     if(funcionarios instanceof Gerente){
         g1.apresentar();
         break;
     }
        if(funcionarios instanceof Estagiario){
            e1.apresentar();
            break;
        }
    }
    }
}