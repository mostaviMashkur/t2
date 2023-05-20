package com.example.demo2;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Pagination;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.util.Callback;

public class PaginationTest {

    public Scene f(){

        Pagination pg = new Pagination();

        pg.setPageCount(10);

        pg.setCurrentPageIndex(4);

        pg.setPageFactory(new Callback<Integer, Node>() {
            @Override
            public Node call(Integer integer) {

                Parent pr = createParent(integer);
                return pr;
            }
        });

        BorderPane root = new BorderPane();

        root.setCenter(pg);

        Scene ret = new Scene(root);

        return ret;

    }

    public Parent createParent(int idx){

        VBox root = new VBox();

        Label l1 = new Label("Page "+String.valueOf(idx+1));

        root.getChildren().addAll(l1);

        return root;

    }

}
