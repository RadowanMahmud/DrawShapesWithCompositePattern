package composite;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class DrawCircle implements iShape {

    private int x;
    private int y;
    private int radious;
    public Circle circle = new Circle();

    public DrawCircle(){

    }

    public DrawCircle(int x, int y, int radious){
        this.x=x;
        this.y=y;
        this.radious=radious;
    }
    @Override
    public void draw() {
        //Setting the properties of the circle
        circle.setCenterX(x);
        circle.setCenterY(y);
        circle.setRadius(radious);

    }
}
