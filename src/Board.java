import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Board extends Mapfield {

    // We have a MAP. The key of MAP is the id of the item. The value of MAP is another map.
    //The key of map is the x coordinate, the value is the y coordinate

    private int x;
    private int y;

    public int boardId=0;

    Map<Integer, Map> item = new HashMap<>();
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
        item.put(boardId, position);
        boardId++;
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
    public void movePosition() {
        for (Map.Entry<Integer, Map> elem : item.entrySet()) {
            for (Map.Entry<Integer, Integer> elempos : position.entrySet()) {
                elempos.setValue(elempos.getValue()+1);
                System.out.println(elempos.getKey() + "\t" + elempos.getValue());
                elempos.setValue(elempos.getValue()+1);
                System.out.println(elempos.getKey() + "\t" + elempos.getValue());
                elempos.setValue(elempos.getValue()+1);
                System.out.println(elempos.getKey() + "\t" + elempos.getValue());
            }
        }
    }

    public void kiir() {
//        for (Map.Entry<Integer, Map> elem : item.entrySet()) {
//            System.out.println(elem.getKey() + "\t" + elem.getValue());
//        }
        Iterator elemek = item.entrySet().iterator();
        while (elemek.hasNext()) {
            Map.Entry elem = (Map.Entry) elemek.next();
            System.out.println(elem.getKey() + "\t" + elem.getValue());
        }
    }
}
