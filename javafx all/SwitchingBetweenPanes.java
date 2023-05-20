package com.example.demo2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SwitchingBetweenPanes extends Application {

    BorderPane bp = new BorderPane();

    VBox v1,v2;

    @Override
    public void start(Stage primaryStage) throws Exception {

        bp.setTop(createButton("Top"));

        bp.setRight(createButton("Right"));

        bp.setLeft(createButton("Left"));

        bp.setBottom(createButton("Bottom"));

        v1 = createVbox1();

        v2 = createVbox2();

        bp.setCenter(v1);

        bp.requestFocus();

        Scene scene = new Scene(bp,1300,700);

        primaryStage.setScene(scene);

        primaryStage.show();

    }

    public Button createButton(String lbl){

        Button ret = new Button(lbl);

        ret.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        return ret;

    }

    public VBox createVbox1(){

        VBox root = new VBox();

        Button btn = new Button("Go to Scene 2");

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                bp.setCenter(v2);
            }
        });

        Label lb = new Label("This is Scene 1");

        root.setAlignment(Pos.CENTER);

        root.getChildren().addAll(lb,btn);

        return root;

    }

    public VBox createVbox2(){

        VBox root = new VBox();

        Button btn = new Button("Go to Scene 1");

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                bp.setCenter(v1);
            }
        });

        Label lb = new Label("This is Scene 2");

        root.setAlignment(Pos.CENTER);

        root.getChildren().addAll(lb,btn);

        return root;

    }

    public static void main(String args[]){

        launch(args);

    }
}
