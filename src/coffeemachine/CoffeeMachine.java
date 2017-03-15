package coffeemachine;

import javax.swing.JOptionPane;

public class CoffeeMachine {

    static Wallet mon1;
    static Display dis1;
    public static void main(String[] args) {
    int op=0;
    
    mon1=new Wallet();
    dis1=new Display();

    
        do {
            try{
        op = Integer.parseInt(JOptionPane.showInputDialog(">>>MENU<<< \n1. Introduce dinero \n2. Añadir azúcar \n3. Elegir bebida \n4. Salir"));
        op = 0;
            }catch(Exception e){
                System.out.println(e.getMessage());
                op = 0;
            }
                switch (op) {

            case 1:
                dis1.addMoney();
                break;
            case 2:
                dis1.addRemoveSugar();
                break;
            case 3:
                dis1.chooseDrink();
                break;
            case 4:
                System.exit(0);
        }

    }while (op<4);
}
}
               
        
    

