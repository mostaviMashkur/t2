package com.example.demo2;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class ToolTipTest {

    public Scene f(){

        Button b = new Button("New");

        b.setFont(Font.font("Ariel",14));

        Tooltip tt = new Tooltip("Create new document");

        ImageView iv = new ImageView(new Image(HelloApplication.fileInputStream));

//        tt.setGraphic(iv);



        try {


            b.setTooltip(tt);
        } catch (Exception e){
            e.printStackTrace();
        }


        VBox root = new VBox();

        root.getChildren().addAll(b);

        Scene ret = new Scene(root);

        return ret;

    }

}
