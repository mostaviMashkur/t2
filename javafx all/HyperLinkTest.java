package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import java.awt.Desktop;
import java.net.URL;

//import static jdk.jpackage.internal.WixAppImageFragmentBuilder.ShortcutsFolder.Desktop;

public class HyperLinkTest {

    public Scene f(){

        Hyperlink hl = new Hyperlink("Click");

        String add = "https://www.youtube.com/watch?v=buh9YiXQy1g&list=PLV7ksurD7D3X8iW_3cT9SNpqS2mQYy9Ht&index=71";

        hl.setGraphic(new ImageView(new Image(HelloApplication.imyt,20,20,true,true)));

        hl.setStyle("-fx-focus-color: transparent; -fx-border-color: transparent;");

        hl.setFont(Font.font("Times New Roman", 20));

        hl.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    Desktop.getDesktop().browse(new URL(add).toURI());
                } catch (Exception e){
                    System.out.println(e);
                }
            }
        });

        StackPane root = new StackPane();

        root.getChildren().addAll(hl);

        Scene ret = new Scene(root);

        return ret;

    }

}
