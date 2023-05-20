package com.example.demo2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Final extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {



        Button notificationButton = createButton("", Pos.TOP_RIGHT);

        notificationButton.getStyleClass().add("notificationButton");

        Tooltip notificationToolTip = new Tooltip("Open Activity Center");

        notificationToolTip.setShowDelay(Duration.millis(70));

//        notificationToolTip.setFont(Fo);

        notificationToolTip.setHideDelay(Duration.millis(170));

        notificationButton.setTooltip(notificationToolTip);

        Button calenderSidePanelButton = createButton("c", Pos.TOP_RIGHT);

        calenderSidePanelButton.getStyleClass().add("calenderSidePanelButton");

        Tooltip calenderSidePanelButtonToolTip = new Tooltip("Open Calender Side Panel");

        calenderSidePanelButtonToolTip.setShowDelay(Duration.millis(70));

        calenderSidePanelButtonToolTip.setHideDelay(Duration.millis(170));

        calenderSidePanelButton.setTooltip(calenderSidePanelButtonToolTip);

//        Label personButtonLabel = new Label("MM");


        Circle statusIndicator = new Circle(5.2);
        statusIndicator.setFill(Color.GREEN);

        statusIndicator.getStyleClass().add("statusIndicator");

//        StackPane statusIndicatorHolder = new StackPane(statusIndicator);

//        StackPane.setAlignment(statusIndicator,Pos.TOP_RIGHT);

//        personButtonLabel.setFont(Font.font("Times New Roman",-1));

        Button personButton = createButton("MM", Pos.TOP_RIGHT);

        Pane personButtonContainer = new Pane();

        personButtonContainer.getStyleClass().add("personButtonContainer");


        statusIndicator.setLayoutX(27);
        statusIndicator.setLayoutY(0);

        personButtonContainer.getChildren().addAll(personButton,statusIndicator);

//        personButton.setGraphic(new StackPane(statusIndicator));

//        personButton.setTextOverrun(TextOverrun.ELLIPSIS);

//        personButton.setWrapText(true);

        personButton.getStyleClass().add("personButton");

        Tooltip personButtonToolTip = new Tooltip("Available");

        personButtonToolTip.setShowDelay(Duration.millis(70));

        personButtonToolTip.setHideDelay(Duration.millis(170));

        personButton.setTooltip(personButtonToolTip);

        HBox rbox = new HBox();

        rbox.getChildren().addAll(notificationButton,calenderSidePanelButton,personButtonContainer);

        rbox.setSpacing(6);

        Region regRight = new Region();

        HBox.setHgrow(regRight, Priority.ALWAYS);

        Button homeButton = createButton("", Pos.TOP_CENTER);

        homeButton.getStyleClass().add("homeButton");

        homeButton.setStyle("-fx-background-color:#4884f7;" +
                "-fx-opacity:1.0");

        Label btnTextm1 = new Label("Home");

        VBox vBtnm1 = new VBox(createCenteredButton(homeButton), createCenteredVbox(btnTextm1) );

        Button mailButton = createButton("", Pos.TOP_CENTER);

        mailButton.getStyleClass().add("mailButton");

        Label btnTextm2 = new Label("Mail");

        VBox vBtnm2 = new VBox(createCenteredButton(mailButton), createCenteredVbox(btnTextm2) );

        Button calenderButton = createButton("", Pos.CENTER);

        calenderButton.getStyleClass().add("calenderButton");

        Label btnTextm3 = new Label("Calender");

        VBox vBtnm3 = new VBox(createCenteredButton(calenderButton), createCenteredVbox(btnTextm3) );

        Button teamChatButton = createButton("", Pos.TOP_CENTER);

        teamChatButton.getStyleClass().add("teamChatButton");

        Label btnTextm4 = new Label("Team Chat");


        VBox vBtnm4 = new VBox(createCenteredButton(teamChatButton), createCenteredVbox(btnTextm4) );

        Button meetingsButton = createButton("", Pos.TOP_CENTER);

        meetingsButton.getStyleClass().add("meetingsButton");

        Label btnTextm5 = new Label("Meetings");

        VBox vBtnm5 = new VBox(createCenteredButton(meetingsButton), createCenteredVbox(btnTextm5) );

        Button contactsButton = createButton("", Pos.TOP_CENTER);

        contactsButton.getStyleClass().add("contactsButton");

        Label btnTextm6 = new Label("Contacts");

        VBox vBtnm6 = new VBox(createCenteredButton(contactsButton), createCenteredVbox(btnTextm6) );

        Button appsButton = createButton("", Pos.TOP_CENTER);

        appsButton.getStyleClass().add("appsButton");

        Label btnTextm7 = new Label("Apps");

        VBox vBtnm7 = new VBox(createCenteredButton(appsButton), createCenteredVbox(btnTextm7) );

        Button whiteBoardsButton = createButton("", Pos.TOP_CENTER);

        whiteBoardsButton.getStyleClass().add("whiteBoardsButton");

        Label btnTextm8 = new Label("Whiteboards");

        VBox vBtnm8 = new VBox(createCenteredButton(whiteBoardsButton), createCenteredVbox(btnTextm8) );

        HBox midBox = new HBox();

        homeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                homeButton.setStyle("-fx-background-color:#4884f7;" +
                        "-fx-opacity:1.0");

                mailButton.setStyle("");

                mailButton.getStyleClass().add("mailButton");

                calenderButton.setStyle("");

                calenderButton.getStyleClass().add("calenderButton");

                teamChatButton.setStyle("");

                teamChatButton.getStyleClass().add("teamChatButton");

                meetingsButton.setStyle("");

                meetingsButton.getStyleClass().add("meetingsButton");

                contactsButton.setStyle("");

                contactsButton.getStyleClass().add("contactsButton");

                appsButton.setStyle("");

                appsButton.getStyleClass().add("appsButton");

                whiteBoardsButton.setStyle("");

                whiteBoardsButton.getStyleClass().add("whiteBoardsButton");



            }
        });

        calenderButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                homeButton.getStyleClass().add("homeButton");

                homeButton.setStyle("");

                mailButton.setStyle("");

                mailButton.getStyleClass().add("mailButton");

                calenderButton.setStyle("-fx-background-color:#4884f7;" +
                        "-fx-opacity:1.0");

                teamChatButton.setStyle("");

                teamChatButton.getStyleClass().add("teamChatButton");

                meetingsButton.setStyle("");

                meetingsButton.getStyleClass().add("meetingsButton");

                contactsButton.setStyle("");

                contactsButton.getStyleClass().add("contactsButton");

                appsButton.setStyle("");

                appsButton.getStyleClass().add("appsButton");

                whiteBoardsButton.setStyle("");

                whiteBoardsButton.getStyleClass().add("whiteBoardsButton");
            }
        });

        teamChatButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                homeButton.getStyleClass().add("homeButton");

                homeButton.setStyle("");

                mailButton.setStyle("");

                mailButton.getStyleClass().add("mailButton");

                calenderButton.setStyle("");

                calenderButton.getStyleClass().add("calenderButton");

                teamChatButton.setStyle("-fx-background-color:#4884f7;" +
                        "-fx-opacity:1.0");

                meetingsButton.setStyle("");

                meetingsButton.getStyleClass().add("meetingsButton");

                contactsButton.setStyle("");

                contactsButton.getStyleClass().add("contactsButton");

                appsButton.setStyle("");

                appsButton.getStyleClass().add("appsButton");

                whiteBoardsButton.setStyle("");

                whiteBoardsButton.getStyleClass().add("whiteBoardsButton");
            }
        });

        meetingsButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                homeButton.getStyleClass().add("homeButton");

                homeButton.setStyle("");

                mailButton.setStyle("");

                mailButton.getStyleClass().add("mailButton");

                calenderButton.setStyle("");

                calenderButton.getStyleClass().add("calenderButton");

                teamChatButton.setStyle("");

                teamChatButton.getStyleClass().add("teamChatButton");

                meetingsButton.setStyle("-fx-background-color:#4884f7;" +
                        "-fx-opacity:1.0");

                contactsButton.setStyle("");

                contactsButton.getStyleClass().add("contactsButton");

                appsButton.setStyle("");

                appsButton.getStyleClass().add("appsButton");

                whiteBoardsButton.setStyle("");

                whiteBoardsButton.getStyleClass().add("whiteBoardsButton");
            }
        });

        contactsButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                homeButton.getStyleClass().add("homeButton");

                homeButton.setStyle("");

                mailButton.setStyle("");

                mailButton.getStyleClass().add("mailButton");

                calenderButton.setStyle("");

                calenderButton.getStyleClass().add("calenderButton");

                teamChatButton.setStyle("");

                teamChatButton.getStyleClass().add("teamChatButton");

                meetingsButton.setStyle("");

                meetingsButton.getStyleClass().add("meetingsButton");

                contactsButton.setStyle("-fx-background-color:#4884f7;" +
                        "-fx-opacity:1.0");

                appsButton.setStyle("");

                appsButton.getStyleClass().add("appsButton");

                whiteBoardsButton.setStyle("");

                whiteBoardsButton.getStyleClass().add("whiteBoardsButton");
            }
        });


        appsButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                homeButton.getStyleClass().add("homeButton");

                homeButton.setStyle("");

                mailButton.setStyle("");

                mailButton.getStyleClass().add("mailButton");

                calenderButton.setStyle("");

                calenderButton.getStyleClass().add("calenderButton");

                teamChatButton.setStyle("");

                teamChatButton.getStyleClass().add("teamChatButton");

                meetingsButton.setStyle("");

                meetingsButton.getStyleClass().add("meetingsButton");

                contactsButton.setStyle("");

                contactsButton.getStyleClass().add("contactsButton");


                appsButton.setStyle("-fx-background-color:#4884f7;" +
                        "-fx-opacity:1.0");

                whiteBoardsButton.setStyle("");

                whiteBoardsButton.getStyleClass().add("whiteBoardsButton");
            }
        });

        whiteBoardsButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                homeButton.getStyleClass().add("homeButton");

                homeButton.setStyle("");

                mailButton.setStyle("");

                mailButton.getStyleClass().add("mailButton");

                calenderButton.setStyle("");

                calenderButton.getStyleClass().add("calenderButton");

                teamChatButton.setStyle("");

                teamChatButton.getStyleClass().add("teamChatButton");

                meetingsButton.setStyle("");

                meetingsButton.getStyleClass().add("meetingsButton");

                contactsButton.setStyle("");

                contactsButton.getStyleClass().add("contactsButton");

                appsButton.setStyle("");

                appsButton.getStyleClass().add("appsButton");

                whiteBoardsButton.setStyle("-fx-background-color:#4884f7;" +
                        "-fx-opacity:1.0");
            }
        });



        mailButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                homeButton.getStyleClass().add("homeButton");

                homeButton.setStyle("");

                mailButton.setStyle("-fx-background-color:#4884f7;" +
                        "-fx-opacity:1.0");

                calenderButton.setStyle("");

                calenderButton.getStyleClass().add("calenderButton");

                teamChatButton.setStyle("");

                teamChatButton.getStyleClass().add("teamChatButton");

                meetingsButton.setStyle("");

                meetingsButton.getStyleClass().add("meetingsButton");

                contactsButton.setStyle("");

                contactsButton.getStyleClass().add("contactsButton");

                appsButton.setStyle("");

                appsButton.getStyleClass().add("appsButton");

                whiteBoardsButton.setStyle("");

                whiteBoardsButton.getStyleClass().add("whiteBoardsButton");

            }
        });

        midBox.getChildren().addAll(vBtnm1,vBtnm2,vBtnm3,vBtnm4,vBtnm5,vBtnm6,vBtnm7,vBtnm8);

        midBox.setSpacing(30);

        Region regLeft = new Region();

        HBox.setHgrow(regLeft,Priority.ALWAYS);

        Button leftButton = createButton("", Pos.TOP_LEFT);

        Tooltip leftButtonToolTip = new Tooltip("Back in Chat (Alt+Left)");

        leftButtonToolTip.setShowDelay(Duration.millis(70));

        leftButtonToolTip.setHideDelay(Duration.millis(170));

        leftButton.setTooltip(leftButtonToolTip);

        leftButton.getStyleClass().add("leftButton");

        Button rightButton = createButton("", Pos.TOP_LEFT);

        rightButton.getStyleClass().add("rightButton");

        Tooltip rightButtonToolTip = new Tooltip("Forward in Chat (Alt+Right)");

        rightButtonToolTip.setShowDelay(Duration.millis(70));

        rightButtonToolTip.setHideDelay(Duration.millis(170));

        rightButton.setTooltip(rightButtonToolTip);

        HBox lr = new HBox();

        lr.getChildren().addAll(leftButton,rightButton);

        lr.setSpacing(4);

        Button historyButton = createButton("", Pos.TOP_LEFT);

        historyButton.getStyleClass().add("historyButton");

        Tooltip historyButtonToolTip = new Tooltip("History");

        historyButtonToolTip.setShowDelay(Duration.millis(70));

        historyButtonToolTip.setHideDelay(Duration.millis(170));

        historyButton.setTooltip(historyButtonToolTip);

        Button searchButton = createButton("Search Ctrl+F", Pos.TOP_LEFT);

        searchButton.setGraphic(new ImageView(new Image("C:\\Users\\Reve\\IdeaProjects\\demo2\\src\\main\\java\\com\\example\\demo2\\srch.png",20,20,true,true)));



        // width+hidden property handler//

//        try {
//            Node node = homeButton;
//            Stage stage = (Stage) node.getScene().getWindow();
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }

//        Node node = homeButton;

//        Stage stage = (Stage) node.getScene().getWindow();

//        stage.widthProperty().addListener(new ChangeListener<Number>() {
//            @Override
//            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
////                System.out.println(stage.getWidth());
//            }
//        });

        // width+hidden property handler//


        searchButton.getStyleClass().add("searchButton");

        Region lrGap = new Region();

//        lrGap.setPrefWidth(8);

        HBox root = new HBox();

        root.setStyle("-fx-background-color: #e0e1e3");

        root.setAlignment(Pos.TOP_CENTER);

        root.setSpacing(8);

        root.setPadding(new Insets(8,8,8,8));

        root.getChildren().addAll(lr,lrGap,historyButton,searchButton,regLeft,midBox,regRight,rbox);








    }

    public Button createButton(String label, Pos align){

        Button btn = new Button(label);

//        btn.setPrefSize(20,8);

        btn.setAlignment(align);

        return btn;

    }

    public VBox createCenteredButton(Button btn){

        VBox ret = new VBox(btn);

        ret.setAlignment(Pos.CENTER);

        return ret;

    }

    public VBox createCenteredVbox(Label label){

        VBox ret = new VBox(label);

        ret.setAlignment(Pos.CENTER);

        return ret;

    }

    public static void main(String args[]){
        launch(args);
    }

}
