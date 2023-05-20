package com.example.demo2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SwitchBetweenScenes extends Application {

    Scene sc1,sc2;

    @Override
    public void start(Stage primaryStage) throws Exception {

        sc1 = createScene1();
        sc2 = createScene2();

        primaryStage.setScene(sc1);
        primaryStage.show();
    }

    public Scene createScene1()
    {

        Button b = new Button("Go to scene 2");

        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                setScene(sc2,actionEvent);
            }
        });

        Label lb = new Label("This is scene 1");

        VBox root = new VBox();

        root.getChildren().addAll(lb,b);

        Scene ret = new Scene(root,500,500);

        return ret;
    }

    public Scene createScene2(){

        Button b = new Button("Go to scene 1");

        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                setScene(sc1,actionEvent);
            }
        });

        Label lb = new Label("This is scene 2");

        VBox root = new VBox();

        root.getChildren().addAll(lb,b);

        Scene ret = new Scene(root,700,700);

        return ret;
    }

    void setScene(Scene sc, ActionEvent e){

        Node nd = (Node) e.getSource();

        Stage st = (Stage) nd.getScene().getWindow();

        st.setScene(sc);

    }

    public static void main(String args[]){
        launch(args);
    }

}
