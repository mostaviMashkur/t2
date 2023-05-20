package com.example.demo2;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

//import javafx.scene.control.TextOverrun;

public class HboxCeption {

    static boolean homeButtonPressed, mailButtonPressed, calenderButtonPressed, teamChatButtonPressed,
            meetingsButtonPressed, contactsButtonPressed,
            appsButtonPressed, whiteBoardsButtonPressed, moreButtonPressed;

    static boolean arrayButtonCheck[] = new boolean[]{homeButtonPressed, mailButtonPressed, calenderButtonPressed, teamChatButtonPressed,
            meetingsButtonPressed, contactsButtonPressed,
            appsButtonPressed, whiteBoardsButtonPressed, moreButtonPressed};

    static Stack<Integer> stackIdx = new Stack<>();

    static int vashomanElement;

    public HBox f(Stage stage){

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

        HBox.setHgrow(regRight,Priority.ALWAYS);

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

        Button moreButton = createButton("", Pos.TOP_CENTER);

        moreButton.getStyleClass().add("moreButton");

        Label btnTextm9 = new Label("More");

        VBox vBtnm9 = new VBox(createCenteredButton(moreButton), createCenteredVbox(btnTextm9) );

        HBox midBox = new HBox();

        homeButtonPressed = true;

//        midBox.getChildren().addAll(vBtnm1,vBtnm2,vBtnm3,vBtnm4,vBtnm5,vBtnm6,vBtnm7,vBtnm8,vBtnm9);

        VBox midPaneButtonsArray[] = new VBox[] {vBtnm1,vBtnm2,vBtnm3,vBtnm4,vBtnm5,vBtnm6,vBtnm7,vBtnm8,vBtnm9};

        midBox.getChildren().addAll(midPaneButtonsArray);

        midPaneButtonsArray[8].setVisible(false);

        midPaneButtonsArray[8].setManaged(false);

//        midBox.getChildren().addAll(vBtnm1,midPaneButtonsArray);

        midBox.setSpacing(30);


        homeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

//                homeButtonPressed, mailButtonPressed, calenderButtonPressed, teamChatButtonPressed,
//                        meetingsButtonPressed, contactsButtonPressed,
//                        appsButtonPressed, whiteBoardsButtonPressed, moreButtonPressed

                Arrays.fill(arrayButtonCheck,false);

                if(arrayButtonCheck[0]==false){
                    if(!stackIdx.empty()){
                        vashomanElement = stackIdx.pop();
                    }
                }


                arrayButtonCheck[0] = true;

//                for (int i=0;i<9;i++) System.out.println(arrayButtonCheck[i]);


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

                moreButton.setStyle("");

                moreButton.getStyleClass().add("meetingsButton");



            }
        });

        calenderButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                //                homeButtonPressed, mailButtonPressed, calenderButtonPressed, teamChatButtonPressed,
//                        meetingsButtonPressed, contactsButtonPressed,
//                        appsButtonPressed, whiteBoardsButtonPressed, moreButtonPressed

                Arrays.fill(arrayButtonCheck,false);

                arrayButtonCheck[2] = true;

//                for (int i=0;i<9;i++) System.out.println(arrayButtonCheck[i]);

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

                moreButton.setStyle("");

                moreButton.getStyleClass().add("meetingsButton");
            }
        });

        teamChatButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                //                homeButtonPressed, mailButtonPressed, calenderButtonPressed, teamChatButtonPressed,
//                        meetingsButtonPressed, contactsButtonPressed,
//                        appsButtonPressed, whiteBoardsButtonPressed, moreButtonPressed

                Arrays.fill(arrayButtonCheck,false);

                arrayButtonCheck[3] = true;

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

                moreButton.setStyle("");

                moreButton.getStyleClass().add("meetingsButton");
            }
        });

        meetingsButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                //                homeButtonPressed, mailButtonPressed, calenderButtonPressed, teamChatButtonPressed,
//                        meetingsButtonPressed, contactsButtonPressed,
//                        appsButtonPressed, whiteBoardsButtonPressed, moreButtonPressed

                Arrays.fill(arrayButtonCheck,false);

                arrayButtonCheck[4] = true;

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

                moreButton.setStyle("");

                moreButton.getStyleClass().add("meetingsButton");
            }
        });

        contactsButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                //                homeButtonPressed, mailButtonPressed, calenderButtonPressed, teamChatButtonPressed,
//                        meetingsButtonPressed, contactsButtonPressed,
//                        appsButtonPressed, whiteBoardsButtonPressed, moreButtonPressed

                Arrays.fill(arrayButtonCheck,false);

                arrayButtonCheck[5] = true;

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

                moreButton.setStyle("");

                moreButton.getStyleClass().add("meetingsButton");
            }
        });

        appsButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                //                homeButtonPressed, mailButtonPressed, calenderButtonPressed, teamChatButtonPressed,
//                        meetingsButtonPressed, contactsButtonPressed,
//                        appsButtonPressed, whiteBoardsButtonPressed, moreButtonPressed

                Arrays.fill(arrayButtonCheck,false);

                arrayButtonCheck[6] = true;

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

                moreButton.setStyle("");

                moreButton.getStyleClass().add("meetingsButton");
            }
        });

        whiteBoardsButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                //                homeButtonPressed, mailButtonPressed, calenderButtonPressed, teamChatButtonPressed,
//                        meetingsButtonPressed, contactsButtonPressed,
//                        appsButtonPressed, whiteBoardsButtonPressed, moreButtonPressed

                Arrays.fill(arrayButtonCheck,false);

                arrayButtonCheck[7] = true;

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

                moreButton.setStyle("");

                moreButton.getStyleClass().add("meetingsButton");
            }
        });

        mailButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                //                homeButtonPressed, mailButtonPressed, calenderButtonPressed, teamChatButtonPressed,
//                        meetingsButtonPressed, contactsButtonPressed,
//                        appsButtonPressed, whiteBoardsButtonPressed, moreButtonPressed

                Arrays.fill(arrayButtonCheck,false);

                arrayButtonCheck[1] = true;

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

                moreButton.setStyle("");

                moreButton.getStyleClass().add("meetingsButton");

            }
        });

        moreButton.setOnAction(new EventHandler<ActionEvent>() {
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

                whiteBoardsButton.setStyle("");

                whiteBoardsButton.getStyleClass().add("whiteBoardsButton");

                moreButton.setStyle("-fx-background-color:#4884f7;" +
                        "-fx-opacity:1.0");

            }
        });


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


        searchButton.getStyleClass().add("searchButton");

        Region lrGap = new Region();

        lrGap.setPrefWidth(8);

        HBox root = new HBox();

        root.setStyle("-fx-background-color: #e0e1e3");

        root.setAlignment(Pos.TOP_CENTER);

        root.setSpacing(8);

        root.setPadding(new Insets(8,8,8,8));

        root.getChildren().addAll(lr,lrGap,historyButton,searchButton,regLeft,midBox,regRight,rbox);

        // width+hidden property handler//

        stage.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                System.out.println(stage.getWidth());

                if(stage.getWidth()<932){
                    midPaneButtonsArray[7].setVisible(false);
                    midPaneButtonsArray[7].setManaged(false);

                    midPaneButtonsArray[6].setVisible(false);
                    midPaneButtonsArray[6].setManaged(false);

                    midPaneButtonsArray[8].setVisible(true);
                    midPaneButtonsArray[8].setManaged(true);
                }

                if(stage.getWidth()>=932){
                    midPaneButtonsArray[7].setVisible(true);
                    midPaneButtonsArray[7].setManaged(true);

                    midPaneButtonsArray[6].setVisible(true);
                    midPaneButtonsArray[6].setManaged(true);

                    midPaneButtonsArray[8].setVisible(false);
                    midPaneButtonsArray[8].setManaged(false);
                }

                if(stage.getWidth()<847){

                    midPaneButtonsArray[5].setVisible(false);
                    midPaneButtonsArray[5].setManaged(false);

                }

                if(stage.getWidth()>=847){

                    midPaneButtonsArray[5].setVisible(true);
                    midPaneButtonsArray[5].setManaged(true);

                }

                if(stage.getWidth()<766){

                    midPaneButtonsArray[4].setVisible(false);
                    midPaneButtonsArray[4].setManaged(false);

                }

                if(stage.getWidth()>=766){

                    midPaneButtonsArray[4].setVisible(true);
                    midPaneButtonsArray[4].setManaged(true);

                }

                if(stage.getWidth()<685){

                    notificationButton.setVisible(false);
                    notificationButton.setManaged(false);

                }

                if(stage.getWidth()>=685){

                    notificationButton.setVisible(true);
                    notificationButton.setManaged(true);

                }

                if(stage.getWidth()<652){

                    midPaneButtonsArray[3].setVisible(false);
                    midPaneButtonsArray[3].setManaged(false);

                }

                if(stage.getWidth()>=652){

                    midPaneButtonsArray[3].setVisible(true);
                    midPaneButtonsArray[3].setManaged(true);

                }

                if(stage.getWidth()<630){

                    midPaneButtonsArray[3].setVisible(true);
                    midPaneButtonsArray[3].setManaged(true);

//                    midPaneButtonsArray[4].setVisible(true);
//                    midPaneButtonsArray[4].setManaged(true);


                    lr.setVisible(false);
                    lr.setManaged(false);

                    lrGap.setVisible(false);
                    lrGap.setManaged(false);


                }

                if(stage.getWidth()>=630){

                    midPaneButtonsArray[3].setVisible(false);
                    midPaneButtonsArray[3].setManaged(false);

//                    midPaneButtonsArray[4].setVisible(false);
//                    midPaneButtonsArray[4].setManaged(false);

                    lr.setVisible(true);
                    lr.setManaged(true);

                    lrGap.setVisible(true);
                    lrGap.setManaged(true);

                }

                if(stage.getWidth()<548){

                    midPaneButtonsArray[3].setVisible(false);
                    midPaneButtonsArray[3].setManaged(false);

                }

                if(stage.getWidth()>=548){

                    midPaneButtonsArray[3].setVisible(true);
                    midPaneButtonsArray[3].setManaged(true);

                }


                if(stage.getWidth()<471){

                    historyButton.setVisible(false);
                    historyButton.setManaged(false);

                    searchButton.setVisible(false);
                    searchButton.setManaged(false);

                }

                if(stage.getWidth()>=471){

                    historyButton.setVisible(true);
                    historyButton.setManaged(true);

                    searchButton.setVisible(true);
                    searchButton.setManaged(true);

                }


                if(stage.getWidth()<419){

                    midPaneButtonsArray[2].setVisible(false);
                    midPaneButtonsArray[2].setManaged(false);

                }

                if(stage.getWidth()>=419){

                    midPaneButtonsArray[2].setVisible(true);
                    midPaneButtonsArray[2].setManaged(true);

                }



            }
        });

        // width+hidden property handler//


        return root;

    }

    public Button createButton(String label, Pos align){

        Button btn = new Button(label);

//        btn.setPrefSize(20,8);

        btn.setAlignment(align);

        return btn;

    }

    public ToggleButton createToggleButton(String label, Pos align){

        ToggleButton btn = new ToggleButton(label);

//        btn.setPrefSize(20,8);

        btn.setAlignment(align);

        return btn;

    }

    public VBox createCenteredButton(Button btn){

        VBox ret = new VBox(btn);

        ret.setAlignment(Pos.CENTER);

        return ret;

    }

    public VBox createCenteredToggleButton(ToggleButton btn){

        VBox ret = new VBox(btn);

        ret.setAlignment(Pos.CENTER);

        return ret;

    }

    public VBox createCenteredVbox(Label label){

        VBox ret = new VBox(label);

        ret.setAlignment(Pos.CENTER);

        return ret;

    }

}
