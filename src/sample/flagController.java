package sample;

import composite.Flag;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class flagController {
    @FXML
    TextField length;
    @FXML
    TextField width;
    public void getValues(ActionEvent actionEvent) {int wid=Integer.parseInt(width.getText());
        int len=Integer.parseInt(length.getText());
        Flag rec=new Flag(len,wid);
        rec.draw();

    }
}
