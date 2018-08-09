package com.github.skonline90.view;

import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class NavigationBar extends VBox
{
    private static final String TREE_ROOT_NAME = "Exercises";
    private static final String TREE_REGULAR = "Regular";
    private static final String TREE_ENDURANCE = "Endurance";
    private static final String TREE_MACHINE = "Machine";
    private static final String TREE_PAIN = "Pain";

    private final TreeItem<String> treeRoot = new TreeItem<>();
    private final TreeItem<String> tiRegularExercise = new TreeItem<>();
    private final TreeItem<String> tiEnduranceExercise = new TreeItem<>();
    private final TreeItem<String> tiMachineExercise = new TreeItem<>();
    private final TreeItem<String> tiPainExercise = new TreeItem<>();
    private final TreeView<String> navigationTree = new TreeView<>();

    private final Button btnAdd = new Button("+");
    private final Button btnDetails = new Button("Details");

    HBox hboxBtns = new HBox();

    public NavigationBar()
    {
        createTreeStructure();
        createButtonHBox();

        getChildren().add(navigationTree);
        getChildren().add(hboxBtns);
        setSpacing(10);
    }

    private void createTreeStructure()
    {
        navigationTree.setRoot(treeRoot);
        navigationTree.setShowRoot(false);
        treeRoot.setValue(TREE_ROOT_NAME);
        treeRoot.setExpanded(true);
        tiRegularExercise.setValue(TREE_REGULAR);
        tiEnduranceExercise.setValue(TREE_MACHINE);
        tiMachineExercise.setValue(TREE_PAIN);
        tiPainExercise.setValue(TREE_ENDURANCE);
        treeRoot.getChildren()
            .add(tiRegularExercise);
        treeRoot.getChildren()
            .add(tiEnduranceExercise);
        treeRoot.getChildren()
            .add(tiMachineExercise);
        treeRoot.getChildren()
            .add(tiPainExercise);
    }

    private void createButtonHBox()
    {
        hboxBtns.getChildren()
            .addAll(btnDetails, btnAdd);
        hboxBtns.setSpacing(10);
    }
}
