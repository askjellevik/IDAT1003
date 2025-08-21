import java.util.*;


public class Task2 {


    private Random terning = new Random();
    private int rundeNr;

    public Task2() {
        this.rundeNr = 1;

    }


    public static void main(String[] args){

        Task2 spill = new Task2();

        Player playerA = new Player("A");
        Player playerB = new Player("B");





        while (playerA.getPlayerPoints() < 100 && playerB.getPlayerPoints() < 100) {
            int kastA = spill.kastTerning();
            int kastB = spill.kastTerning();

            int newPlayerPointsA = playerA.getPlayerPoints() + kastA;
            int newPlayerPointsB = playerB.getPlayerPoints() + kastB;


            if (newPlayerPointsA <= 100) {
                playerA.setPlayerPoints(newPlayerPointsA);
            } else {
                int differanse = newPlayerPointsA - 100;
                playerA.setPlayerPoints(100 - differanse);
            }

            if (newPlayerPointsB <= 100) {
                playerB.setPlayerPoints(newPlayerPointsB);
            } else {
                int differanse = newPlayerPointsB - 100;
                playerB.setPlayerPoints(100 - differanse);
            }

            if( kastA == 1) {
                playerA.setPlayerPoints(0);
                System.out.println("Player A kastet 1 og poengsummen er satt til 0");
            }
            if( kastB == 1) {
                playerB.setPlayerPoints(0);
                System.out.println("Player B kastet 1 og poengsummen er satt til 0");
            }


            System.out.println("Runde nr: " + spill.getRundeNr() + ". Spiller A kastet " + kastA + " og har nå " + playerA.getPlayerPoints());
            System.out.println("Runde nr: " + spill.getRundeNr() + ". Spiller B kastet " + kastB + " og har nå " + playerB.getPlayerPoints());
            System.out.println("-----------------");




            if (playerA.getPlayerPoints() == 100 && playerB.getPlayerPoints() == 100) {
                System.out.println("Begge vant samtidig :O");
                break;
            }
            else if (playerA.getPlayerPoints() == 100 ) {
                System.out.println("Player A vant");
                System.out.println("Player A triltet " + kastA + " og nådde 100.");
                break;
            } else if (playerB.getPlayerPoints() == 100) {
                System.out.println("Player B triltet " + kastB + " og nådde 100.");
                System.out.println("Player B vant");
                break;
            }





            spill.rundeNr++;

        }



        spill.sluttSpill();



    }

    public int kastTerning(){
        int terningkast = (terning.nextInt(6) + 1);
        return terningkast;
    }

    public int getRundeNr() {
        return rundeNr;
    }

    public void sluttSpill(){
        System.out.println("Spillet er avsluttet. Det varte i " + getRundeNr() + " runder. ");
    }
}
