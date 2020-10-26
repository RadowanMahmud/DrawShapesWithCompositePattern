package composite;

import javafx.scene.shape.Line;

public class line implements iShape {
    private int strtx;
    private int strty;
    private int endx;
    private int endy;
    public  Line linei = new Line();

    public line(){

    }

    public line(int strtx,int strty,int endx,int endy){
        this.strtx=strtx;
        this.strty=strty;
        this.endx=endx;
        this.endy=endy;
    }

    @Override
    public void draw() {

        //Setting the properties to a line
        linei.setStartX(strtx);
        linei.setStartY(strty);
        linei.setEndX(endx);
        linei.setEndY(endy);

    }
}
