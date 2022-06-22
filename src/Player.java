import java.util.Objects;

public class Player extends Mapfield {
    private int playerposX =34;
    private int playerposY =10;
    private int activityPoints;

    public int getPlayerposX() {
        return playerposX;
    }

    public void setPlayerposX(int playerposX) {
        this.playerposX = playerposX;
    }

    public int getPlayerposY() {
        return playerposY;
    }

    public void setPlayerposY(int playerposY) {
        this.playerposY = playerposY;
    }

    public int getActivityPoints() {
        return activityPoints =1000;
    }

    public void setActivityPoints(int activityPoints) {
        this.activityPoints = activityPoints;
    }

    public void playerSteps(String s){
        if(Objects.equals(s, "a")){
            setPlayerposY(getPlayerposY()-1);
        }
    }
}
