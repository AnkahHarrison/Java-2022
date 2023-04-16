package com.example.practical;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class MainApp implements Initializable {

    @FXML
    private ComboBox<String> ComboFaculty;

    @FXML
    private ComboBox<String> ComboHall;

    @FXML
    private Button btnOpen;

    @FXML
    private Button btnRest;

    @FXML
    private Button btnSave;

    @FXML
    private Label lblSave;
FileChooser choose=new FileChooser();
    @FXML
    private TextArea txtEditor;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPhone;

    @FXML
    void OnReset(ActionEvent event) {
//a code to reset all the fields
        btnRest.setOnAction(e->{
            txtName.setText("");
            txtEmail.setText("");
            txtPhone.setText("");
            ComboFaculty.setValue("");
            ComboHall.setValue("");
            txtEditor.setText("");
        });
        lblSave.setText("Details Reset Successfully");
        lblSave.setText("");
    }

    @FXML
    void onComboFacultySelected(ActionEvent event) {

    }

    @FXML
    void onComboHallSelected(ActionEvent event) {

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
//            lblCharacters.setText("Number of characters:"+txtEditor.getText().length());
        }

    }

    @FXML
    void onSave(ActionEvent event) throws IOException {
        choose.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files(*.txt)","*.txt"));
// show save dialog box
        File selected =choose.showSaveDialog(new Stage());
        if(selected==null){
            //do nothing
        }else {
            String [] items ={"select Faculty","SPETS","SRID","FMMT","FOE","FGES"};
            System.out.println("saving file"+selected.getAbsolutePath());
            FileWriter writer =new FileWriter(selected);
            writer.write("Name: " + txtName.getText() + "\n");
            writer.write("TEL: " + txtPhone.getText() + "\n");
            writer.write("Email: " + txtEmail.getText() + "\n");

            //a code to select form combo box
            String selectedFaculty=ComboFaculty.getSelectionModel().getSelectedItem();
            writer.write("Faculty: " + selectedFaculty + "\n");
            String selectedHall=ComboHall.getSelectionModel().getSelectedItem();
            writer.write("Hall: " + selectedHall + "\n");




            writer.close();//always close printwriter

            lblSave.setText("Detail Save Successfully");
//            lblSave.setText("");
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String [] items ={"select Faculty","SPETS","SRID","FMMT","FOE","FGES"};
        ComboFaculty.getItems().addAll(items);

        String [] item ={"select Hall","Gold Hall","Dubai","KT","Camp City"};
        ComboHall.getItems().addAll(item);

    }

}
