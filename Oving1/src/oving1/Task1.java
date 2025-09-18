package oving1;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        System.out.println("Skriv inn antall cm: ");
        Scanner scanner = new Scanner(System.in);

        try {
            int tomme = scanner.nextInt();
            double cm = tomme * 2.54;
            System.out.println(tomme + " er " + cm + " tommer.");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
