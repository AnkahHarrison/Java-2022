package com.example.demo1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
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
    private Label lblReset;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;


    @FXML
    private ToggleGroup Languages;

    @FXML
    private ToggleGroup Maths;

    @FXML
    private Button btnCalculate;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnSave;

    @FXML
    private Label lblDisplay;

    @FXML
    private Label lblResult;

    @FXML
    private RadioButton rdnAdd;

    @FXML
    private RadioButton rdnCplus;

    @FXML
    private RadioButton rdnDiv;

    @FXML
    private RadioButton rdnJava;

    @FXML
    private RadioButton rdnMult;

    @FXML
    private RadioButton rdnPython;

    @FXML
    private RadioButton rdnSub;

    @FXML
    private TextField txtFirstNumber;

    @FXML
    private TextField txtSecondNumber;

    @FXML
    void onCancel(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void onLogin(ActionEvent event) throws IOException {
        String typedUsername =txtUsername.getText();
        String typedPassword=txtPassword.getText();
        if (typedUsername.equals("admin")&&(typedPassword.equals("1234"))) {
//           Platform.exit();
            Stage loginStage = (Stage) btnLogin.getScene().getWindow();
            loginStage.close();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MainApp.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Stage stage=new Stage();
            stage.setTitle("Login");
            //        to add image to the main application

            Image icon = new Image(getClass().getResourceAsStream("icons8_java_48px.png"));
            stage.getIcons().add(icon);

            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();




        }
        else {
            lblLogin.setTextFill((Color.RED));
            lblLogin.setText("Invalid login");
        }


    }

    @FXML
    void onMouseClicked(MouseEvent event) {
lblReset.setText("To be implemented by Seyram");
    }

//MAIN APP
    @FXML
    void onCalculate(ActionEvent event) {
        if (txtFirstNumber.getText().equals("") || txtSecondNumber.getText().equals("")) {

            lblResult.setText("Type numbers in both field");
        } else {
            double firstNum = Double.parseDouble(txtFirstNumber.getText());
            double SecondNum = Double.parseDouble(txtSecondNumber.getText());
            double results = 0;
            if (rdnAdd.isSelected()){
                results=firstNum+SecondNum;
                lblResult.setText(firstNum + "+"+SecondNum + "="+results);
            }
           else if (rdnSub.isSelected()){
                results=firstNum-SecondNum;
                lblResult.setText(firstNum + "-"+SecondNum + "="+results);
            }
          else if (rdnDiv.isSelected()){
                results=firstNum/SecondNum;
                lblResult.setText(firstNum + "/"+SecondNum + "="+results);
            }
           else if (rdnMult.isSelected()){
                results=firstNum*SecondNum;
                lblResult.setText(firstNum + "*"+SecondNum + "="+results);
            }
        }
    }

    @FXML
    void onLogout(ActionEvent event) throws IOException {
        Stage logoutStage = (Stage) btnLogout.getScene().getWindow();
        logoutStage.close();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage=new Stage();
        stage.setTitle("Login");
        //        to add image to the main application

        Image icon = new Image(getClass().getResourceAsStream("python.png"));
        stage.getIcons().add(icon);

        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }

    @FXML
    void onSave(ActionEvent event) {
        String selectedLang="";
        if(rdnJava.isSelected()){
            selectedLang=rdnJava.getText();
        } else if (rdnPython.isSelected()) {
            selectedLang=rdnPython.getText();
        } else if (rdnCplus.isSelected()) {
            selectedLang=rdnCplus.getText();
        }
        lblDisplay.setText("You have selected:"+selectedLang);

    }
    @FXML
    void onEnter(KeyEvent event) throws IOException {
//        scene.setOnKeyPressed(e -> {
//            if (e.getCode() == KeyCode.ENTER) {
//                login();
//            }
//        });

    }


//    VARIABLE TO STORE OLD TEXT
String oldText="";
    int oldCursorPostion=0;

    @FXML
    void checkNumber(KeyEvent event) {
//if(Character.isDigit(event.getCharacter())){
//    event.consume();
//}
        String typedKey=event.getCharacter();
        //REGEX
        if(typedKey.matches("^[a-z,A-Z,\\-,+,+,*]+$")){
            txtFirstNumber.setStyle("-fx-border-color: red");
            txtFirstNumber.setText(oldText);
            txtFirstNumber.positionCaret(oldCursorPostion);
//            The positionCaret() method in JavaFX is used to set the current
//            position of the caret (cursor) within a text input control such as a
//            TextField or TextArea. The method takes an integer parameter that
//            represents the position of the caret within the text input control.
////            Here's an example usage of the positionCaret() method:

        }

    }

    @FXML
    void getOldtext(KeyEvent event) {
        oldText=txtFirstNumber.getText();
        System.out.println(oldText);
        oldCursorPostion=txtFirstNumber.getCaretPosition();
        System.out.println(oldCursorPostion);

    }

}
