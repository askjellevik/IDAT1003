public class Player {

    private String playerID;
    private int playerPoints;

    public Player(String playerID) {
        this.playerID = playerID;
        this.playerPoints = 0;
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




}
