import java.util.*;

public class Task1 {


    static public void main(String[] args) {

        ArrayList<Valuta> objects = new ArrayList<>(); // Create an ArrayList object


        objects.add(new Valuta("USD", 12.2));
        objects.add(new Valuta("EUR", 11.2));
        objects.add(new Valuta("SEK", 1.6));

        System.out.println("Velg valuta å konvertere fra, eller skriv inn 4 for å avslutte:");
        for (int i = 0; i < objects.size(); i++) {
            System.out.println(i + 1 + ": " + objects.get(i).valutaCode);
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

            Valuta selected = objects.get(userInput - 1);

            System.out.println("Du valgte valutaen " + selected.valutaCode + ". Skriv inn hvor mye du vil konvertere fra");


            int inpUserAmount = scannerObj.nextInt();


            double convertedAmount = (inpUserAmount * selected.amount);

            System.out.println(inpUserAmount + " i NOK blir " + convertedAmount + " i " + selected.valutaCode);

}
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scannerObj.close();
        }


    }



}
