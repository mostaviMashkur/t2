package com.example.demo2;

import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;

public class AccordionTest {

    public Scene f(){

        TitledPane tp1 = new TitledPane("pane1" ,new Label("Hello\nWorld\nHello"));

        TitledPane tp2 = new TitledPane("pane2" ,new Label("Hello\nWorld\nHello"));

        TitledPane tp3 = new TitledPane("pane3" ,new Label("Hello\nWorld\nHello"));

        Accordion ac = new Accordion(tp1,tp2,tp3);

//        ac.getPanes().addAll();


        VBox root = new VBox();

        root.getChildren().addAll(ac);

        Scene ret = new Scene(root);

        return ret;

    }

}
