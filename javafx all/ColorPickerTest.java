package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class ColorPickerTest {

    public Scene f(){

        VBox root = new VBox();

        ColorPicker cp = new ColorPicker();

        cp.setValue(Color.BLUEVIOLET);

        cp.setFocusTraversable(false);

        cp.setStyle("-fx-alignment: top;");

        cp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                Color clr = cp.getValue();

                root.setBackground(new Background(new BackgroundFill(clr,null,null)));

            }
        });

        root.getChildren().addAll(cp);

        root.setAlignment(Pos.CENTER);

        Scene ret = new Scene(root);

        return ret;

    }

}
