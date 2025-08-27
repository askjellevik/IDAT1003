import java.util.*;


public class Task2 {

    private int rundeNr;

    public Task2() {
        this.rundeNr = 1;

    }


    public static void main(String[] args){

        Task2 spill = new Task2();

        Player playerA = new Player("A");
        Player playerB = new Player("B");



        while (playerA.getPlayerPoints() < 100 && playerB.getPlayerPoints() < 100) {
            int kastA = playerA.kastTerning();
            int kastB = playerB.kastTerning();

            int pointsToSetA;
            int pointsToSetB;

            if( kastA == 1) {
                pointsToSetA = 0;
                System.out.println("Player A kastet 1 og poengsummen er satt til 0");
            }
            else {
                pointsToSetA = playerA.getPlayerPoints() + kastA;
                if (pointsToSetA > 100) {
                    int differanse = pointsToSetA - 100;
                    pointsToSetA = 100 - differanse;
                }

            }

            if( kastB == 1) {
                pointsToSetB = 0;
                System.out.println("Player B kastet 1 og poengsummen er satt til 0");
            }
            else {
                pointsToSetB = playerB.getPlayerPoints() + kastB;
                if (pointsToSetB > 100) {
                    int differanse = pointsToSetB - 100;
                    pointsToSetB = 100 - differanse;
                }


                }



            playerA.setPlayerPoints(pointsToSetA);
            playerB.setPlayerPoints(pointsToSetB);


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



        spill.printSluttSpill();



    }


    public int getRundeNr() {
        return rundeNr;
    }

    public void printSluttSpill(){
        System.out.println("Spillet er avsluttet. Det varte i " + getRundeNr() + " runder. ");
    }
}
