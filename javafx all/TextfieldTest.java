package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class TextfieldTest {

    public Scene f(){

        HBox root = new HBox();

        TextField tf = new TextField();

        tf.setPromptText("Welcome");

        tf.setFocusTraversable(false);

        tf.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String str = tf.getText();

                System.out.println(str);
                tf.setText("");
                tf.setFocusTraversable(false);

                root.requestFocus();
            }
        });

        root.getChildren().addAll(tf);

        Scene ret = new Scene(root);

        return ret;

    }

}
