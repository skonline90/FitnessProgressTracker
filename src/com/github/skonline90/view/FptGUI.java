package com.github.skonline90.view;

import com.github.skonline90.controller.ApplicationProperties;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FptGUI extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        BorderPane borderPane = new BorderPane();
        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        
        NavigationBar navi = new NavigationBar();
        ButtonBar buttons = new ButtonBar();
        
        VBox vbox = new VBox();
        vbox.getChildren().addAll(navi, buttons);
        vbox.setSpacing(10);

        
       
        borderPane.setLeft(vbox);
        
        
        setUiProperties(primaryStage);
    }

    private void setUiProperties(Stage primaryStage)
    {
        primaryStage.setTitle(ApplicationProperties.FULL_APPLICATION_NAME);
        primaryStage.show();
    }

}
