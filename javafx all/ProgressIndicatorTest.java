package com.example.demo2;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;

public class ProgressIndicatorTest {

    public Scene f(){

        VBox root =  new VBox();

        ProgressIndicator pi = new ProgressIndicator();

        Slider s = new Slider();

        s.setShowTickMarks(true);

        s.setShowTickLabels(true);

        s.setMax(100);

        s.setMin(0);

        s.setMajorTickUnit(10);

        s.setMinorTickCount(10);

        double ddd = s.getValue();

        pi.setProgress(ddd);

        s.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                double d = t1.doubleValue();
                d = d/100.0;
                pi.setProgress(d);
            }
        });

        root.getChildren().addAll(s,pi);

        root.setAlignment(Pos.CENTER);

        Scene ret = new Scene(root);

        return ret;

    }

}
