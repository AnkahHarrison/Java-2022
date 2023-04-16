package com.example.practice;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnLogin;

    @FXML
    private Label lblLogin;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUsername;


    @FXML
    void onLogin(ActionEvent event) throws IOException {
        String typedUsername = txtUsername.getText();
        String typedPassword = txtPassword.getText();

        if (typedUsername.equals("admin") && typedPassword.equals("1234")) {
//    show alert message start
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setResizable(false);
            alert.setTitle("Message");
            alert.setHeaderText("Welcome admin");
            alert.showAndWait();
//end of show alert
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MainApp.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 552, 400);
            Stage stage = new Stage();
            Stage loginstage = (Stage) btnLogin.getScene().getWindow();
            loginstage.close();
            stage.setTitle("Main");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } else {
            lblLogin.setTextFill(Color.RED);
            lblLogin.setText("invalid Login");


//    show alert message start
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setResizable(false);
            alert.setTitle("Message");
            alert.setHeaderText("Incorrect Username or password,please try again");
            alert.showAndWait();
//end of show alert
        }

    }

    public void onCancel(ActionEvent actionEvent) {
        Platform.exit();
    }
}
