import java.util.Scanner;

public class Map {
    Mapfield[][] map;
    int height=35;
    int width=25;
    Player player = new Player();
    String lepes;

    public Map() {

        map=new Mapfield[height][width];
        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                map[i][j]= new Mapfield();
            }
        }
        mapWrite();
        playerStepsInMap();
    }

    public void mapWrite(){
        drawPlayer();
        for(int i=0; i<height; i++) {
            for (int j = 0; j < width; j++) {

                if(map[i][j] instanceof  Player){
                    System.out.print("|00|");
                }
                else if(map[i][j] instanceof Mapfield){
                    System.out.print("|  |");
                }
            }
            System.out.println();
        }
    }

    public void drawPlayer(){
        for(int i=0; i<height; i++) {
            for (int j = 0; j < width; j++) {
                if(player.getPlayerposX()==i && player.getPlayerposY() == j){
                    map[i][j]= new Player();
                }
            }
            }
    }
    //todo: problem: if player steps the last positions stay |00| instead of |  |
    public void playerStepsInMap(){
        Scanner scanner = new Scanner(System.in);
        lepes = scanner.nextLine();
        player.playerSteps(lepes);
        mapWrite();
        playerStepsInMap();
    }
}
