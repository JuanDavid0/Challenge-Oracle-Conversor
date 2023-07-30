package model;

public class Conversor {

    private String[] divisas;
    private double[] tasas;

    public Conversor() {
        getDivisas();
    }

    public double convertirDesdePesoColombiano(String nameDivisa, double value) {
        return value * Divisas.valueOf(nameDivisa).getRateToUSD();
    }
    public double convertirHaciaPesoColombiano(double value, String nameDivisa) {
        return value / Divisas.valueOf(nameDivisa).getRateToUSD();
    }
    
    private void getDivisas() {
        divisas = new String[Divisas.values().length];
        tasas = new double[Divisas.values().length];
        int i = 0;
        for (Divisas divisa : Divisas.values()) {
            divisas[i] = divisa.name();
            tasas[i] = divisa.getRateToUSD();
            i++;
        }
    }

    public String[] getDivisasArray() {
        return divisas;
    }
    public double[] getTasasArray() {
        return tasas;
    }
    


}