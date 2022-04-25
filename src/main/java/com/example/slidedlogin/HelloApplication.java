package com.example.slidedlogin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        AnchorPane pane =  loader.load();
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
//        primaryStage.resizableProperty().setValue(false);
        primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}