package cz.educanet;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class Controller {
    public void exit(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void changeScene(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/RoomOne.fxml"));
        Scene scene = new Scene(root, 800, 600);
        Window.stage.setScene(scene);
        Window.stage.setTitle("Room");
    }
}
