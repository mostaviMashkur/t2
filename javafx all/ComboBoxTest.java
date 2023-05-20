package com.example.demo2;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;

public class ComboBoxTest {

    public Scene f(){

        VBox root = new VBox();

        Scene ret = new Scene(root,1300,700);

        RadioButton r1 = new RadioButton("Pizza");

        RadioButton r2 = new RadioButton("Burger");

        Label lb = new Label();

        ToggleGroup tg = new ToggleGroup();

        r1.setToggleGroup(tg);

        r2.setToggleGroup(tg);

        tg.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observableValue, Toggle toggle, Toggle t1) {
                RadioButton rb = (RadioButton) t1;

                lb.setText(rb.getText());

            }
        });

//        VBox vb = new VBox();

        root.getChildren().addAll(r1,r2,lb);

        return ret;

    }

}
