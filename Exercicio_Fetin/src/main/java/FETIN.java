import Exceptions.NotaException;

import java.util.HashMap;
import java.util.Map;
public class FETIN {
    private int cont=0;
    Map<String,Double> projetos = new HashMap<String,Double>();

void addProjeto(Projetos projeto){
    try {
        projetos.put(projeto.getNome(), projeto.getNotas());
        cont++;
    }catch(NullPointerException e){
        System.out.println("Nome de projeto nao existe!");
    }
    }

public void AvaliarProjetos(){
    for(int i=0;i<cont;i++){
        try{
            projetos.get(i);
        if(projetos.containsKey(i)){
            System.out.println("Projeto aprovado com nota :"+projetos.toString());
        }
    else
        {
            throw new NotaException("Nota insuficiente!");
        }
    }catch(NullPointerException e){
            System.out.println(e);
        }
    }}
        }

