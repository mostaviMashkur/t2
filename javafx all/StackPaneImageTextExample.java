package com.example.demo2;

import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Screen;


public class StackPaneImageTextExample {

    public Scene f(){

        Image im;
        im = new Image("C:\\Users\\Reve\\Desktop\\im2.jpg");

        ImageView img = new ImageView(im);

        img.setPreserveRatio(true);

        StackPane root = new StackPane();

//        root.setBackground(new Background(new BackgroundFill(Color.WHITE,null,null)));

        root.setAlignment(Pos.CENTER);

        img.fitWidthProperty().bind(root.widthProperty());

        img.fitHeightProperty().bind(root.heightProperty());

        Text text = new Text("Hello World");

        root.getChildren().add(img);

        root.getChildren().add(text);

        root.setAlignment(text,Pos.BOTTOM_CENTER);

        Scene ret = new Scene(root, root.getWidth(), root.getHeight());

        return  ret;

    }

}
