package com.example.demo2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class cssTest extends Application {

    public static double MIN_WIDTH = 1300;

    public static double MIN_HEIGHT = 700;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button homeButton = new Button("Home");

        homeButton.setAlignment(Pos.CENTER);

        homeButton.setFocusTraversable(false);

        VBox root = new VBox();

        root.getChildren().addAll(homeButton);

        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root,1300,700);

        primaryStage.setScene(scene);

        primaryStage.setMinWidth(MIN_WIDTH);

        primaryStage.setMinHeight(MIN_HEIGHT);

        primaryStage.show();

    }

    public static void main(String args[]){
        launch(args);
    }
}
