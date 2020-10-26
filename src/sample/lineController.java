package sample;

import composite.line;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class lineController {

    @FXML
    TextField length;

    public void getLength(ActionEvent actionEvent) {
        int i=Integer.parseInt(length.getText());

        line drawLine=new line(100,100,100+i,100);

        drawLine.draw();
        Stage stage=new Stage();
        Group root = new Group(drawLine.linei);
        Scene scene = new Scene(root, 600, 300);
        stage.setTitle("Drawing a Circle");
        stage.setScene(scene);
        stage.show();
    }
}
