package com.example.demo2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class SwitchBetweenStages extends Application {

    Stage st1,st2;

    @Override
    public void start(Stage primaryStage) throws Exception {

        st1 = create_s1();

        st2 = create_s2();

        st1.show();



    }

    public static void main(String args[]){
        launch(args);
    }

    public Stage create_s1(){

        Button btn = new Button("Goto stage 2");

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                st2.show();
            }
        });

        VBox root = new VBox();

        root.getChildren().addAll(btn);

        Scene sc = new Scene(root,500,500);

        Stage ret = new Stage(StageStyle.DECORATED);

        ret.setScene(sc);

        return ret;

    }

    public Stage create_s2(){

        Button btn = new Button("Close");

        VBox root = new VBox();

        root.getChildren().addAll(btn);

        Scene sc = new Scene(root,300,300);

        Stage ret = new Stage(StageStyle.DECORATED);

//        ret.initModality(Modality.APPLICATION_MODAL);// owner stage 1 hobe

        ret.initModality(Modality.NONE);//eksathe dui stage chalano jabe

        ret.initOwner(st2);

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                st2.close();
            }
        });

        ret.setScene(sc);

        return ret;

    }

}
