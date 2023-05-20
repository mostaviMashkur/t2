package com.example.demo2;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.event.ActionEvent;

public class MainPaneSettingsButton {

//    public static Stage ret = new Stage(StageStyle.DECORATED);

    public Stage s2;

    public VBox f(){

        Region settingsButtonRegion = new Region();

//        settingsButtonRegion.getStyleClass().add("");

        HBox.setHgrow(settingsButtonRegion,Priority.ALWAYS);

        Button settingsButton = new Button();

        settingsButton.getStyleClass().add("settingsButton");

//        settingsButton.se

        settingsButton.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent actionEvent) {
                s2 = createStage(actionEvent);
                if(s2.isShowing() == false){
                    s2.show();
                }

            }
        });


        HBox settingsButtonHbox = new HBox();

        settingsButtonHbox.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

//        settingsButtonHbox.setMinSize(Double.MAX_VALUE,Double.MAX_VALUE);

        settingsButtonHbox.getChildren().addAll(settingsButtonRegion,settingsButton);

        VBox settingsButtonVbox = new VBox(settingsButtonHbox);

//        settingsButtonVbox.setMaxWidth(Double.MAX_VALUE);

        settingsButton.setAlignment(Pos.TOP_RIGHT);

        VBox.setVgrow(settingsButtonVbox, Priority.ALWAYS);

        return settingsButtonVbox;
    }

    public Stage createStage(javafx.event.ActionEvent e){

        Stage ret = new Stage(StageStyle.DECORATED);
        Node node = (Node) e.getSource();

        Stage root = (Stage) node.getScene().getWindow();



        try {
            ret.initModality(Modality.APPLICATION_MODAL);
        } catch (Exception exp){
            exp.printStackTrace();
        }

        ret.initOwner(root);

        VBox vb = new VBox();

        Scene sc = new Scene(vb,600,600);

        ret.setScene(sc);
        return ret;
    }

}
