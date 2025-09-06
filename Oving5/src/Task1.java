public class Task1 {

    private int teller, nevner;


    public Task1(int teller, int nevner) {
        if (nevner == 0) {
            throw new IllegalArgumentException("Nevner kan ikke være null");
        }
        else {
            this.teller = teller;
            this.nevner = nevner;
        }
    }

    public Task1(int teller) {
        this.teller = teller;
        this.nevner = 1;
    }

    public void addereBroker(Task1 brok2) {
        teller = brok2.teller * nevner + brok2.nevner * teller;
        nevner = brok2.nevner * nevner;
        forkorteBrok();

    }

    public void subtrahereBroker(Task1 brok2) {
        teller = teller * brok2.nevner - nevner * brok2.teller;
        nevner = nevner * brok2.nevner;
        forkorteBrok();

    }

    public void dividereBroker(Task1 brok2) {
        teller = brok2.nevner * this.teller;
        nevner = brok2.teller * this.nevner;
        forkorteBrok();
    }

    public void multiplisereBroker(Task1 brok2) {
        teller = brok2.teller * teller;
        nevner = brok2.nevner * nevner;
        forkorteBrok();
    }

    public int getTeller() {
        return teller;
    }

    public int getNevner() {
        return nevner;
    }

    public int finnStorsteNevner(int teller, int nevner) {
        if (nevner == 0) {
            return teller;
        }
        else {
            return finnStorsteNevner(nevner,teller % nevner);
        }
    }

    public void forkorteBrok() {
        int storsteNevner = finnStorsteNevner(teller, nevner);
        this.teller /= storsteNevner;
        this.nevner /= storsteNevner;

    }





    public static void main(String[] args) {
        Task1 brok1, brok2;




        brok1 = new Task1(8, 4);
        brok2 = new Task1(8, 2);
        System.out.println("Brøk 1 (" + brok1.getTeller() + "/" + brok1.getNevner() + ") addert med brøk 2 (" + brok2.getTeller() + "/" + brok2.getNevner() + ")");
        brok1.addereBroker(brok2);
        System.out.println("=  " + brok1.getTeller() + "/" + brok1.getNevner());
        System.out.println("---------------");

        brok1 = new Task1(8, 2);
        System.out.println("Brøk 1 (" + brok1.getTeller() + "/" + brok1.getNevner() + ") subtrahert med brøk 2 (" + brok2.getTeller() + "/" + brok2.getNevner() + ")");
        brok1.subtrahereBroker(brok2);
        System.out.println("=  " + brok1.getTeller() + "/" + brok1.getNevner());
        System.out.println("---------------");

        brok1 = new Task1(4, 2);
        System.out.println("Brøk 1 (" + brok1.getTeller() + "/" + brok1.getNevner() + ") multiplisert med brøk 2 (" + brok2.getTeller() + "/" + brok2.getNevner() + ")");
        brok1.multiplisereBroker(brok2);
        System.out.println("=  " + brok1.getTeller() + "/" + brok1.getNevner());
        System.out.println("---------------");

        brok1 = new Task1(8, 2);
        System.out.println("Brøk 1 (" + brok1.getTeller() + "/" + brok1.getNevner() + ") dividert med brøk 2 (" + brok2.getTeller() + "/" + brok2.getNevner() + ")");
        brok1.dividereBroker(brok2);
        System.out.println("=  " + brok1.getTeller() + "/" + brok1.getNevner());
        System.out.println("---------------");


        brok1 = new Task1(8);
        System.out.println("Brøk 1 (" + brok1.getTeller() + "/" + brok1.getNevner() + ") dividert med brøk 2 (" + brok2.getTeller() + "/" + brok2.getNevner() + ")");
        brok1.dividereBroker(brok2);
        System.out.println("=  " + brok1.getTeller() + "/" + brok1.getNevner());

    }
}