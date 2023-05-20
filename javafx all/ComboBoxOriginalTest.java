package com.example.demo2;

import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class ComboBoxOriginalTest {

    public Scene f(){

        VBox root = new VBox();

        ComboBox<String> comboBox = new ComboBox<>();

        ObservableList<String> ls = comboBox.getItems();

        ls.addAll("C", "C++", "Java", "Python");

        comboBox.setEditable(true);

        comboBox.setPromptText("Select/Add an item");

        comboBox.setFocusTraversable(false);

        Button btn = new Button("Submit");

        Label lb = new Label();

//        comboBox.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                System.out.println(comboBox.getValue().toString());
//                root.requestFocus();
//            }
//        });

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
//                String str = comboBox.getValue().toString();
//                System.out.println(comboBox.getValue().toString());

                String str = new String();

                try {
                    str = comboBox.getValue().toString();
                } catch (Exception e){
//                    lb.setText("Please Select an option!");
                    System.out.println(e);
                }




                lb.setText(str);
                System.out.println(str);


                root.requestFocus();
            }
        });

        root.getChildren().addAll(comboBox,btn,lb);

        Scene ret = new Scene(root);

        return ret;

    }

}
