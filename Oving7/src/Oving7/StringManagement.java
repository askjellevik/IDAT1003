package Oving7;
import java.util.Scanner;
public class StringManagement {


    private String string;
    private int amountOfWords;
    private double averageWordLength, averageWordLengthPP;
    private String[] words;

    public StringManagement(String string) {
        this.string = string.trim();
        this.words = string.split("\\s+");
        this.amountOfWords = findAmountOfWords();
        this.averageWordLength = findAverageWordLength();
        this.averageWordLengthPP = findAverageWordLengthPerPeriod();

    }

    public int findAmountOfWords() {
        int amountOfWords = 0;
        if (!string.isEmpty()) {
            amountOfWords = words.length;
        }

        return amountOfWords;
    }

    public double findAverageWordLength() {
        double averageWordLength = 0;

        if (!string.isEmpty()) {
            for (int i = 0; i < words.length; i++) {
                averageWordLength += words[i].length();
            }
            averageWordLength /= words.length;        }


        return averageWordLength;
    }

    public double findAverageWordLengthPerPeriod() {
        double averageWordLengthPP = 0;
        int totalWordsPP;
        if (string.isEmpty()) {
            totalWordsPP = 0;
        } else {
            totalWordsPP = 0;
            String[] periods = string.split("[.!?:]");
            for (String period : periods) {
                String[] wordsInPeriod = period.trim().split("\\s+");
                totalWordsPP += wordsInPeriod.length;
            }
            averageWordLengthPP = (double) totalWordsPP / periods.length;
        }
            return averageWordLengthPP;
        
    }

    public void replaceWord(String oldWord, String newWord) {
        string = string.replaceAll("\\b" + oldWord + "\\b", newWord);
        words = string.split("\\s+");
        amountOfWords = findAmountOfWords();
        averageWordLength = findAverageWordLength();
        averageWordLengthPP = findAverageWordLengthPerPeriod();
    }

    public String getString() {
        return string;
    }

    public String getCapitalString() {

        return getString().toUpperCase();
    }


    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean runCode = true;

    try {

        System.out.println("Enter a string: ");
        String inpString = scanner.nextLine();

        StringManagement stringObject = new StringManagement(inpString);

        while (runCode) {
            System.out.println("----------------");
            System.out.println("Enter the number corresponding to your choice: ");
            System.out.println("1: Find amount of words");
            System.out.println("2: Find average word length");
            System.out.println("3: Find average word length per period");
            System.out.println("4: Replace a word with another word");
            System.out.println("5: Display the string");
            System.out.println("6: Display the string in capital letters");
            System.out.println("7: Stop the program");

            int inpChoice = scanner.nextInt();
            scanner.nextLine();

            switch (inpChoice) {
                case 1:
                    System.out.println("There are " + stringObject.findAmountOfWords() + " words in the string");
                    break;
                case 2:
                    System.out.println("The average word length is " + stringObject.findAverageWordLength() + " words");

                    break;
                case 3:
                    System.out.println("The average word length per period is " + stringObject.findAverageWordLengthPerPeriod() + " words");

                    break;
                case 4:
                    System.out.println("Enter the word you want to have replaced: ");
                    String oldWord = scanner.nextLine();
                    System.out.println("Now enter the new word to replace it with: ");
                    String newWord = scanner.nextLine();
                    stringObject.replaceWord(oldWord, newWord);
                    System.out.println("The word " + oldWord + " have now been replaced with " + newWord);

                    break;
                case 5:
                    System.out.println(stringObject.getString());
                    break;
                case 6:
                    System.out.println(stringObject.getCapitalString());
                    break;
                case 7:
                    System.out.println("Ending program");
                    runCode = false;
                    break;
                default:

            }

        }



    }
    finally {
        scanner.close();
    }

    }



}
