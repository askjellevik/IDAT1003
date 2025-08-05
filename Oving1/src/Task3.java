import java.util.Scanner;

public class Task3 {

// Skriv et program som leser inn et antall sekunder og beregner hvor mange timer, minutter og
//sekunder dette er. (Hint: Bruk heltallsdivisjon.) Sett opp testdatasett og prøv ut programmet.


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv inn antall sekunder:");


        try {
            int inpSekunder = scanner.nextInt();

            int timer = inpSekunder / 3600;

            int minutter = (inpSekunder - timer * 3600) / 60;

            int sekunder = inpSekunder - timer * 3600 - minutter * 60;

            System.out.println("Du skrev inn " + inpSekunder + ", det tilsvarer " + timer + " timer, " + minutter + " minutter, " + sekunder + " sekunder.");
        }
        catch (Exception e) {
            System.out.println("Skriv inn et heltall");
            e.printStackTrace();
        }
        finally {
            scanner.close();
        }



    }


}
