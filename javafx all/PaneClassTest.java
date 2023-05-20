package com.example.demo2;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;

public class PaneClassTest {

    public Scene f(){

        Pane root = new Pane();

        Button b1 = new Button("button 1");

        Button b2 = new Button("button 2");

        b1.relocate(500,500);

        b2.setLayoutX(50);

        b2.setLayoutY(50);

        b1.layoutXProperty().bind(root.widthProperty().multiply(.5));

        b1.layoutYProperty().bind(root.heightProperty().multiply(.5));

        root.getChildren().addAll(b1,b2);

        HBox.setHgrow(root, Priority.ALWAYS);

        Scene ret = new Scene(root,1300,700);

        return ret;

    }
}
