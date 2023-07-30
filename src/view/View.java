package view;

import javax.swing.JOptionPane;

public class View {

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public int showMenuPrincipalMenu() {
        return Integer.parseInt(JOptionPane.showInputDialog(null,
                """
                    ---Conversor de Divisas y Temperaturas---
                    1. Conversor de Divisas
                    2. Conversor de Temperaturas
                    3. Salir
                """));
    }

    public int showSubMenu(){
        return Integer.parseInt(JOptionPane.showInputDialog(null,
                """
                    ---Conversor de Divisas---
                    1. COP -> Otra divisa
                    2. Otra divisa -> COP
                    3. Volver.
                """));
    }

    public String showMenuOptions(String[] optionsMenu, String message){
        return (String) JOptionPane.showInputDialog(null,message ,
                "Lista de Opciones", JOptionPane.QUESTION_MESSAGE, null, optionsMenu, optionsMenu[0]);
    }

    public double showInputMessage(String message){
        return Double.parseDouble(JOptionPane.showInputDialog(null, message));
    }
    






}
