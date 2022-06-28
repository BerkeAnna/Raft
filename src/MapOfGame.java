import java.util.Map;
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
    Board board = new Board();

    public MapOfGame() {

        map=new Mapfield[height][width];
        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                map[i][j]= new Mapfield();
            }
        }
        doItemsToMap();

        mapWrite();
        //board.movePosition();
        board.kiir();
        playerStepsInMap();




    }

    public void doItemsToMap() {
        Random random = new Random();
        int endLoop = random.nextInt(2);
       for (int k = 0; k < 3; k++) { //max 3 item generated
        int newitem=3;

            for (int j = 0; j < width; j++) { // go on width
                    if(random.nextInt(100)<32) { //if less then 32  do board, else end of loop
                       int jtwo=random.nextInt(21);
                        map[0][jtwo] = board.posBoard(0, jtwo );
                        j=width-1;
                        newitem--;
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
