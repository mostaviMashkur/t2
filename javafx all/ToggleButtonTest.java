package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class ToggleButtonTest {

    public Scene f(){

        VBox root = new VBox();

        Scene ret = new Scene(root);

        ToggleButton tb = new ToggleButton("On/OFF");

        Circle crc = new Circle(100);

        crc.setFill(Color.WHITE);

        crc.setStroke(Color.RED);

        tb.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(tb.isSelected()){
                    crc.setFill(Color.BLACK);
//                    root.requestFocus();
                }
                else
                {
                    root.requestFocus();
                    crc.setFill(Color.WHITE);}
            }
        });

        root.getChildren().addAll(tb,crc);

        return ret;

    }

}
