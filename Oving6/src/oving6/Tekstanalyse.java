package oving6;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class Tekstanalyse {

    final String inpTekst;
    private int[] antallTegn;
    private String tegnTabell;


    public Tekstanalyse(String inpTekst) {
        this.inpTekst =  inpTekst.toLowerCase();
        this.antallTegn = new int[30];
        this.tegnTabell = "abcdefghijklmnopqrstuvwxyzæøå";
        fyllAntallTegn();
    }

    public void fyllAntallTegn() {

        for (int i = 0; i < inpTekst.length(); i++) {
            char tegn = Character.toLowerCase(inpTekst.charAt(i));
            int index = tegnTabell.indexOf(tegn);
            if (index != -1) {
                antallTegn[index]++;
            } else {
                antallTegn[29]++;
            }
        }


    }

    public int finnTotaltForskjelligeBokstaver() {
        int totaltAntallForskjelligeBokstaver = 0;
        for (int i = 0; i < antallTegn.length-1; i++) {
            if (antallTegn[i] != 0) {
                totaltAntallForskjelligeBokstaver ++;
            }
        }
        return totaltAntallForskjelligeBokstaver;
    }

    public int finnTotalAntallBokstaver() {
        int antallBokstaver = 0;

        for (int i = 0; i < tegnTabell.length(); i++) {
            antallBokstaver += antallTegn[i];
        }
        
        return antallBokstaver;
    }

    public double finnProsentIkkeBokstaver() {
        double antallIkkeBokstaver = antallTegn[29];
        double prosent = antallIkkeBokstaver / inpTekst.length() * 100;
        return Math.round(prosent);
    }

    public int finnForekomstAvBokstav(char bokstav) {
        bokstav = Character.toLowerCase(bokstav);
        int index = tegnTabell.indexOf(bokstav);
        if (index != -1) {
            return antallTegn[index];
        } else {
            return 0;
        }
    }


    public String finnFlestForekomster() {
        String bokstavMedFlestForekomster = String.valueOf(tegnTabell.charAt(0));
        int antallForekomster = antallTegn[0];

        for (int i = 1; i < tegnTabell.length(); i++) {
            if (antallTegn[i] > antallForekomster) {
                bokstavMedFlestForekomster = String.valueOf(tegnTabell.charAt(i));
                antallForekomster = antallTegn[i];

            } else if (antallTegn[i] == antallForekomster) {
                bokstavMedFlestForekomster = bokstavMedFlestForekomster + ", " + tegnTabell.charAt(i);
            }
        }


        return "Det var flest forekomster av bokstaven " + bokstavMedFlestForekomster + ", som hadde " + antallForekomster + " forekomster";
    }





    public static void main(String[] args){

        Scanner scannerObj = new Scanner(System.in);
        String inpTekst;

        try {
            while (true) {
                System.out.println("Skriv inn en tekst: ");
                inpTekst = scannerObj.nextLine();

                if (inpTekst.isEmpty()) {
                    System.out.println("Avslutter");
                    break;
                }

                Tekstanalyse programObj = new Tekstanalyse(inpTekst);
                System.out.println("Antall forskjellige: " + programObj.finnTotaltForskjelligeBokstaver());
                System.out.println("Totalt antall bokstaver: " + programObj.finnTotalAntallBokstaver());
                System.out.println(programObj.finnProsentIkkeBokstaver() + "% av tegnene er ikke bokstaver");
                System.out.println("Det er " + programObj.finnForekomstAvBokstav('e') + " forekomster av bokstaven e");
                System.out.println(programObj.finnFlestForekomster());
            }
        } catch (Exception e) {
            System.err.println("En feil oppstod: " + e.getMessage());
        } finally {
            scannerObj.close();
        }


    }



}
