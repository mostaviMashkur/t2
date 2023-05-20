package com.example.demo2;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;

public class ListViewExample {

    public Scene f()
    {

        HBox root = new HBox();

        ListView listView = new ListView();

        listView.getItems().add("item1");

        listView.getItems().add("item2");

        listView.getItems().set(0,"item0");

        listView.setPrefSize(100,100);

        listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observableValue, Object o, Object newOb) {

                System.out.println(newOb);

            }
        });

        root.getChildren().add(listView);



        Scene ret = new Scene(root);

        return ret;

    }

}
