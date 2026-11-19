package com.ccasais.anchorthis;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class Ugly extends Application {

    private static Scene scene;
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("¿Conoces el significado del Dolor?");
        AnchorPane root = new AnchorPane();
        Rectangle rgreen = new Rectangle(Double.MAX_VALUE, 20.0);
        AnchorPane.setTopAnchor(rgreen, 0.0);
        Rectangle rturq = new Rectangle(560.0, 40.0);
        AnchorPane.setLeftAnchor(rturq, 30.0);
        Rectangle rblue = new Rectangle(40.0, 20.0);
        AnchorPane.setBottomAnchor(rblue, 0.0);
        root.getChildren().addAll(rgreen, rturq, rblue);
        scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    private static void main (String[] args) {launch();}
}
