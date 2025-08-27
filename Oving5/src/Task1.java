public class Task1 {

    private int teller;
    private int nevner;


    public Task1(int teller, int nevner) {
        this.teller = teller;
        this.nevner = nevner;
    }

    public Task1(int teller) {
        this.teller = teller;
        this.nevner = 1;
    }

    public void addereBroker() {

    }

    public void subtrahereBroker() {

    }

    public void dividereBroker() {

    }

    public void multiplisereBroker() {

    }





    public static void main(String[] args) {
        Task1 brok1, brok2;

        try {
            brok1 = new Task1(1, 1);
        } catch (IllegalArgumentException e) {
            brok1 = new Task1(1);

        }
    }
}