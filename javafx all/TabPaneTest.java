package com.example.demo2;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class TabPaneTest {

    public Scene f(){

        String imyt = "C:\\Users\\Reve\\Desktop\\yt.png";

        String imfb = "C:\\Users\\Reve\\Desktop\\fb.jpg";

        Tab tab1 = new Tab();

        tab1.setText("Youtube");

        tab1.setGraphic(new ImageView(new Image(imyt,20,20,true,true)));

        tab1.setContent(new StackPane(new Label("Youtube")));

        Tab tab2 = new Tab();

        tab2.setText("Facebook");

        tab2.setGraphic(new ImageView(new Image(imfb,20,20,true,true)));

        tab2.setContent(new StackPane(new Label("Facebook")));

        Tab pls = new Tab();

        pls.setText("+");

        TabPane tp = new TabPane();

        tp.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Tab>() {
            @Override
            public void changed(ObservableValue<? extends Tab> observableValue, Tab tab, Tab t1) {
                System.out.println(t1.getText());
            }
        });

        pls.setOnSelectionChanged(new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                int sz = tp.getTabs().size();

                Tab addTab = new Tab();

                addTab.setText("Tab "+String.valueOf(sz-1));

                tp.getTabs().add(sz-1,addTab);

                tp.getSelectionModel().select(sz-1);

//                pls.clo

            }
        });


        tp.getTabs().addAll(tab1,tab2,pls);

        VBox root = new VBox();

        root.getChildren().addAll(tp);

        Scene ret = new Scene(root);

        return ret;

    }

}
