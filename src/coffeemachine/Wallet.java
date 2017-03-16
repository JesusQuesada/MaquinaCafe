package coffeemachine;

import javax.swing.JOptionPane;

public class Wallet {

    float money;
    Display dis1 = new Display();
/**
 * Creo un método que no recibe ni devuelve nada y que sirve para comprobar el dinero introducido. Si es mayor o igual a 0.50, llama al método de elegir bebida, sino llama al de dinero insuficiente.
 */
    public void checkMoney() {
        //money = Float.parseFloat(JOptionPane.showInputDialog("Introducir dinero"));
        if (money >= 0.50f) {
            dis1.chooseDrink();
        } else {
            dis1.insufficientMoney();
        }
    }
    /**
     * Creo un método que no recibe ni devuelve nada y que sirve para devolver dinero. Cuando la cantidad es mayor que 0.50, llama al método de devolver dinero, sino llama a un método que indica que no hay nada que devolver.
     */
    public void returnMoney(){
        if(money>0.50f)
            dis1.returnMoney();
        else
            dis1.returnNothing();
    }

}
