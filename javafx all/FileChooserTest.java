package com.example.demo2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.util.List;

public class FileChooserTest extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        FileChooser fc = new FileChooser();

        fc.setInitialDirectory(new File("D:\\gittest"));

        fc.setInitialDirectory(new File(System.getProperty("user.home")));

        FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter(".txt","*.txt");
        FileChooser.ExtensionFilter filter2 = new FileChooser.ExtensionFilter(".jpg","*.jpg");

        fc.getExtensionFilters().addAll(filter2,filter);

        try {
            File fl = fc.showOpenDialog(primaryStage);
            System.out.println(fl.getAbsolutePath().toString());

        }catch (Exception e){
            System.out.println(e);
        }

        try {
            List<File> fls = fc.showOpenMultipleDialog(primaryStage);

            for (int i=0;i< fls.size();i++) System.out.println(fls.get(i).getAbsolutePath().toString());
        } catch (Exception e){
            System.out.println(e);
        }
//        fc.showOpenDialog(primaryStage);


    }

    public static void main(String args[]){
        launch(args);
    }
}
