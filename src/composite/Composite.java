package composite;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Composite implements iShape {

    ArrayList<iShape> list=new ArrayList<iShape>();

    public abstract void build();
    public abstract void paste();


    public void draw(){
        build();
        Iterator<iShape> iter = list.iterator();

        while (iter.hasNext()) {
            iter.next().draw();
        }
       paste();
    }
}
