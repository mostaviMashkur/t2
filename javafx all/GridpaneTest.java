package com.example.demo2;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.text.Text;

public class GridpaneTest {

    public GridPane f(){

        Button b1 = createButton("");

        b1.getStyleClass().add("b1");

        Label btnText1 = new Label("New Meeting");

        Button arrow = new Button();

//        arrow.setPrefSize(.5,.5);

        arrow.getStyleClass().add("ar");

        HBox newMeet = new HBox();

        newMeet.setSpacing(5);

        newMeet.getChildren().addAll(btnText1,arrow);

        VBox vBtn1 = new VBox(b1, createCenteredVbox2(newMeet) );

        vBtn1.setSpacing(15);

        Button b2 = createButton("");

        b2.getStyleClass().add("b2");

        Label btnText2 = new Label("Join");

        VBox vBtn2 = new VBox(b2, createCenteredVbox(btnText2) );

        Button b3 = createButton("");

        b3.getStyleClass().add("b3");

        Label btnText3 = new Label("Schedule    ");

        Region scheduleWidth = new Region();

//        scheduleWidth.setPrefWidth(0.05);

        HBox scheduleButtonBox = new HBox(btnText3,scheduleWidth);

        VBox vBtn3 = new VBox(b3, createCenteredVbox(btnText3) );

        Button b4 = createButton("");

        b4.getStyleClass().add("b4");

        Label btnText4 = new Label("Share Screen");

        btnText4.setAlignment(Pos.CENTER);

        VBox vBtn4 = new VBox(b4, createCenteredVbox(btnText4) );

        vBtn2.setSpacing(15);
        vBtn3.setSpacing(15);
        vBtn4.setSpacing(15);

//        b1.setPrefSize(200,100);
//
//        b2.setPrefSize(200,100);
//
//        b3.setPrefSize(200,100);
//
//        b4.setPrefSize(200,100);

//        vBtn2.setSpacing(15);
//
//        vBtn3.setSpacing(15);
//
//        vBtn4.setSpacing(15);

        GridPane gp = new GridPane();

        gp.add(vBtn1,0,0);

        gp.add(vBtn2,1,0);

        gp.add(vBtn3,0,1);

        gp.add(vBtn4,1,1);

        gp.setAlignment(Pos.CENTER);

        gp.setHgap(50);

        gp.setVgap(50);

//        gp.setMaxWidth(Double.MAX_VALUE);

//        HBox.setHgrow(gp,Priority.ALWAYS);
//
//        HBox root = new HBox();
//
//        Region left = new Region();
//
//        Region right = new Region();
//
//        HBox.setHgrow(left,Priority.ALWAYS);
//
//        HBox.setHgrow(right, Priority.ALWAYS);
//
//        HBox.setHgrow(root,Priority.ALWAYS);

//        root.getChildren().addAll(left, gp, right);

        return gp;

    }

    public Button createButton(String label){

        Button btn = new Button(label);

        btn.setPrefSize(80,80);

        return btn;

    }

    public VBox createCenteredVbox(Label label){

        VBox ret = new VBox(label);

        label.setAlignment(Pos.CENTER);

        ret.setAlignment(Pos.CENTER);

        return ret;

    }

    public VBox createCenteredVbox3(HBox label){

        VBox ret = new VBox(label);

//        label.setAlignment();

//        label.setAlignment(Pos.TOP_LEFT);

        ret.setAlignment(Pos.CENTER);

        return ret;

    }

    public VBox createCenteredVbox2(HBox label){

        VBox ret = new VBox(label);

        ret.setAlignment(Pos.CENTER);

        return ret;

    }



}
