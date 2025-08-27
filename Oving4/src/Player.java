import java.util.Random;

public class Player {

    private String playerID;
    private int playerPoints;
    private Random terning;



    public Player(String playerID) {
        this.playerID = playerID;
        this.playerPoints = 0;
        this.terning = new Random();

    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public void setPlayerPoints(int playerPoints) {
        this.playerPoints = playerPoints;
    }


    public String getPlayerID() {
        return playerID;
    }
    public int getPlayerPoints() {
        return playerPoints;
    }

    public int kastTerning(){
        int terningkast = (terning.nextInt(6) + 1);
        return terningkast;
    }




}
