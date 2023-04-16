
//ANKAH HARRISON
//FOE4100805421
package com.example.foe4100805421;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnLogin;

    @FXML
    private Label lblDisplay;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void onCancel(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void onLogin(ActionEvent event) throws IOException {
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        if (username.equals("admin") && password.equals("1234")) {
            Stage loginscreen = (Stage) btnLogin.getScene().getWindow();
            loginscreen.close();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MainApp.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Stage stage = new Stage();
            stage.setTitle("Debtor App");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();

        } else {
            lblDisplay.setText("Invalid login details");

        }

    }

}
