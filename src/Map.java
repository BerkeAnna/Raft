public class Map {
    Mapfield[][] map;
    int height=35;
    int width=25;
    Player player = new Player();

    public Map() {

        map=new Mapfield[height][width];
        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                map[i][j]= new Mapfield();
            }
        }
        mapWrite();
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
                    map[i][j]=new Player();
                }
            }
            }
    }
}
