package com.example.demo2;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class TreeViewExample {

    public Scene f(){

        Image img = new Image(HelloApplication.fileInputStream,20,20,true,true);

        TreeView<String> tv = new TreeView<>();

        TreeItem<String> files = new TreeItem<>("files");

        TreeItem<String> pic = new TreeItem<>("pics");

        TreeItem<String> docs = new TreeItem<>("docs");

        tv.setRoot(files);

        files.getChildren().addAll(pic, docs);

        TreeItem<String> pic1 = new TreeItem<>("pics1");
        TreeItem<String> pic2 = new TreeItem<>("pics2");
        TreeItem<String> pic3 = new TreeItem<>("pics3");

        TreeItem<String> docs1 = new TreeItem<>("docs1");
        TreeItem<String> docs2 = new TreeItem<>("docs2");
        TreeItem<String> docs3 = new TreeItem<>("docs3");

        files.setGraphic(new ImageView(img));

        pic.setGraphic(new ImageView(img));
        docs.setGraphic(new ImageView(img));

        pic1.setGraphic(new ImageView(img));
        pic2.setGraphic(new ImageView(img));
        pic3.setGraphic(new ImageView(img));

        docs1.setGraphic(new ImageView(img));
        docs2.setGraphic(new ImageView(img));
        docs3.setGraphic(new ImageView(img));

        pic.getChildren().addAll(pic1,pic2,pic3);

        docs.getChildren().addAll(docs1,docs2,docs3);

//        files.setGraphic(new ImageView(img));
//
//        pic.setGraphic(new ImageView(img));
//        docs.setGraphic(new ImageView(img));
//
//        pic1.setGraphic(new ImageView(img));
//        pic2.setGraphic(new ImageView(img));
//        pic3.setGraphic(new ImageView(img));
//
//        docs1.setGraphic(new ImageView(img));
//        docs2.setGraphic(new ImageView(img));
//        docs3.setGraphic(new ImageView(img));

        Label lb = new Label("Nothing Selected");

//        tv.setShowRoot(false);

        tv.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TreeItem<String>>() {
            @Override
            public void changed(ObservableValue<? extends TreeItem<String>> observableValue, TreeItem<String> stringTreeItem, TreeItem<String> t1) {
//                lb.setText(t1.getValue().toString());

                try {
                    lb.setText(t1.getValue().toString());
                } catch (Exception e){
                    System.out.println(e);
                }

            }
        });

        VBox root = new VBox();

        root.getChildren().addAll(tv,lb);

        Scene ret = new Scene(root);

        return ret;

    }

}
