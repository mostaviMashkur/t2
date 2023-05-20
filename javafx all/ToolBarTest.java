package com.example.demo2;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Separator;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.VBox;

public class ToolBarTest {

    public Scene f(){

        Button b1 = new Button("BTN1");

        Button b2 = new Button("BTN2");

        Button b3 = new Button("BTN3");

        ToolBar tb = new ToolBar();

        tb.getItems().addAll(b1,b2, new Separator(), b3);

        VBox root = new VBox();

        root.setAlignment(Pos.CENTER);

        root.getChildren().addAll(tb);

        Scene ret = new Scene(root);

        return ret;

    }

}
