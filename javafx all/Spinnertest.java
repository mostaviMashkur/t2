package com.example.demo2;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.VBox;

public class Spinnertest {

    public Scene f()
    {
        Spinner<Integer> sp = new Spinner<>();

        SpinnerValueFactory<Integer> svf = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10);

        sp.setValueFactory(svf);

        sp.setEditable(true);

        sp.setFocusTraversable(false);

        Label lb = new Label(sp.getValue().toString());

        sp.valueProperty().addListener(new ChangeListener<Integer>() {
            @Override
            public void changed(ObservableValue<? extends Integer> observableValue, Integer integer, Integer t1) {
                lb.setText(sp.getValue().toString());
            }
        });



        VBox root = new VBox();

        root.getChildren().addAll(sp,lb);

        root.requestFocus();

        Scene ret = new Scene(root);

        return ret;

    }

}
