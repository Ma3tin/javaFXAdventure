package cz.educanet;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Window extends Application {
    public static Stage stage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/adventure.fxml"));
        Scene primary = new Scene(root, 800, 600);
        primaryStage.setTitle("Adventure");
        primaryStage.setScene(primary);
        primaryStage.show();
        stage = primaryStage;
    }
}
