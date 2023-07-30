package model;

public enum Divisas {

    COP("Colombian Peso", 1.0),
    USD("United States Dollar", 0.00025),
    EUR("Euro", 0.00023),                 
    GBP("British Pound Sterling", 0.00020), 
    JPY("Japanese Yen", 0.036),           
    AUD("Australian Dollar", 0.00038); 

    private final String fullName;
    private final double rateToUSD;

    Divisas(String fullName, double rateToPeso) {
        this.fullName = fullName;
        this.rateToUSD = rateToPeso;
    }

    public String getFullName() {
        return fullName;
    }
    public double getRateToUSD() {
        return rateToUSD;
    }
}
