
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
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.util.Scanner;

public class MainApp {

    @FXML
    private Button btnEditInformation;

    @FXML
    private Button btnSaveDebtor;

    @FXML
    private Button btnSaveUdates;

    @FXML
    private Button btnViewExisting;

    @FXML
    private ToggleGroup gender;

    @FXML
    private Label lblAmount;

    @FXML
    private Label lblGender;

    @FXML
    private Label lblName;

    @FXML
    private Label lblPhone;

    @FXML
    private MenuItem menuExisting;

    FileChooser choose = new FileChooser();
    @FXML
    private MenuItem menuExit;

    @FXML
    private MenuItem menuLogout;

    @FXML
    private RadioButton rdnFemale;

    @FXML
    private RadioButton rdnMale;

    @FXML
    private TextField txtAmount;

    @FXML
    private TextArea txtEditor;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPhone;

    @FXML
    void OnMenuViewExisting(ActionEvent event) throws FileNotFoundException {
       // SET FILTERS TO ENSURE ONLY TEXT FILES AND FOLDERS ARE SHOWING
        choose.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files(*.txt)","*.txt"));


//        SHOW OPEN DIALOG BOX
        File selectedfile = choose.showOpenDialog(new Stage());
        if (selectedfile == null) {
            //user has not selected a file or cancel button clicked
//
        }else {//user selected a text file,open and write content of the file to the editor
//            txtEditor.setEditable("");

            Scanner input = new Scanner(selectedfile);
            while (input.hasNextLine()) {
//                txtEditor.setText(input.nextLine()+"\n");
                txtEditor.appendText(input.nextLine() + "\n");
            }
            input.close();
        }
    }

    @FXML
    void onEditInformation(ActionEvent event) {
//  a code to set edit to not editable when user logs into the main app

//String edit=txtEditor.getText();
       // txtEditor.setEditable(false);
        // a if else statement to set the text field to not editable when the user logs in
        if (txtEditor.isEditable()) {
            txtEditor.setEditable(false);
//            btnEditInformation.setDisable(true);
//            btnSaveUdates.setDisable(true);
        } else {
            txtEditor.setEditable(true);
        }



    }

    @FXML
    void onFemaleSelected(ActionEvent event) {

    }

    @FXML
    void onMaleSelected(ActionEvent event) {

    }

    @FXML
    void onMenuExit(ActionEvent event) {
        //a code to exit the menu
        menuExit = new MenuItem();
        Platform.exit();

    }

    @FXML
    void onMenuLogout(ActionEvent event) throws IOException {
        //a code to logout the menu out
        // a code to logout the menu
menuLogout = new MenuItem();




//
//        Stage loginscreen = (Stage) menuLogout.getScene().getWindow();
//        loginscreen.close();/
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Login");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void onSaveDebtor(ActionEvent event) throws IOException {
        choose.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files(*.txt)","*.txt"));
// show save dialog box
        File selected =choose.showSaveDialog(new Stage());
        if(selected==null){
            //do nothing
        }else {
            System.out.println("saving file" + selected.getAbsolutePath());
            FileWriter writer = new FileWriter(selected);
            writer.write("Name: " + txtName.getText() + "\n");
            writer.write("Phone: " + txtPhone.getText() + "\n");
            writer.write("Amount: " + txtAmount.getText() + "\n");
            RadioButton selectedGender =(RadioButton)gender.getSelectedToggle();
            writer.write("Gender: " + selectedGender.getText() + "\n");
            writer.close();//always close printwriter





            writer.close();


        }

    }

    @FXML
    void onSaveUpdate(ActionEvent event) throws IOException {
        choose.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files(*.txt)","*.txt"));
// show save dialog box
        File selected =choose.showSaveDialog(new Stage());
        if(selected==null){
            //do nothing
        }else {
            System.out.println("saving file" + selected.getAbsolutePath());
            FileWriter writer = new FileWriter(selected);
            writer.write("Name: " + txtName.getText() + "\n");
            writer.write("Phone: " + txtPhone.getText() + "\n");
            writer.write("Amount: " + txtAmount.getText() + "\n");
            RadioButton selectedGender = (RadioButton) gender.getSelectedToggle();
            writer.write("Gender: " + selectedGender.getText() + "\n");
            writer.close();//always close printwriter


            writer.close();
        }
    }

    @FXML
    void onViewExistingDebtor(ActionEvent event) throws FileNotFoundException {
        //        SET FILTERS TO ENSURE ONLY TEXT FILES AND FOLDERS ARE SHOWING
        choose.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files(*.txt)","*.txt"));


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

}


//    String editor = txtEditor.getText();
//     // a code to set txt not and and only editable if the user open a txt file
//        if(editor.equals("")){
//            txtEditor.setEditable(false);
//            btnEditInformation.setDisable(true);
//            btnSaveUdates.setDisable(true);
//
//        }else{
//            txtEditor.setEditable(true);}
////        btnEditInformation.setDisable(false);
////        btnSaveUdates.setDisable(false);