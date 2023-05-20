package com.example.demo2;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class HelloApplication extends Application {

    public static String fileInputStream = "C:\\Users\\Reve\\Desktop\\fd.jpg";

    public static String imyt = "C:\\Users\\Reve\\Desktop\\yt.png";

    public static String imfb = "C:\\Users\\Reve\\Desktop\\fb.jpg";



    static double MIN_WIDTH = 350;

    static double MIN_HEIGHT = 700;

    @Override
    public void start(Stage stage) throws IOException {

//        retStackPane retsp = new retStackPane();
//
//        Scene  s1 = retsp.func();
//
//        LambdaTest lt = new LambdaTest();
//
//        Scene s2 = lt.f();

//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

//        Scene sbuilder = new Scene(fxmlLoader.load(), 320, 240);

//        BorderPaneTest bpn1 = new BorderPaneTest();

//        HboxTest hbt1 = new HboxTest();



//        Scene bptest = bpn1.f();

//        HboxTest hbt2 = new HboxTest();
//
//        Scene hbox = hbt2.f();

//        TilePaneTest tpt = new TilePaneTest();
//
//        Scene sctp = tpt.f();

        GridpaneTest gpOb = new GridpaneTest();

//        Scene scgp = gpOb.f();

        GridPane newGpOb = gpOb.f();

        newGpOb.setAlignment(Pos.CENTER_LEFT);

        HboxCeption hbOb = new HboxCeption();

        BorderPane mainPane = new BorderPane();

        Calender vbCal = new Calender();

        VBox calOb = vbCal.f(stage);



//        calOb.setPrefHeight(400);

        calOb.setAlignment(Pos.CENTER_RIGHT);

        calOb.setPrefHeight(300);

//        calOb.setTranslateY(250);

//        calOb.setAlignment(Pos.CENTER_RIGHT);

//        HBox gpaneAndCalender = new HBox(gpOb.f());

        MainPaneSettingsButton mainPaneSettingsButton = new MainPaneSettingsButton();

        VBox settingsButtonVbox = mainPaneSettingsButton.f();



        HBox gpaneAndCalender = new HBox(newGpOb,calOb);

        gpaneAndCalender.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

//        gpaneAndCalender.setMinSize(Double.MAX_VALUE,Double.MAX_VALUE);

        HBox.setHgrow(gpaneAndCalender,Priority.ALWAYS);

        gpaneAndCalender.setSpacing(150);

        gpaneAndCalender.setAlignment(Pos.CENTER);

        mainPane.setCenter(gpaneAndCalender);

        mainPane.setTop(hbOb.f(stage));

        mainPane.setRight(settingsButtonVbox);

        Scene hbscene = new Scene(mainPane,1300,700);

        String cssPath = "file:///C:/Users/Reve/IdeaProjects/demo2/src/main/java/com/example/demo2/cssSheets/fourButton.css";

        hbscene.getStylesheets().add(cssPath);

        String settingsBcssPath = "file:///C:/Users/Reve/IdeaProjects/demo2/src/main/java/com/example/demo2/cssSheets/settingsButton.css";

        hbscene.getStylesheets().add(settingsBcssPath);

        String calenIntfcssPath = "file:///C:/Users/Reve/IdeaProjects/demo2/src/main/java/com/example/demo2/cssSheets/calenderIntfc.css";

        hbscene.getStylesheets().add(calenIntfcssPath);

        String topPanecssPath = "file:///C:/Users/Reve/IdeaProjects/demo2/src/main/java/com/example/demo2/cssSheets/topBar.css";

        hbscene.getStylesheets().add(topPanecssPath);

        String topPaneMiddlecssPath = "file:///C:/Users/Reve/IdeaProjects/demo2/src/main/java/com/example/demo2/cssSheets/TopBarMiddlePane.css";

        hbscene.getStylesheets().add(topPaneMiddlecssPath);

        String topPaneLeftcssPath = "file:///C:/Users/Reve/IdeaProjects/demo2/src/main/java/com/example/demo2/cssSheets/TopLeft.css";

        hbscene.getStylesheets().add(topPaneLeftcssPath);

        PaneClassTest paneClassInstance = new PaneClassTest();

        Scene paneClassTestScene = paneClassInstance.f();

        TextfieldTest textfieldTest = new TextfieldTest();

        Scene textFieldScene = textfieldTest.f();

        LabelClassTest labelClassTest = new LabelClassTest();

        Scene labelTestScene = labelClassTest.f();

        ButtonEvenetHandling buttonEvenetHandling = new ButtonEvenetHandling();

        Scene buttonEventHandler = buttonEvenetHandling.f();

        ListViewExample listViewExample = new ListViewExample();

        Scene listView = listViewExample.f();

        CheckBoxTest checkBoxTest = new CheckBoxTest();

        Scene checkBoxScene = checkBoxTest.f();

        ComboBoxTest comboBoxTest = new ComboBoxTest();

        Scene comboBoxScene = comboBoxTest.f();

        ToggleButtonTest toggleButtonTest = new ToggleButtonTest();

        Scene toggleButtonScene = toggleButtonTest.f();

        ChoiceBoxTest choiceBoxTest = new ChoiceBoxTest();

        Scene choiceBoxScene = choiceBoxTest.f();

        ComboBoxOriginalTest comboBoxOriginalTest = new ComboBoxOriginalTest();

        Scene comboBoxOriginalScene = comboBoxOriginalTest.f();

        DatePickerTest datePickerTest = new DatePickerTest();

        Scene dataPickerTestScene = datePickerTest.f();

        ColorPickerTest colorPickerTest = new ColorPickerTest();

        Scene colorPicketTestScene = colorPickerTest.f();

        SliderTest sliderTest = new SliderTest();

        Scene sliderTestScene = sliderTest.f();

        ProgressBarTest progressBarTest = new ProgressBarTest();

        Scene progressBarTestScene = progressBarTest.f();

        ProgressIndicatorTest progressIndicatorTest = new ProgressIndicatorTest();

        Scene progressIndicatorTestScene = progressIndicatorTest.f();

//        hbscene.widthProperty().addListener(new Ch);

        GroupTest groupTest = new GroupTest();

        Scene groupTestScene = groupTest.f();

        SettingBackgroundImage settingBackgroundImage = new SettingBackgroundImage();

        Scene backGroundImageScene = settingBackgroundImage.f();

        ScrollPaneTest scrollPaneTest = new ScrollPaneTest();

        Scene scrollPaneTestScene = scrollPaneTest.f();

        SpliPaneTest spliPaneTest = new SpliPaneTest();

        Scene splitPaneTestScene = spliPaneTest.f();

        Spinnertest spinnertest = new Spinnertest();

        Scene spinnerTestScene = spinnertest.f();

        SpinnerStringTest spinnerStringTest = new SpinnerStringTest();

        Scene spinnerStringTestScene = spinnerStringTest.f();

        ToolBarTest toolBarTest = new ToolBarTest();

        Scene toolBarTestScene = toolBarTest.f();

        ToolTipTest toolTipTest = new ToolTipTest();

        Scene toolTipTestScene = toolTipTest.f();

        TreeViewExample treeViewExample = new TreeViewExample();

        Scene treeViewScene = treeViewExample.f();

        TitledPaneTest titledPaneTest = new TitledPaneTest();

        Scene titlePaneScene = titledPaneTest.f();

        AccordionTest accordionTest = new AccordionTest();

        Scene accordionScene  = accordionTest.f();

//        TabPaneTest tabPaneTest = new TabPaneTest();

//        Scene tabPaneScene = tabPaneTest.f();

        HyperLinkTest hyperLinkTest = new HyperLinkTest();

        Scene hyperLinkScene = hyperLinkTest.f();

        PaginationTest paginationTest = new PaginationTest();

        Scene paginationScene = paginationTest.f();

        FileChooserScene fileChooserScene = new FileChooserScene();

        Scene filechooserScene = fileChooserScene.f();

//        stage.setScene(filechooserScene);

//        stage.setScene(toolTipTestScene);

        stage.setScene(hbscene);// uncomment for existing project//

        stage.setMinWidth(MIN_WIDTH);

        stage.setMinHeight(MIN_HEIGHT);

        stage.setTitle("Zoom");

        stage.getIcons().add(new Image("C:\\Users\\Reve\\IdeaProjects\\demo2\\src\\main\\java\\com\\example\\demo2\\cssSheets\\zm.png"));

        stage.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                if(stage.getWidth() < 817){
                    calOb.setVisible(false);
                    calOb.setManaged(false);
                }
                if(stage.getWidth()>=817){
                    calOb.setVisible(true);
                    calOb.setManaged(true);
                }
            }
        });

        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}