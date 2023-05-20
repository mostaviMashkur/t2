package com.example.demo2;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class LambdaTest {

    public Scene f(){


        Button btn = new Button("Exit");

        btn.setOnAction(e -> {
            System.out.println("Exiting the system");
            System.exit(0);
        });

        VBox vb = new VBox();

        vb.getChildren().add(btn);

        Scene sc = new Scene(vb,700,700);

        return sc;

    }

}
