package com.example.practice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class MainApp implements Initializable {

    @FXML
    private RadioButton RdnFemale;

    FileChooser choose=new FileChooser();
    @FXML
    private RadioButton RdnMale;

    @FXML
    private Button btnCalculate;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnOpen;

    @FXML
    private Button btnSave;

    @FXML
    private ToggleGroup gender;

    @FXML
    private Label lblResult;

    @FXML
    private ComboBox<String> operation;

    @FXML
    private TextArea txtEditor;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtFirstNumber;

    @FXML
    private TextField txtFullName;

    @FXML
    private TextField txtPhone;

    @FXML
    private TextField txtSecondNumber;

    @FXML
    void onCalculate(ActionEvent event) {
// a code to calculate the result
        btnCalculate.setOnAction(e->{

            double firstnumber=Double.parseDouble(txtFirstNumber.getText());
            double secondnumber=Double.parseDouble(txtSecondNumber.getText());
            String Operation=operation.getValue();
            double result=0;
            if(Operation.equals("Addition")){
                result=firstnumber+secondnumber;

            }else if(Operation.equals("Subtraction")){
                result=firstnumber-secondnumber;

            }else if(Operation.equals("Multiplication")){
                result=firstnumber*secondnumber;

            }else if(Operation.equals("Division")){
                result=firstnumber/secondnumber;

            }
            lblResult.setText(String.valueOf(result));
        });

    }

    @FXML
    void onLogout(ActionEvent event) throws IOException {
        Stage logoutstage =(Stage) btnLogout.getScene().getWindow();
        logoutstage.close();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 251);
        Stage stage=new Stage();
        stage.setTitle("Login");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();


    }

    @FXML
    void onOpen(ActionEvent event) throws FileNotFoundException {

        //        SET FILTERS TO ENSURE ONLY TEXT FILES AND FOLDERS ARE SHOWING
        choose.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files(*.txt)","*.txt"));
//a code


//        SHOW OPEN DIALOG BOX
        File selectedfile = choose.showOpenDialog(new Stage());
        if (selectedfile == null) {
            //user has not selected a file or cancel button clicked
//
        }else {//user selected a text file,open and write content of the file to the editor
//            txtEditor.setEditable("");

            Scanner input=new Scanner(selectedfile);
            while (input.hasNextLine()){
//                txtEditor.setText(input.nextLine()+"\n");
                txtEditor.appendText(input.nextLine() +"\n");
            }
            input.close();
        }



    }

    @FXML
    void onSave(ActionEvent event) throws IOException {
        //a code to save the file include the radio button
        choose.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files(*.txt)","*.txt"));
// show save dialog box
        File selected =choose.showSaveDialog(new Stage());
        if(selected==null){
            //do nothing
        }else {
            System.out.println("saving file"+selected.getAbsolutePath());
            FileWriter writer =new FileWriter(selected);
            writer.write("Name: " + txtFullName.getText() + "\n");
            writer.write("TEL: " + txtPhone.getText() + "\n");
            writer.write("Email: " + txtEmail.getText() + "\n");
            //a code to get a selected radio button
            RadioButton selectedGender =(RadioButton)gender.getSelectedToggle();
            writer.write("Gender: " + selectedGender.getText() + "\n");
//            writer.write("First Number: " + txtFirstNumber.getText() + "\n");
//            writer.write("Second Number: " + txtSecondNumber.getText() + "\n");
//            writer.write("Operation: " + operation.getValue() + "\n");
            writer.write("Result: " + lblResult.getText() + "\n");
//            writer.write("Detail: " + txtEditor.getText() + "\n");

            writer.close();//always close printwriter

        }





    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        operation.getItems().addAll("Addition","Subtraction","Multiplication","Division");

    }
}
