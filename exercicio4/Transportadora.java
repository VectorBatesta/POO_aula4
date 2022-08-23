package aula4_exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Transportadora {
    
    public Transportadora(){
        Veiculo [] vetor = new Veiculo[5];
        
        List <Veiculo> lista = new ArrayList<>();
//        lista.add(
//            new Veiculo("caminhao", 750.0f, 23000f)
//        );
        
        Veiculo caminhao = new Veiculo("caminhao", 750.0f, 23000f);
        lista.add(caminhao);
        
    }
    
    public static void main(String [] args){
        new Transportadora();
    }
}
