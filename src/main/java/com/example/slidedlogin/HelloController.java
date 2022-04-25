package com.example.slidedlogin;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Pane pane1;

    @FXML
    private Pane pane2;

    @FXML
    private Pane pane3;

    @FXML
    private Pane pane4;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        pane1.setStyle("-fx-background-image: url('1.jpg')");
        pane2.setStyle("-fx-background-image: url('2.jpg')");
        pane3.setStyle("-fx-background-image: url('3.jpg')");
        pane4.setStyle("-fx-background-image: url('4.jpg')");
        backgroundAnimation();
    }

    private void backgroundAnimation() {
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(3), pane4);
        fadeTransition.setFromValue(1);
        fadeTransition.setToValue(0);
        fadeTransition.play();
        fadeTransition.setOnFinished(actionEvent -> {
            FadeTransition fadeTransition1 = new FadeTransition(Duration.seconds(3), pane3);
            fadeTransition1.setFromValue(1);
            fadeTransition1.setToValue(0);
            fadeTransition1.play();
            fadeTransition1.setOnFinished(actionEvent1 -> {
                FadeTransition fadeTransition2 = new FadeTransition(Duration.seconds(3), pane2);
                fadeTransition2.setFromValue(1);
                fadeTransition2.setToValue(0);
                fadeTransition2.play();
                fadeTransition2.setOnFinished(actionEvent2 -> {
                    FadeTransition fadeTransition0 = new FadeTransition(Duration.seconds(3), pane4);
                    fadeTransition0.setFromValue(1);
                    fadeTransition0.setToValue(0);
                    fadeTransition0.play();
                });
            });
        });
    }
}