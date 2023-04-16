package com.example.practical;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
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
    private Label lblDisplay;

    @FXML
    private Label lblRegister;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void onLogin(ActionEvent event) throws IOException {
String typedUsername =txtUsername.getText();
String typedPassword=txtPassword.getText();
if(typedUsername.equals("admin") &&typedPassword.equals("1234")){

    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MainApp.fxml"));
    Stage loginstage =(Stage) btnLogin.getScene().getWindow();
    loginstage.close();
    Scene scene = new Scene(fxmlLoader.load(), 600, 400);
    Stage stage=new Stage();
    stage.setTitle("MainApp");
    stage.setResizable(false);
    stage.setScene(scene);
    stage.show();

}else{
    lblDisplay.setTextFill(Color.RED);
    lblDisplay.setText("invalid Login details");
}
    }

    @FXML
    void onLogout(ActionEvent event) {
        Platform.exit();
    }

}
