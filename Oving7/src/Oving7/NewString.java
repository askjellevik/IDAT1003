package Oving7;
import java.util.Scanner;


public class NewString {

    private final String string;

    public NewString(String string) {
        this.string = string;
    }


    public NewString shortenString() {
        String[] words = string.trim().split("\\s+");
        String result = "";
        for (String word : words) {
            result += word.charAt(0);
        }

        return new NewString(result);
    }

    public NewString removeChar(String charToRemove) {
        String result = string;
        int indexToRemove = result.indexOf(charToRemove);
        while (result.contains(charToRemove)) {
            result = result.substring(0, indexToRemove) + result.substring(indexToRemove + 1);
            indexToRemove = result.indexOf(charToRemove);
        }

        return new NewString(result);
    }

    @Override
    public String toString() {
        return string;
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inpChoice;
        String inpString, inpChar;

        try {
            while (true) {
                inpChoice = 0;
                inpString = "";
                inpChar = "";
                System.out.println("Enter a string: ");
                inpString = scanner.nextLine();

                NewString string = new NewString(inpString);

                System.out.println("Enter the method of your choice: ");
                System.out.println("1: Shorten this string");
                System.out.println("2: Remove specific letter from this string");
                System.out.println("3: Stop the program");


                inpChoice = scanner.nextInt();
                scanner.nextLine();


                if (inpChoice == 1) {
                    System.out.println("You chose to shorten the string. Here is the result: ");
                    System.out.println(string.shortenString());
                } else if (inpChoice == 2) {
                    System.out.println("You chose to remove specific letter from this string. ");
                    System.out.println("Enter a letter of your choice:");
                    inpChar = scanner.nextLine();
                    if (inpChar.length() > 1) {
                        throw new RuntimeException("You entered more than one letter.");
                    }

                    System.out.println("You chose the letter " + inpChar + ". Here is the result:");
                    System.out.println(string.removeChar(inpChar));

                } else if (inpChoice == 3) {
                    System.out.println("Stopping the program");
                    break;
                } else {
                    System.out.println("Did not recognize the input. Program stopped");
                    break;
                }
                System.out.println("----------");

            }



        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            scanner.close();
        }

    }



}
