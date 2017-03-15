package coffeemachine;

import javax.swing.JOptionPane;

public class Display {

    public void addMoney(){
        System.out.println("Introduzca dinero");
    }
    
    public void returnMoney(){
        float money = 0;
        System.out.println(money-0.50f);
    }
    
    public void returnNothing(){
        System.out.println("Devolución = 0");
    }
    public void insufficientMoney(){
        System.out.println("Dinero insuficiente");
    }
    
    public void chooseDrink(){
        System.out.println("Elija su bebida");
    }
    
    public void addRemoveSugar(){
        int sugar=4;
        boolean button = false;
        System.out.println("Añadir azúcar");
        if(button==true)
            sugar++;
        else
            sugar--;
    }
    
    public void makingDrink(){
        System.out.println("Elaborando su bebida");
    }
    
    public void pickDrink(){
        System.out.println("Recoja su bebida");
    }
}
