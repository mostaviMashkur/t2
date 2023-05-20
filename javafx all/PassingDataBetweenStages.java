package com.example.demo2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PassingDataBetweenStages extends Application {

    Stage st1, st2;

    Label lblmsg = new Label("Select value from stage 2");

    @Override
    public void start(Stage primaryStage) throws Exception {

        st1 = createStage1();

        st2 = createStage2();

        st1.show();


    }

    public Stage createStage1(){

        Label lb = new Label("Stage 1");

        Button btn = new Button("Go to stage 2");

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                st2.show();
            }
        });

        VBox root = new VBox();

        root.getChildren().addAll(lb,btn,lblmsg);

        Scene sc = new Scene(root,800,800);

        Stage ret = new Stage();

        ret.setScene(sc);

        return ret;
    }

    public Stage createStage2(){

        TextField tf = new TextField();

        tf.setPromptText("Enter your value here");

        tf.setFocusTraversable(false);

        tf.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lblmsg.setText(tf.getText());
                st2.close();
            }
        });

        Button btn = new Button("Close stage 2");

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lblmsg.setText(tf.getText());
                st2.close();
            }
        });

        Label lb = new Label("This is Stage 2");

        VBox root = new VBox();

        root.requestFocus();

        root.getChildren().addAll(lb,btn,tf);

        Scene sc = new Scene(root,500,500);

        Stage ret = new Stage();

        ret.initOwner(st1);

        ret.initModality(Modality.WINDOW_MODAL);

        ret.setScene(sc);


        return ret;
    }

    public static void main(String args[]){

        launch(args);

    }

}
