package com.example.demo2;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

import java.text.DecimalFormat;

public class SliderTest {

    private static final DecimalFormat decfor = new DecimalFormat("0.00");

    public Scene f(){

        BorderPane root = new BorderPane();

        Scene ret = new Scene(root);

        Slider slider = new Slider();

        slider.setMax(1000);

        slider.setMin(0);

        slider.setValue(420);

        slider.setShowTickLabels(true);

        slider.setShowTickMarks(true);

        slider.setMajorTickUnit(10);

        slider.setMinorTickCount(10);

//        slider.setSnapToTicks(true);

        slider.increment();

        Label lb = new Label();

        lb.setFont(Font.font("Times New Roman", 20));

        slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {

                Double db = (t1.doubleValue());

                String ss =  decfor.format(db);


                lb.setText(ss);

            }
        });

        VBox vb = new VBox();

        vb.getChildren().addAll(slider,lb);

        root.setCenter(vb);

        return  ret;

    }

}
