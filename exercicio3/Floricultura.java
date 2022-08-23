package aula4_exercicio3;

public class Floricultura {
    public Floricultura(){
        Flor rosa = new Flor();
        Flor margarida = new Flor();
        
        rosa.cadastrar("rosa");
        
        margarida.cadastrar("margarida");
        margarida.setTipo("margarida");
        margarida.modificar("amarela", "margarida", 20f);
        
        Flor violeta = new Flor("violeta", "azul", "VIOLETA", 50f);
    }
    
    public static void main(String [] args){
        new Floricultura();
    }
}
