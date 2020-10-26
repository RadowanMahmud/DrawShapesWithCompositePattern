package sample;

import composite.Rectangle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class rectangleController {

    @FXML
    TextField width;
    @FXML TextField length;
    public void getValues(ActionEvent actionEvent) {
        int wid=Integer.parseInt(width.getText());
        int len=Integer.parseInt(length.getText());
        Rectangle rec=new Rectangle(len,wid);
        rec.draw();
    }
}
