package oving4;

import java.util.*;

public class Task1 {


    public static void main(String[] args) {

        ArrayList<Valuta> currencyList = new ArrayList<>(); // Create an ArrayList object


        currencyList.add(new Valuta("USD", 12.2));
        currencyList.add(new Valuta("EUR", 11.2));
        currencyList.add(new Valuta("SEK", 1.6));

        System.out.println("Velg valuta å konvertere fra, eller skriv inn 4 for å avslutte:");
        for (int i = 0; i < currencyList.size(); i++) {
            System.out.println(i + 1 + ": " + currencyList.get(i).getValutaCode());
        }

        Scanner scannerObj = new Scanner(System.in);

        try {
            int userInput = scannerObj.nextInt();

            if (userInput < 1 || userInput > 4){
                System.out.println("Skriv inn et tall mellom 1 og 4");
            } else if (userInput == 4) {
                System.out.println("Programmet er avsluttet");
            }
            else {

            Valuta selected = currencyList.get(userInput - 1);

            System.out.println("Du valgte valutaen " + selected.getValutaCode() + ". Skriv inn hvor mye du vil konvertere fra");


            int inpUserAmount = scannerObj.nextInt();


            double convertedAmount = (inpUserAmount * selected.getAmount());

            System.out.println(inpUserAmount + " i NOK blir " + convertedAmount + " i " + selected.getValutaCode());

}
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scannerObj.close();
        }


    }



}
