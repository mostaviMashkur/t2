package com.example.demo2;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;

public class ProgressBarTest {

    public Scene f(){

        VBox root = new VBox();

        Scene ret = new Scene(root);

        ProgressBar pb= new ProgressBar();

        pb.setPrefSize(100,50);

        pb.setProgress(0);

//        pb.setProgress(-1);

        Slider s = new Slider();

        s.setMin(0);

        s.setMax(100);

        s.setMajorTickUnit(10);

        s.setMinorTickCount(10);

        s.setShowTickLabels(true);

        s.setShowTickMarks(true);

        s.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                double val = t1.doubleValue();
                val = val/100.0;

                pb.setProgress(val);
            }
        });

        root.getChildren().addAll(s,pb);

        root.setAlignment(Pos.CENTER);

        return ret;

    }

}
