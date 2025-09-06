import java.util.Random;
public class MinRandom {

    private Random object;

    public MinRandom() {
        object = new Random();
    }

    public int nesteHeltall(int nedre, int ovre) {
        return object.nextInt(ovre - nedre + 1) + nedre;
    }

    public double nesteDesimaltall(double nedre, double ovre) {
        return object.nextDouble() * (ovre - nedre) + nedre;
    }


    public static void main(String[] args) {
        MinRandom randomObj = new MinRandom();

        System.out.println("Nedre: 1, Øvre: 5. Random heltall: " + randomObj.nesteHeltall(1, 5));

        System.out.println("Nedre: 3, Øvre: 9. Random heltall: " + randomObj.nesteHeltall(3, 9));



        System.out.println("Nedre: 1, Øvre: 5. Random desimaltall: " + randomObj.nesteDesimaltall(1, 5));

        System.out.println("Nedre: 3, Øvre: 9. Random desimaltall: " + randomObj.nesteDesimaltall(3, 9));

    }

}
