package com.example.demo2;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.awt.*;
import java.io.File;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Stack;

public class Calender {

    public  Label timeLabel = new Label();

    public  Label dateLabel = new Label();

    public  Label dayLabel = new Label();

    VBox root = new VBox();


    StackPane spn = new StackPane();

    HBox imCngBtnHbox = new HBox();

    static String impath;


    public VBox f(Stage primaryStage){



        impath = "C:\\Users\\Reve\\Desktop\\bg.jpg";

        Image im = new Image(impath,350,170,false,true);

        ImageView imv = new ImageView(im);


        VBox.setMargin(root,new Insets(10,10,10,10));

//        root.setPrefSize(200,300);

        root.setAlignment(Pos.CENTER);

        timeLabel.setStyle("-fx-font-size: 40px;" +
                "-fx-text-fill: white;");

        timeLabel.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);

        timeLabel.setAlignment(Pos.CENTER);

        dayLabel.setStyle("-fx-font-size: 12px;" +
                "-fx-text-fill: white;");

        dayLabel.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);

        dayLabel.setAlignment(Pos.CENTER);

        dateLabel.setStyle("-fx-font-size: 15px;" +
                "-fx-text-fill: white;");

        dateLabel.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);

        dateLabel.setAlignment(Pos.CENTER);

        dateLabel.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);

        Timeline tl = new Timeline(new KeyFrame(Duration.millis(2), actionEvent -> updateLabels()));

        tl.setCycleCount(Animation.INDEFINITE);
        tl.play();


        root.getChildren().addAll(timeLabel,dayLabel);

//working//

        Rectangle clip = new Rectangle(350, 190);
        clip.setArcWidth(20);
        clip.setArcHeight(20);

         imv.setClip(clip);

         ImageView newImv = imv;

//working//

        newImv.setViewport(new Rectangle2D(0,0,350,160));

        Button imCng = new Button();

        Region lfr = new Region();

        HBox.setHgrow(lfr,Priority.ALWAYS);

//         = new HBox(lfr,imCng);

        imCngBtnHbox.getChildren().addAll(lfr,imCng);

        imCngBtnHbox.setPadding(new Insets(5,5,0,0));

        HBox.setHgrow(imCngBtnHbox,Priority.ALWAYS);

        imCng.setAlignment(Pos.TOP_RIGHT);

        Tooltip imCngBtnToolTip = new Tooltip("Change Background Photo");

        imCngBtnToolTip.setShowDelay(Duration.millis(70));

        imCngBtnToolTip.setHideDelay(Duration.millis(170));

        imCng.setTooltip(imCngBtnToolTip);

        imCng.getStyleClass().add("imCng");

        imCng.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                FileChooser fc = new FileChooser();

                fc.setInitialDirectory(new File(System.getProperty("user.home")));

                FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter(".png","*.png");
                FileChooser.ExtensionFilter filter2 = new FileChooser.ExtensionFilter(".jpg","*.jpg");

                fc.getExtensionFilters().addAll(filter2,filter);

                try {
                    File fl = fc.showOpenDialog(primaryStage);
                    System.out.println(fl.getAbsolutePath().toString());

                    impath = fl.getAbsolutePath().toString();

                    Image im = new Image(impath,350,170,false,true);

                    ImageView imv = new ImageView(im);

                    Rectangle clip = new Rectangle(350, 190);
                    clip.setArcWidth(20);
                    clip.setArcHeight(20);

                    imv.setClip(clip);

                    ImageView newImv2 = imv;

                    newImv2.setViewport(new Rectangle2D(0,0,350,160));

                    spn.getChildren().clear();

                    spn.getChildren().addAll(newImv2,root,imCngBtnHbox);

                    spn.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);

                    spn.setStyle("-fx-border-radius: 20px;");

                }catch (Exception e){
                    System.out.println(e);
                }
            }
        });



//         = new StackPane(newImv,root,imCngBtnHbox);

        spn.getChildren().addAll(newImv,root,imCngBtnHbox);

        spn.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);

        spn.setStyle("-fx-border-radius: 20px;");

        VBox root2  = new VBox(spn);

        spn.setAlignment(Pos.TOP_CENTER);

        root2.setStyle("-fx-border-color: black;" +
                "-fx-border-width:0.07px;" +
                "-fx-border-radius: 10px;");

        Region undr = new Region();

        Region dnn = new Region();

        VBox.setVgrow(undr,Priority.ALWAYS);

        VBox.setVgrow(dnn,Priority.ALWAYS);

        Button addClnBtn = new Button("   Add a Calender");

        Tooltip addClnBtnToolTip = new Tooltip("Connect your work with calender.");

        addClnBtnToolTip.setShowDelay(Duration.millis(70));

        addClnBtnToolTip.setHideDelay(Duration.millis(170));

        addClnBtn.setTooltip(addClnBtnToolTip);

        Image addCalenIconImageBlack = new Image("C:\\Users\\Reve\\IdeaProjects\\demo2\\src\\main\\java\\com\\example\\demo2\\cssSheets\\cl.png",
                15,15,true,true);

        Image addCalenIconImageBlue = new Image("C:\\Users\\Reve\\IdeaProjects\\demo2\\src\\main\\java\\com\\example\\demo2\\cssSheets\\cl2.png",
                15,15,true,true);

        ImageView addClnBtnIconBlack = new ImageView(addCalenIconImageBlack);

        ImageView addClnBtnIconBlue = new ImageView(addCalenIconImageBlue);

        addClnBtn.setGraphic(addClnBtnIconBlack);

        addClnBtn.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
//                System.out.println("BButton is hovered");

                addClnBtn.setGraphic(addClnBtnIconBlue);
            }
        });

        addClnBtn.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

//                System.out.println("Button is not hovered");

                addClnBtn.setGraphic(addClnBtnIconBlack);


            }
        });

        addClnBtn.setPrefSize(200,50);

        addClnBtn.setAlignment(Pos.CENTER);

//        addClnBtn.setStyle("-fx-background-color:transparent;" +
//                "-fx-border-color:transparent;");

        addClnBtn.getStyleClass().add("addClnBtn");

        addClnBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    String add = "https://zoom.us/signin#/login";
                    Desktop.getDesktop().browse(new URL(add).toURI());
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        HBox calnBtnHbx = new HBox(addClnBtn);

        calnBtnHbx.setAlignment(Pos.CENTER);

        root2.getChildren().addAll(undr,calnBtnHbx,dnn);

        root2.setPrefWidth(100);

        root2.setPrefHeight(500);

        Region up = new Region();

        Region dn = new Region();

        VBox.setVgrow(up,Priority.ALWAYS);

        VBox.setVgrow(dn,Priority.ALWAYS);


        VBox root3 = new VBox(up,root2,dn);

//        root2.setPrefHeight(500);


//        root.setPrefSize(100,100);

        return root3;

    }

    public void updateLabels() {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("h:mm a");
        String time = now.format(timeFormatter);

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        String date = now.format(dateFormatter);

        DateTimeFormatter dayFormatter = DateTimeFormatter.ofPattern("EEEE");
        String day = now.format(dayFormatter);

        timeLabel.setText(time);
        dateLabel.setText(date);
        dayLabel.setText(day+", "+date);
    }

}
