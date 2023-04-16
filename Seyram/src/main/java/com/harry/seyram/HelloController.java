package com.harry.seyram;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private Button btnChangeColor;

    @FXML
    private Button btnCopy;
    @FXML
    private Label lblDisplay;

    @FXML
    private Label lblLogin1;


    @FXML
    private TextArea textEditor;

    @FXML
    private Button btnCancel;
    @FXML
    private Button btnLogin;

    @FXML
    private Label lblLogin;


    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void onCancel(ActionEvent event) {

    }


    @FXML
    void onChangeColor(ActionEvent event) {
        lblDisplay.setTextFill(Color.CRIMSON);

    }

    @FXML
    void onCopy(ActionEvent event) {
        //get text in the text field
        String typedText =textEditor.getText();
        textEditor.setText("");
        //paste it here
        lblDisplay.setText(typedText);

    }

    @FXML
    void onMouseEnter(MouseEvent event) {
lblDisplay.setText("you moved into the label");
    }
    @FXML
    void onLogin(ActionEvent event) {
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        txtUsername.setText("");
        txtPassword.setText("");
        Stage loginStage = null;
        if (username.equals("seyram") && password.equals("seyram")) {
            loginStage = (Stage) btnLogin.getScene().getWindow();
            lblLogin.setTextFill(Color.GREEN);
            lblLogin.setText("valid details");

            lblLogin.setText("");

        } else {
            lblLogin.setTextFill(Color.RED);
            lblLogin.setText("username and password is incorrect");
            loginStage.close();
        }
    }



}



