import java.util.Random;
import java.util.Scanner;

public class MapOfGame {
    Mapfield[][] map;
    int height=35;
    int width=25;
    Player player = new Player();
    String lepes;
    Mapfield item;
    Mapfield n;
    Board br;

    public MapOfGame() {

        map=new Mapfield[height][width];
        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                map[i][j]= new Mapfield();
            }
        }
        doItemsToMap();

        mapWrite();

        playerStepsInMap();

    }

    public void doItemsToMap() {
        Random random = new Random();
        int endLoop = random.nextInt(2);
        for (int k = 0; k < 3; k++) { //max 3 item generated

            for (int j = 0; j < width; j++) { // go on width
                    if(random.nextInt(100)<32) { //if less then 32  do board, else end of loop

                        map[0][j] = new Board( /*0, random.nextInt(25)*/);
                        j=width-1;
                    }

            }
        }
    }

    public void mapWrite(){

        for(int i=0; i<height; i++) {
            for (int j = 0; j < width; j++) {

                if(drawPlayer(i , j)){
                    System.out.print("|00|");
                }
                else  if(map[i][j] instanceof Board){
                    System.out.print("|BO|");
                }
                else if(map[i][j] instanceof Mapfield){
                    System.out.print("|  |");
                }
            }
            System.out.println();
        }
    }

    public boolean drawPlayer(int i, int j){
                if(player.getPlayerposX()==i && player.getPlayerposY() == j){
                    return true;
                }
        return false;
    }

    //todo: problem: if player steps the last positions stay |00| instead of |  | --- corrected
    public void playerStepsInMap(){
        Scanner scanner = new Scanner(System.in);
        lepes = scanner.nextLine();
        player.playerSteps(lepes);


        mapWrite();
        playerStepsInMap();
    }


}
