package aula4;

import javax.swing.JOptionPane;

public class Aula4 {
    
    public void Principal(){
        JOptionPane entrada = new JOptionPane();
        
        String texto1, texto2;
        float v1, v2, result;
        
        texto1 = entrada.showInputDialog(null, "Informe float1.");
        texto2 = entrada.showInputDialog(null, "Informe float2.");
        
        v1 = Float.parseFloat(texto1);
        v2 = Float.parseFloat(texto2);
        
        result = v1 + v2;
        entrada.showMessageDialog(null, result, "Soma eh: ", JOptionPane.OK_OPTION);
        
        System.exit(0);
    }
    
    public static void main(String[] args) {
        Aula4 obj = new Aula4();
        obj.Principal();
    }
    
}
