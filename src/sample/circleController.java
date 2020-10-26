package sample;

import composite.DrawCircle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class circleController {
    @FXML
    TextField radious;
    @FXML
    TextField xvalue;
    @FXML
    TextField yvalue;

    Stage stage = new Stage();


    public void getValues(ActionEvent actionEvent) {
        String r=radious.getText();
        int radious = Integer.parseInt(r);
        String x=xvalue.getText();
        int x1=Integer.parseInt(x);
        String y=yvalue.getText();
        int y1=Integer.parseInt(y);

        DrawCircle drawCircle =new DrawCircle(x1,y1,radious);
        drawCircle.draw();

        Group root = new Group(drawCircle.circle);
        Scene scene = new Scene(root, 600, 300);
        stage.setTitle("Drawing a Circle");
        stage.setScene(scene);
        stage.show();

    }
}
