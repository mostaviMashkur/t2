package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class CheckBoxTest {

    public Scene f(){

        HBox root = new HBox();

        CheckBox cb = new CheckBox();

        cb.setText("pizza");

        Label lb = new Label();

        //font set kora jay setFont diye

        cb.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(cb.isSelected()){
                    System.out.println("Pizza is selected");
                    lb.setText(cb.getText());
                }
                else lb.setText("");
            }
        });

        root.getChildren().addAll(cb,lb);

        Scene ret = new Scene(root);

        return ret;

    }

}
