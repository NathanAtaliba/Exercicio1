public class Main {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Nathan Santos Ataliba", 40, 40, "Comandar", 1000);
        Estagiario e1 = new Estagiario("Pedro", 80, 7, "Solda placas");
        Funcionario[] funcionarios = new Funcionario[2];
        funcionarios[1] = e1;
        funcionarios[0] = g1;

        for (Funcionario funcionario : funcionarios) { //Funcionario funcionario = incialização auxiliar --- funcionarios(vetor que vai ser percorrido)

            if (funcionario instanceof Estagiario) { // Estagiario for uma instancia de funcionario faça...
                e1.apresentar();
                break;
            }
            if (funcionario instanceof Gerente) {  // Gerente for uma instancia de funcionario faça...
                g1.apresentar();
                break;
                }
            }
        }
    }

