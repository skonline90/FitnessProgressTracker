package com.github.skonline90.view;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class ButtonBar extends HBox
{
    private final Button btnAdd = new Button("+");
    private final Button btnDetails = new Button("Details");

    public ButtonBar()
    {
        getChildren().addAll(btnDetails, btnAdd);
        setSpacing(10);
    }
}
