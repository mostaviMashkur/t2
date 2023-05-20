package com.example.demo2;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

public class HboxTest {

    public Scene f(){



        Button b1 = createButton("B1");

        Button b2 = createButton("B2");

        Button b3 = createButton("B3");

        Button b4 = createButton("B4");

        HBox root = new HBox();

//        root.setHgrow(b4, Priority.ALWAYS);

        root.getChildren().addAll(b1,b2,b3,b4);

        root.setSpacing(15);

        Scene sc = new Scene(root,500,500);

        return sc;
    }

    public Button createButton(String label){

        Button btn = new Button(label);

        btn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        HBox.setHgrow(btn,Priority.ALWAYS);

        return btn;

    }

}
