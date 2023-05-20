package com.example.demo2;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class BorderPaneTest {

    public Scene f()
    {

        Button top = createButton("Top");

        Button left = createButton("Left");

        Button right = createButton("Right");

        Button center = createButton("Center");

        Button bottom = createButton("Bottom");

        BorderPane bp = new BorderPane();

        bp.setTop(top);

        bp.setLeft(left);

        bp.setCenter(center);

        bp.setRight(right);

        bp.setBottom(bottom);

        Scene sc = new Scene(bp,500,500);

        return sc;

    }

    public Button createButton(String label){
        Button btn = new Button(label);

//        btn.setMinSize(100,100);

        btn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

//        BorderPane.setMargin(btn,new Insets(10));

        BorderPane.setAlignment(btn, Pos.CENTER);

        return btn;
    }

}
