package presenter;

import model.*;
import view.*;

public class Presenter {
    private View view;
    private Conversor conversor;
    private String divisa;
    private double value;

    public Presenter() {
        view = new View();
        conversor = new Conversor();
    }

    public void convertirDivisas() {
        int subOption = view.showSubMenu();
        switch (subOption) {
            case 1:
                divisa = view.showMenuOptions(conversor.getDivisasArray(),
                        "Seleccione la divisa a la que desea convertir");
                value = view.showInputMessage("COP  ---> " + divisa + "\nIngrese el valor a convertir");
                view.showMessage("El valor en " + divisa + " es: " +
                        String.format("%,.2f", conversor.convertirDesdePesoColombiano(divisa, value)));
                break;
            case 2:
                divisa = view.showMenuOptions(conversor.getDivisasArray(),
                        "Seleccione desde que divisa desea convertir");
                value = view.showInputMessage(divisa + " ---> COP\nIngrese el valor a convertir");
                view.showMessage("El valor en COP es: " + 
                        String.format("%, .2f", conversor.convertirHaciaPesoColombiano(value, divisa)));
                break;
            case 3:
                menu();
                break;
            default:
                view.showMessage("Opción no válida");
                break;
        }
    }


public void menu() {
        int option = view.showMenuPrincipalMenu();
        switch (option) {
            case 1:
                convertirDivisas();
                break;
            case 2:

                break;
            case 3:

                break;
            default:
                view.showMessage("Opción no válida");
                break;
        }
    }

    public static void main(String[] args) {

        Presenter presenter = new Presenter();
        presenter.menu();

    }

}
