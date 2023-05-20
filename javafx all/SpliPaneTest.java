package com.example.demo2;

import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.VBox;

public class SpliPaneTest {

    public Scene f(){

        Label l1 = new Label("Pane 1");

        Label l2 = new Label("Pane 2");

        l1.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);

        l2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        SplitPane root = new SplitPane();

        root.getItems().add(l1);

        root.getItems().add(l2);

        root.setDividerPosition(0,0.3);

        root.setOrientation(Orientation.VERTICAL);



        Scene ret = new Scene(root);

        return ret;

    }

}
