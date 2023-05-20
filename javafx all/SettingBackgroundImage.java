package com.example.demo2;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class SettingBackgroundImage {

    public Scene f(){

        VBox root = new VBox();

        Image im = new Image("C:\\Users\\Reve\\Desktop\\bg.jpg");

        BackgroundImage bimg = new BackgroundImage(
                im,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(100,100,true,true,true,true)
        );

        Background bg = new Background(bimg);

        root.setBackground(bg);

        Scene ret = new Scene(root);

        return ret;

    }

}
