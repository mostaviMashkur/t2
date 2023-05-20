package com.example.demo2;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class SpinnerStringTest {

    public Scene f(){

        ObservableList<String> ol = FXCollections.observableArrayList();

        ol.addAll("Janurary", "Februray", "March", "April", "May", "June");

        Spinner<String> sp = new Spinner<>();

        SpinnerValueFactory<String> svf = new SpinnerValueFactory.ListSpinnerValueFactory<>(ol);

        sp.setValueFactory(svf);

        sp.setEditable(true);

//        String tx = sp.getValue().toString();

        Label lb = new Label(sp.getValue().toString());

        sp.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                lb.setText(sp.getValue().toString());
            }
        });

        lb.setFont(Font.font("Times New Roman",20));

        VBox root = new VBox();

        root.setAlignment(Pos.CENTER);

        root.getChildren().addAll(sp,lb);

        Scene ret = new Scene(root);

        return ret;

    }

}
