
package maquinacafe;

import javax.swing.JOptionPane;

public class Monedero {
    float dinero;
    
    public void guardarDinero(){
        dinero = Float.parseFloat(JOptionPane.showInputDialog("Cantidad a introducir: "));
    }
    
    public boolean verificarDinero(float dinero){
        if (dinero>=0.5)
            return true;
        else
            return false;
        }
            
        
            
            
    
    
    
}
