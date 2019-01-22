public class Thing2 extends CreatureWorldThing {
    private int myColor;

    public Thing2(int _id){
        super(_id, CreatureWorldApp.getApp().width/2, CreatureWorldApp.getApp().height/2 + 150, 1);

        myColor = app.color(0, 255, 0);
    }

    public void display(){
        app.rectMode(app.CENTER);
        app.fill(myColor);
        app.rect(getX(), getY(), 50, 50);
    }

    public void behave(){
        int oldY = getY();
        int direction = getDirection();
        int newY = oldY + direction;
        setY(newY);
        if (newY > app.height || newY < 0){
            setDirection(-direction);
        }
    }

    public void interact(CreatureWorldThing[] things){
        for (int i = 0; i < things.length; i++){
            if (things[i].getID() != getID()){ // not itself
                if (app.dist(things[i].getX(), things[i].getY(), getX(), getY()) < 25){
                    myColor = app.color(0, app.random(255), 0);
                }
            }
        }
    }
}