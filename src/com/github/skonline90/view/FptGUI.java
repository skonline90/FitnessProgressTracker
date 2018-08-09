package com.github.skonline90.view;

import com.github.skonline90.controller.ApplicationProperties;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class FptGUI extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setTitle(ApplicationProperties.FULL_APPLICATION_NAME);
        primaryStage.show();

        BorderPane root = new BorderPane();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

        TreeItem<String> treeRoot = new TreeItem<>();
        TreeView<String> tree = new TreeView<>(treeRoot);
        //        tree.setShowRoot(false);
        TreeItem<String> tiEnduranceExercise = new TreeItem<>();
        TreeItem<String> tiRegularExercise = new TreeItem<>();
        TreeItem<String> tiMachineExercise = new TreeItem<>();
        TreeItem<String> tiPainExercise = new TreeItem<>();
        treeRoot.getChildren()
            .add(tiRegularExercise);
        treeRoot.getChildren()
            .add(tiEnduranceExercise);
        treeRoot.getChildren()
            .add(tiMachineExercise);
        treeRoot.getChildren()
            .add(tiPainExercise);
        root.setLeft(tree);
    }

}
