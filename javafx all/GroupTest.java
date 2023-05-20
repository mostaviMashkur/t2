package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class GroupTest {

    public Scene f(){

        Group root = new Group();

        Scene ret = new Scene(root);

        Button b1 = new Button("SDDADDDAADASDSD");

        Button b2 = new Button("SADSDASD");

        TextField tf = new TextField();

        tf.setFocusTraversable(false);

        tf.setPromptText("No buttons pressed");

        tf.setLayoutX(300);

        tf.setLayoutY(300);

        root.getChildren().addAll(tf,b1,b2);

        b1.setLayoutX(500);

        b1.setLayoutY(500);

        root.requestFocus();

        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                System.out.println("Button 1");
                tf.setText("Button 1");
                root.requestFocus();
            }
        });

        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                tf.setText("Button 2");
                root.requestFocus();
            }
        });

        return ret;

    }

}
