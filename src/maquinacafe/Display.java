package maquinacafe;

import javax.swing.JOptionPane;

public class Display {

    public void options() {
        int op;

        do {

            op = Integer.parseInt(JOptionPane.showInputDialog(">>>MENU<<< \n1. Café \n2. Té \n3. Leche \n4. Salir"));
            op = 0;

            switch (op) {

                case 1:
                    System.out.println("Ha elegido café ");
                    break;
                case 2:
                    System.out.println("Ha elegido té ");
                    break;
                case 3:
                    System.out.println("Ha elegido leche ");
                    break;
                case 4:
                    System.exit(0);

            }
        } while (op < 4);
    }
}
