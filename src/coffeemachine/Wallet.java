package coffeemachine;

import javax.swing.JOptionPane;

public class Wallet {

    float money;
    Display dis1 = new Display();

    public void checkMoney() {
        //money = Float.parseFloat(JOptionPane.showInputDialog("Introducir dinero"));
        if (money >= 0.50f) {
            dis1.chooseDrink();
        } else {
            dis1.insufficientMoney();
        }
    }
    
    public void returnMoney(){
        if(money>0.50f)
            dis1.returnMoney();
        else
            dis1.returnNothing();
    }

}
