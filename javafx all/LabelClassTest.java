package com.example.demo2;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class LabelClassTest {

    public Scene f(){

        HBox root = new HBox();

        Label label = new Label();

        Image img = new Image("C:\\Users\\Reve\\Desktop\\R.png");

        ImageView icon = new ImageView(img);

        label.setText("Insta");

        label.setGraphic(icon);

        label.setGraphicTextGap(3);

        label.setFont(Font.font("Ariel", FontWeight.BOLD,18));

        root.getChildren().add(label);

        Scene ret = new Scene(root);

        return ret;


    }

}
