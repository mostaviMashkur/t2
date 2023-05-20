package com.example.demo2;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

public class TitledPaneTest {

    public Scene f(){

        TitledPane tp = new TitledPane();

        tp.setExpanded(false);

        tp.setCollapsible(true);

        tp.setText("View");

        tp.setContent(new Label("hello\nworld\nhello"));

//        tp.setAnimated(false);

        VBox root = new VBox();

        root.getChildren().addAll(tp);

        Scene ret = new Scene(root);

        return ret;

    }

}
