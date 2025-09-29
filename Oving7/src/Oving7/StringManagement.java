package Oving7;

public class StringManagement {


    private String string, capitalString;
    private int amountOfWords;
    private double averageWordLength, averageWordLengthPP;

    public StringManagement(String string) {
        this.string = string;
        this.amountOfWords = findAmountOfWords();
        this.averageWordLength = findAverageWordLength();
        this.averageWordLengthPP = findAverageWordLengthPerPeriod();
        this.capitalString = getCapitalString();



    }

    public int findAmountOfWords() {
        int amountOfWords = 0;


        return amountOfWords;
    }

    public double findAverageWordLength() {
        double averageWordLength = 0;

        return averageWordLength;
    }

    public double findAverageWordLengthPerPeriod() {
        double averageWordLengthPP = 0;

        return averageWordLengthPP;
    }

    public void replaceWord(String word) {

    }

    public String getString() {
        return string;
    }

    public String getCapitalString() {
        String capitalString = "";

        return capitalString;
    }



}
