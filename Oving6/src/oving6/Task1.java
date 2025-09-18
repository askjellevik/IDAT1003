package oving6;

import java.util.Random;
public class Task1 {

    public static void main(String[] args) {
        Random randomObject = new Random();

        int[] tabell = new int[10]; //Lager liste med 10 indexer

        int lengde = 1000; //her endrer man hvor mange ganger løkken kjøres

        for (int i = 0; i < lengde; i++) {
            int tempVar = randomObject.nextInt(10);
            tabell[tempVar] ++;
        }

        String[] stjerneTabell = new String[10];
        String stjerne = "*";
        for (int i = 0; i < 10; i++) {
            int antallStjerner = Math.round(tabell[i] / (lengde / 100f));
            stjerneTabell[i] = stjerne.repeat(antallStjerner);
        }


        for (int i = 0; i < 10; i++) {
            System.out.println("Tallet " + i + " ble generert " + tabell[i] + " ganger. " + stjerneTabell[i]);
        }



    }
}