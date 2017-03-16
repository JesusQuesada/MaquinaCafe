package coffeemachine;

import javax.swing.JOptionPane;

public class Display {
/**
 * Creo un método que no recibe ni devuelve nada y que sirve para introducir dinero.
 */
    public void addMoney(){
        System.out.println("Introduzca dinero");
    }
    /**
     * Creo un método que no recibe ni devuelve nada y que sirve para devolver dinero.
     */
    public void returnMoney(){
        float money = 0;
        System.out.println(money-0.50f);
    }
    /**
     * Creo un método que no recibe ni devuelve nada y que sirve para indicar que no hay dinero que devolver.
     */
    public void returnNothing(){
        System.out.println("Devolución = 0");
    }
    /**
     * Creo un método que no recibe ni devuelve nada y que sirve para indicar que la cantidad introducida es insuficiente.
     */
    public void insufficientMoney(){
        System.out.println("Dinero insuficiente");
    }
    /**
     * Creo un método que no recibe ni devuelve nada y que sirve para mostrar el mensaje de elegir bebida.
     */
    public void chooseDrink(){
        System.out.println("Elija su bebida");
    }
    /**
     * Creo un método que no recibe ni devuelve nada y que sirve para añadir o quitar azúcar.
     */
    public void addRemoveSugar(){
        int sugar=4;
        boolean button = false;
        System.out.println("Añadir azúcar");
        if(button==true)
            sugar++;
        else
            sugar--;
    }
    /**
     * Creo un método que no recibe ni devuelve nada y que sirve para mostrar el mensaje de que la máquina está elaborando la bebida.
     */
    public void makingDrink(){
        System.out.println("Elaborando su bebida");
    }
    /**
     * Creo un método que no recibe ni devuelve nada y que sirve para mostrar el mensaje de recoger bebida.
     */
    public void pickDrink(){
        System.out.println("Recoja su bebida");
    }
}
