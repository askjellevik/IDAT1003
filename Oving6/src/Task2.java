import java.util.Scanner;
public class Task2 {

    private String inpTekst;
    private String[] antallTegn;

    public Task2(String inpTekst) {
        this.inpTekst = inpTekst;
        this.antallTegn = fyllAntallTegn();

    }

    public String[] fyllAntallTegn() {
        String[] antallTegn;
        antallTegn[0] = inpTekst.charAt(0);

        for (int i = 1; i < inpTekst.length(); i++) {
            boolean funnetLik = false;
            for (int j = 0; j < antallTegn.length; j++) {
                if (inpTekst[i] == antallTegn[j]) {

                }
                else {
                    antallTegn[i] = String.valueOf(inpTekst.charAt(i));
                }
            }
        }

        return antallTegn;
    }





    public static void main(String[] args){

        Scanner scannerObj = new Scanner(System.in);
        String inpTekst;

        while (true) {
            System.out.println("Skriv inn en tekst: ");
            inpTekst = scannerObj.nextLine();

            Task2 programObj = new Task2(inpTekst);

            programObj.finnBokstaver();
            programObj.finnTotalAntallBokstaver();
            programObj.finnProsentIkkeBokstaver();
            programObj.finnForekomstAvBokstav("a");
            programObj.finnFlestForekomster();
        }
    }



}
