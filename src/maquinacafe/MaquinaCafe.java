package maquinacafe;

import javax.swing.JOptionPane;

public class MaquinaCafe {

    static Monedero mon1;
    int bebida;
    int azucar;

    int op;

    
        do {
        
        op = Integer.parseInt(JOptionPane.showInputDialog(">>>MENU<<< \n1. Introduce dinero \n2. Añadir azúcar \n3. Elegir bebida \n4. Salir"));
        op = 0;

        switch (op) {

            case 1:
                JOptionPane.showInputDialog("Introducir dinero: ");
                break;
            case 2:
                //System.out.println("");   
                break;
            case 3:
                //System.out.println("");
                break;
            case 4:
                System.exit(0);
        }

    }while (op<4);
}
        
    public static void main(String[] args) {
       
        mon1 = new Monedero();
        
    }
        public void introducirDinero(){
            
            if (mon1.verificarDinero());
                
        }
        
        public void añadirAzucar(){
            
        }
        
        public void elaborarBebida(){
            
        }
               
        
    

