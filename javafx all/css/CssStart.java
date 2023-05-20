package com.example.demo2.css;

import com.example.demo2.HelloApplication;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//import static com.sun.javafx.scene.control.skin.Utils.getResource;

public class CssStart extends Application {

    static double MIN_WIDTH = 1300;

    static double MIN_HEIGHT = 700;
    @Override
    public void start(Stage primaryStage) throws Exception {

        Button homeButton = new Button("");

        homeButton.setFocusTraversable(false);

        homeButton.setAlignment(Pos.CENTER);

        VBox root = new VBox();

        root.setAlignment(Pos.CENTER);

        root.getChildren().addAll(homeButton);

        Scene scene = new Scene(root);

        String cssPath = "file:///C:/Users/Reve/IdeaProjects/demo2/src/main/java/com/example/demo2/cssSheets/app.css";

        scene.getStylesheets().add(cssPath);

        try {
            homeButton.getStyleClass().add("homeButton");
        } catch (Exception e){
            e.printStackTrace();
        }

//        homeButton.setGraphic(new ImageView(new Image("C:\\Users\\Reve\\Desktop\\hm.jpg",20,20,true,true)));



        homeButton.setPrefSize(60,60);

        homeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Home button pressed");
            }
        });

        primaryStage.setScene(scene);

        primaryStage.setMinHeight(CssStart.MIN_HEIGHT);

        primaryStage.setMinWidth(CssStart.MIN_WIDTH);

        primaryStage.show();

    }

    public static void main(String args[]){
        launch(args);
    }

}
