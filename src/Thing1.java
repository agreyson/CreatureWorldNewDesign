public class Thing1 extends CreatureWorldThing {
    private int myColor;

    public Thing1(int _id){
        super(_id, CreatureWorldApp.getApp().width/2 + 150, CreatureWorldApp.getApp().height/2, 1);

        myColor = app.color(255, 0, 0);
    }

    public void display(){
        app.rectMode(app.CENTER);
        app.fill(myColor);
        app.ellipse(getX(), getY(), 50, 50);
    }

    public void behave(){
        int oldX = getX();
        int direction = getDirection();
        int newX = oldX + direction;
        setX(newX);
        if (newX > app.width || newX < 0){
            setDirection(-direction);
        }
    }
}