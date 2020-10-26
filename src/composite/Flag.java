package composite;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Flag extends Composite {
    private int wid;
    private int len;
    line l1,l2,l3,l4;
    DrawCircle c1;

    public Flag(){

    }

    public Flag(int len,int wid){
        this.len=len;
        this.wid=wid;
    }
    @Override
    public void build() {
        l1=new line(100,100,100+len,100);
        list.add(l1);
        l2=new line(100+len,100,100+len,100+wid);
        list.add(l2);
        l3=new line(100+len,100+wid,100,100+wid);
        list.add(l3);
        l4=new line(100,100+wid,100,100);
        list.add(l4);
        c1=new DrawCircle((100+len/2),(100+wid/2),wid/3);
        list.add(c1);
    }

    @Override
    public void paste() {
        Group g = new Group();

        g.getChildren().add(l1.linei);
        g.getChildren().add(l2.linei);
        g.getChildren().add(l3.linei);
        g.getChildren().add(l4.linei);
        g.getChildren().add(c1.circle);

        Stage stage=new Stage();
        stage.setTitle("Drawing a Circle");
        Scene scene = new Scene(g,550, 550, Color.web("0xffffff",1.0));
        stage.setScene(scene);
        stage.show();
    }

}
