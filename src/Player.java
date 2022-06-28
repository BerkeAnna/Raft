import java.util.Map;
import java.util.Objects;

public class Player extends Mapfield {
    private int playerposX ;
    private int playerposY ;
    private int activityPoints;

    public Player() {
        this.playerposX = 34;
        this.playerposY = 10;
        this.activityPoints = 1000;
    }

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
        else if(Objects.equals(s, "d")){
            setPlayerposY(getPlayerposY()+1);
        }
        else if(Objects.equals(s, "w")){
            setPlayerposX(getPlayerposX()-1);
        }
        else if(Objects.equals(s, "s")){
            setPlayerposX(getPlayerposX()+1);
        }
    }


}
