public class CreatureWorldThing {
    private int id;
    private int x;
    private int y;
    private int direction;
    protected final CreatureWorldApp app = CreatureWorldApp.getApp();

    public CreatureWorldThing(int _id, int _x, int _y, int _direction){
        id = _id;
        x = _x;
        y = _y;
        direction = _direction;
    }

    public int getID(){
        return id;
    }

    public int getX(){
        return x;
    }

    public void setX(int _x){
        x = _x;
    }

    public int getY(){
        return y;
    }

    public void setY(int _y){
        y = _y;
    }

    public int getDirection(){
        return direction;
    }

    public void setDirection(int _direction){
        direction = _direction;
    }

    public void display(){
    }

    public void behave(){
    }

    public void interact(CreatureWorldThing[] things){
    }
}
