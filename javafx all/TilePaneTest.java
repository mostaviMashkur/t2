package com.example.demo2;

import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;

public class TilePaneTest {

    public Scene f(){

        Button b1 = new Button("MM");

        Button b2 = new Button("FDFDFD");

        Button b3 = new Button("DDSAD");

        Button b4 = new Button("SADSDAD");

        b3.setPrefSize(100,100);

//        b1.setAlignment(Pos.TOP_LEFT);

        TilePane.setAlignment(b1, Pos.BOTTOM_RIGHT);

        TilePane root = new TilePane();

        root.setOrientation(Orientation.VERTICAL);

        root.getChildren().addAll(b1,b2,b3,b4);

        Scene ret = new Scene(root,500,500);

        return ret;

    }

    public Button createButton(String label){

        Button btn = new Button(label);

        return btn;

    }

}
