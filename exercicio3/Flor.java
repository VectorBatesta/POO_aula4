package aula4_exercicio3;

public class Flor {
    
    //atributos
    private String tipo;
    private String cor;
    private String nome;
    private float preco;
    
    //sobrecarga
    public Flor(
           String tipo,
           String cor,
           String nome,
           float preco){
        
        setTipo(tipo);
        setCor(cor);
        setNome(nome);
        setPreco(preco);
    }
    public Flor(){
        
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(float preco){
        this.preco = preco;
    }
    
    public void cadastrar(String tipo){
        setTipo(tipo);
    }
    
    public void modificar(
                String cor,
                String nome,
                float preco){
        setCor(cor);
        setNome(nome);
        setPreco(preco);
    }
}
