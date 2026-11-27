package com.ccasais.anchorthis;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.Region;
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
        Region rgreen = new Region();
        rgreen.setBackground(Background.fill(Color.GREEN));
        AnchorPane.setTopAnchor(rgreen, 0.0);
        AnchorPane.setLeftAnchor(rgreen, 0.0);
        AnchorPane.setRightAnchor(rgreen, 0.0);
        AnchorPane.setBottomAnchor(rgreen, 450.0);
        Region rturq = new Region();
        rturq.setBackground(Background.fill(Color.TURQUOISE));
        AnchorPane.setTopAnchor(rturq, 30.0);
        AnchorPane.setLeftAnchor(rturq, 0.0);
        AnchorPane.setRightAnchor(rturq, 80.0);
        AnchorPane.setBottomAnchor(rturq, 400.0);
        Rectangle rblue = new Rectangle(80.0, 20.0);
        rblue.setFill(Color.BLUE);
        VBox center = new VBox(rblue);
        center.setAlignment(Pos.CENTER);
        AnchorPane.setLeftAnchor(center, 0.0);
        AnchorPane.setRightAnchor(center, 0.0);
        AnchorPane.setBottomAnchor(center, 0.0);
        root.getChildren().addAll(rgreen, rturq, center);
        scene = new Scene(root, 640, 480);
        scene.setFill(Color.BURLYWOOD);
        stage.setScene(scene);
        stage.show();
    }

    private static void main (String[] args) {launch();}
}
