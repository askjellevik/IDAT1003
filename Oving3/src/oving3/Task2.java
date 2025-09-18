package oving3;

import java.util.*;

public class Task2 {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    try {
        System.out.println("Skriv inn et tall så sjekker jeg om det er et primtall");
        int inpTall = scanner.nextInt();

        if (inpTall < 2){
            System.out.println("Du må skrive et positivt heltall");
        }
        else {
            boolean erPrimtall = true;


                for (int i = 2; i < inpTall; i++) {
                    if (inpTall % i == 0) {
                        erPrimtall = false;

                    }
                }




            if (erPrimtall) {
                System.out.println("Ja, " + inpTall + " er et primtall");
            }
            else {
                System.out.println("Nei, " + inpTall + " er ikke et primtall");

            }
        }



    } catch (Exception e) {
        System.out.println("Skriv kun inn et heltall");
        e.printStackTrace();
    }
    finally {
        scanner.close();
    }

}



}
