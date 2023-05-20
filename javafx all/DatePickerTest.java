package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.shape.SVGPath;
import javafx.scene.text.Font;

import java.time.LocalDate;

public class DatePickerTest {

    public Scene f(){

        VBox root = new VBox();

        Scene ret = new Scene(root);

        DatePicker dp = new DatePicker();

//        dp.setValue(LocalDate.now());

        dp.setValue(LocalDate.of(1900,12,23));

        Label lb = new Label();

        lb.setFont(Font.font("Times New Roman",18));

        dp.setFocusTraversable(false);

        root.requestFocus();

        dp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lb.setText(dp.getValue().toString());
            }
        });

        root.getChildren().addAll(dp, lb);

        return ret;

    }

}
