package com.ccasais.anchorthis;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class Ugly extends Application {

    private static Scene scene;
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("¿Conoces el significado del Dolor?");
        AnchorPane root = new AnchorPane();
        Rectangle rgreen = new Rectangle(640, 40.0);
        rgreen.setFill(Color.GREEN);
        AnchorPane.setTopAnchor(rgreen, 0.0);
        Rectangle rturq = new Rectangle(560.0, 80.0);
        rturq.setFill(Color.TURQUOISE);
        AnchorPane.setRightAnchor(rturq, 80.0);
        AnchorPane.setTopAnchor(rturq, 40.0);
        Rectangle rblue = new Rectangle(80.0, 20.0);
        rblue.setFill(Color.BLUE);
        AnchorPane.setBottomAnchor(rblue, 0.0);
        AnchorPane.setLeftAnchor(rblue, 280.0);
        root.getChildren().addAll(rgreen, rturq, rblue);
        scene = new Scene(root, 640, 480);
        scene.setFill(Color.BURLYWOOD);
        stage.setScene(scene);
        stage.show();
    }

    private static void main (String[] args) {launch();}
}
