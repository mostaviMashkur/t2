package com.example.demo2;

import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;

public class ChoiceBoxTest {

    public Scene f(){

        VBox root = new VBox();

        Scene ret =new Scene(root);

        ChoiceBox<String> cb = new ChoiceBox<>();

        ObservableList<String> obl = cb.getItems();

        cb.setValue("Select an Item");

        obl.addAll("C","C++","Java");

        cb.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String str = cb.getValue().toString();

                if(str != "Select an Item") System.out.println(str);
            }
        });

        root.getChildren().add(cb);

        return ret;

    }

}
