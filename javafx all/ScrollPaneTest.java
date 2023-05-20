package com.example.demo2;

import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

import java.io.FileInputStream;

public class ScrollPaneTest {

//    public static FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Reve\\Desktop\\R2.png");

    public Scene f(){

        Image img = new Image(HelloApplication.fileInputStream);

        ImageView iv = new ImageView(img);

        ScrollPane root = new ScrollPane(iv);

        root.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);

        root.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);

        Scene ret = new Scene(root,700,700);

        return ret;

    }

}
