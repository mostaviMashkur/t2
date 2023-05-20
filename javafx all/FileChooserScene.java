package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.util.List;

public class FileChooserScene {

    public Scene f(){

        Button btn = new Button("Click to open dilaouge");

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                FileChooser fc = new FileChooser();

                fc.setTitle("Open a file");

                fc.setInitialDirectory(new File(System.getProperty("user.home")));

                FileChooser.ExtensionFilter fe1 = new FileChooser.ExtensionFilter(".java", "*.java");


                FileChooser.ExtensionFilter fe2 = new FileChooser.ExtensionFilter(".png", "*.png");

                FileChooser.ExtensionFilter fe3 = new FileChooser.ExtensionFilter(".jpg", "*.jpg");

                fc.getExtensionFilters().addAll(fe1,fe2,fe3);

//                Node node = (Node) btn.getSource();

//                Node node = btn;

                Stage stg = (Stage) btn.getScene().getWindow();

                List<File> lsf = fc.showOpenMultipleDialog(stg);

                try {
                    for (int i= 0;i < lsf.size();i++){
                        System.out.println(lsf.get(i).getAbsolutePath().toString());
                    }
                }catch (Exception e){
                    System.out.println(e);
                }

            }
        });

        StackPane root = new StackPane();

        root.getChildren().addAll(btn);

        Scene ret = new Scene(root);

        return ret;

    }

}
