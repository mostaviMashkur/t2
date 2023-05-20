package com.example.demo2;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClaenderInterface extends Application {

    public static Label timeLabel = new Label();

    public static Label dateLabel = new Label();

    public static Label dayLabel = new Label();

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox root = new VBox();

//        BorderStrokeStyle borderStrokeStyle = new BorderStrokeStyle(
//                StrokeType.INSIDE,
//                StrokeLineJoin.MITER,
//                StrokeLineCap.BUTT,
//                new Double(0),
//                new Double(0),
//                null);
//
//        BorderStroke borderStroke = new BorderStroke(Color.GRAY,borderStrokeStyle,
//                new CornerRadii(0),
//                new BorderWidths(8)
//                );
//
//        Border border = new Border(borderStroke);



//        root.setBorder(border);



        VBox.setMargin(root,new Insets(10,10,10,10));

        root.setPrefSize(100,100);

        root.setAlignment(Pos.CENTER);

        dateLabel.getStyleClass().add("dateLabel");

        dayLabel.getStyleClass().add("dayLabel");

        timeLabel.getStyleClass().add("timeLabel");

        Timeline tl = new Timeline(new KeyFrame(Duration.millis(2), actionEvent -> updateLabels()));

        tl.setCycleCount(Animation.INDEFINITE);
        tl.play();

        HBox dayMonth = new HBox(dayLabel, dateLabel);
        dayMonth.setAlignment(Pos.CENTER);

        root.getChildren().addAll(timeLabel,dayMonth);

        root.setPrefSize(100,100);

//        VBox vb = new VBox(root);

        Scene scene = new Scene(root,1300,700);



        primaryStage.setScene(scene);

        primaryStage.show();

    }

    public void updateLabels() {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("h:mm:ss a");
        String time = now.format(timeFormatter);

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        String date = now.format(dateFormatter);

        DateTimeFormatter dayFormatter = DateTimeFormatter.ofPattern("EEEE");
        String day = now.format(dayFormatter);

        timeLabel.setText(time);
        dateLabel.setText(date);
        dayLabel.setText(day+", ");
    }

    public static void main(String args[]){

        launch(args);

    }
}
