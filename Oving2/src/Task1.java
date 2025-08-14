import java.util.Scanner;

public class Task1{


    //Et år er skuddår dersom det er delelig med 4. Unntaket er hundreårene, de må være delelig
    //med 400.
    //Tegn aktivitetsdiagram som viser algoritmen for å finne ut om et år er skuddår. Årstallet skal
    //leses inn fra brukeren. Sett opp testdata. Lag og prøv ut programmet.


    public static void main(String[] args) {

        System.out.println("Skriv inn et årstall fra år 0: ");

        Scanner scanner = new Scanner(System.in);


        try {
            int inpAar = scanner.nextInt();

            if (inpAar > 0) {
                if (inpAar % 4 == 0 || inpAar % 100 == 0 && inpAar % 400 == 0) {
                    System.out.println(inpAar + " er et skuddår");
                }
                else {
                    System.out.println(inpAar + " er ikke et skuddår");
                }
            }

        }
        catch (Exception e) {
            System.out.println("Skriv inn et årstall fra år 0");
            e.printStackTrace();
        }
        finally {
            scanner.close();
        }



    }
}