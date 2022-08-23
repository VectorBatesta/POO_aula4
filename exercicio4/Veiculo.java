/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula4_exercicio4;

/**
 *
 * @author a2104679
 */
public class Veiculo {
    private String tipo;
    private float precoFrete;
    private float capacidade;
    
    public Veiculo(
            String tipo,
            float precoFrete,
            float capacidade){
        cadastrar(tipo, precoFrete, capacidade);
    }
    
    public void cadastrar(
                String tipo,
                float precoFrete,
                float capacidade){
        this.tipo = tipo;
        this.precoFrete = precoFrete;
        this.capacidade = capacidade;
    }
    
    public void inserir(float carga){
        if (carga <= capacidade)
            capacidade -= carga;
        
    }
}
