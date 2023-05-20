package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class retStackPane {

    public Scene func(){

        Button btn = new Button("Click");

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("hello");
            }
        });

        StackPane sp = new StackPane();

        sp.getChildren().add(btn);

        Scene scn = new Scene(sp,700,700);

        return scn;

    }

}
