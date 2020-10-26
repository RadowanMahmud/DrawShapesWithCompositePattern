package sample ;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    private AnchorPane rootpane;
    Stage stage;


    public void clickedLine(ActionEvent actionEvent) {
        try {
            stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            Parent pane=FXMLLoader.load(getClass().getResource("line.fxml"));
            Scene scene = new Scene(pane);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.getMessage().toString();
        }
    }

    public void clickedCircle(ActionEvent actionEvent) {
        try {
            stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            Parent pane=FXMLLoader.load(getClass().getResource("circle.fxml"));
            Scene scene = new Scene(pane);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.getMessage().toString();
        }
    }

    public void clickedRectenagle(ActionEvent actionEvent) {
        try {
            stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            Parent pane=FXMLLoader.load(getClass().getResource("rectangle.fxml"));
            Scene scene = new Scene(pane);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.getMessage().toString();
        }
    }

    public void clickedFlag(ActionEvent actionEvent) {
        try {
            stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            Parent pane=FXMLLoader.load(getClass().getResource("flag.fxml"));
            Scene scene = new Scene(pane);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.getMessage().toString();
        }
    }
}
