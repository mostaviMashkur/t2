package com.example.demo2;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class GPT extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Load the image
        Image image = new Image("C:\\Users\\Reve\\Desktop\\im2.jpg"); // Replace with your image path

        // Create an ImageView to display the image
        ImageView imageView = new ImageView(image);

        // Get the screen dimensions
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();

        // Set the ImageView properties to fit the StackPane
        imageView.setPreserveRatio(true);
        imageView.setFitWidth(screenBounds.getWidth());
        imageView.setFitHeight(screenBounds.getHeight());

        // Create a StackPane and set its alignment to CENTER
        StackPane stackPane = new StackPane();
        stackPane.setAlignment(imageView, javafx.geometry.Pos.CENTER);

        // Add the ImageView to the StackPane
        stackPane.getChildren().add(imageView);

        // Create the scene and set it on the stage
        Scene scene = new Scene(stackPane, screenBounds.getWidth(), screenBounds.getHeight());
        primaryStage.setScene(scene);
        primaryStage.setTitle("StackPane with Full Screen Image Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}