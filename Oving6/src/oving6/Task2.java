package oving6;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class Task2 {

    final String inpTekst;
    private ArrayList<String> antallTegn;
    private String tegnTabell;


    public Task2(String inpTekst) {
        this.inpTekst = inpTekst;
        this.antallTegn = fyllAntallTegn();
        this.tegnTabell = "abcdefghijklmnopqrstuvwxyzæøå";

    }

    public ArrayList<String> fyllAntallTegn() {
        ArrayList<String> antallTegn = new ArrayList<>();

        for (int i = 0; i < inpTekst.length(); i++) {
                String tempTegn = String.valueOf(inpTekst.charAt(i));

                if (!antallTegn.contains(tempTegn)) {
                    antallTegn.add(tempTegn);
                }


        }

        return antallTegn;
    }

    public String finnBokstaver() {
        StringBuilder bokstaver = new StringBuilder();

        for (String s : antallTegn) {
            s = s.toLowerCase();
            if (tegnTabell.contains(s)) {
                bokstaver.append(s);
            }

        }
        return bokstaver.toString();
    }

    public int finnTotalAntallBokstaver() {
        int antallBokstaver = 0;
        for (int i = 0; i < inpTekst.length(); i++) {
            if (tegnTabell.contains(String.valueOf(Character.toLowerCase(inpTekst.charAt(i))))) {
                antallBokstaver++;
            }
        }
        return antallBokstaver;
    }

    public double finnProsentIkkeBokstaver() {
        double antallIkkeBokstaver = inpTekst.length() - finnTotalAntallBokstaver();
        double prosent = antallIkkeBokstaver / inpTekst.length() * 100;
        return Math.round(prosent);
    }

    public int finnForekomstAvBokstav(char bokstav) {
        int bokstavCount = 0;
        for (int i = 0; i < inpTekst.length(); i++) {
            char c = Character.toLowerCase(inpTekst.charAt(i));
            if (c == bokstav) {
                bokstavCount++;
            }
        }
        return bokstavCount;
    }

    public String finnFlestForekomster() {
        String bokstaver = inpTekst.replaceAll("[^a-zA-ZæøåÆØÅ]", "");


        HashMap<Character, Integer> bokstavForekomst = new HashMap<Character, Integer>();

        bokstavForekomst.put(bokstaver.charAt(0), 1);

        for (int i = 1; i < bokstaver.length(); i++) {
            char key = bokstaver.charAt(i);
            if (bokstavForekomst.containsKey(key)) {
                bokstavForekomst.put(key, bokstavForekomst.get(key) + 1);
            }
            else {
                bokstavForekomst.put(key, 1);
            }
        }
        char maxBokstav = 0;
        int maxFrekvens = 0;
        for (char key : bokstavForekomst.keySet()) {
            int denneFrekvensen = bokstavForekomst.get(key);
            if (denneFrekvensen > maxFrekvens) {
                maxBokstav = key;
                maxFrekvens = bokstavForekomst.get(key);
            }
        }

        return "bokstaven " + maxBokstav + ", som det var " + maxFrekvens + " forekomster av";
    }





    public static void main(String[] args){

        Scanner scannerObj = new Scanner(System.in);
        String inpTekst;

        try {
            while (true) {
                System.out.println("Skriv inn en tekst: ");
                inpTekst = scannerObj.nextLine();

                Task2 programObj = new Task2(inpTekst);
                System.out.println("Bokstaver: " + programObj.finnBokstaver());
                System.out.println("Antall bokstaver: " + programObj.finnTotalAntallBokstaver());
                System.out.println(programObj.finnProsentIkkeBokstaver() + "% av tegnene er ikke bokstaver");
                System.out.println("Det er " + programObj.finnForekomstAvBokstav('e') + " forekomster av bokstaven e");
                System.out.println("Det er flest forekomster av " + programObj.finnFlestForekomster());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            scannerObj.close();
        }


    }



}
