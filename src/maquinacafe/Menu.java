package maquinacafe;

import javax.swing.JOptionPane;

public class Menu {
    
    public void menu(){

    //MaquinaCafe coffee = new MaquinaCafe();
    int op;

    
        do {
        
        op = Integer.parseInt(JOptionPane.showInputDialog(">>>MENU<<< \n1. Introduce dinero \n2. Añadir azúcar \n3. Elegir bebida \n4. Salir"));
        op = 0;

        switch (op) {

            case 1:
                coffee.introducirDinero();
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
}
