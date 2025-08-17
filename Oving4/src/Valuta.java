public class Valuta {

    private String valutaCode;
    private double amount;

    public Valuta(String valutaCode, double amount) {
        this.valutaCode = valutaCode;
        this.amount = amount;
    }

    //getters
    public String getValutaCode() {
        return valutaCode;
    }

    public double getAmount() {
        return amount;
    }


    //setter
    public void setValues(String valutaCode, double amount){
        this.valutaCode = valutaCode;
        this.amount = amount;
    }


}
