package com.example.demo2;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class ButtonEvenetHandling {

    public Scene f(){

        HBox root = new HBox();

        Button b1 = new Button();

        b1.setOnAction(Handler::myhandler);

        root.getChildren().add(b1);

        Scene ret = new Scene(root);

        return ret;

    }

}
