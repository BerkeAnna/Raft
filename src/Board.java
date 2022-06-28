import java.util.*;

public class Board extends Mapfield {

    // We have a MAP. The key of MAP is the id of the item. The value of MAP is another map.
    //The key of map is the x coordinate, the value is the y coordinate

    private int x;
    private int y;

    public int boardId=0;

    //Map<Integer, Map> item = new HashMap<>();
    List<Map> item = new ArrayList<>();
    Map<Integer, Integer> position;

    public Board() {
    }

    public Board posBoard(int x, int y) {
        this.x = x;
        this.y = y;
        itemPosition(x, y);
        doBoard();
        return this;
    }

    public void doBoard() {
        item.add(position);


    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public void itemPosition(int x, int y) {


        position = new HashMap<>();
        position.put( y, x);


//        for(Map.Entry<Integer, Map> elem : item.entrySet()) {
//            System.out.println(elem.getKey() + "\t" + elem.getValue());
//        }
    }
    //TODO: movePosition: id player get step, the items go down
    //TODO: what id, it's not a map in map -> map in an list?
    public void movePosition() {
        for (int i=0; i < item.size(); i++) {
            for (Map.Entry<Integer, Integer> elempos : position.entrySet()) {
                elempos.setValue(elempos.getValue()+1);
                System.out.println(elempos.getKey() + "\t" + elempos.getValue());

            }
        }
    }

    public void kiir() {
//        for (Map.Entry<Integer, Map> elem : item.entrySet()) {
//            System.out.println(elem.getKey() + "\t" + elem.getValue());
//        }
        for (int i=0; i < item.size(); i++) {

            System.out.println( i +" " + item.get(i));

        }
    }
}
