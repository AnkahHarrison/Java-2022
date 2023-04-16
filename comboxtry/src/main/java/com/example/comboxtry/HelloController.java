package com.example.comboxtry;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    String [] operations={"Add","Subtract","Multiply","Divide"};

    @FXML
    private ComboBox<String> operation;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        operation.getItems().addAll(operations);

    }
}
