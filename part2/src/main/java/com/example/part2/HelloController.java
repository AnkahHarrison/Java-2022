package com.example.part2;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class HelloController implements Initializable {

    @FXML
    private Button btnEdit;

    @FXML
    private Button btnLock;

    @FXML
    private Button btnOpen;

    @FXML
    private Button btnSave;

    @FXML
    private Label lblCharacters;
//    to open directories
    FileChooser choose=new FileChooser();

    @FXML
    private TextArea txtEditor;

    @FXML
    void getCharacters(KeyEvent event) {
lblCharacters.setText("Number of characters:"+txtEditor.getText().length());
    }

    @FXML
    void onEdit(ActionEvent event) {
        txtEditor.setEditable(true);
    }

    @FXML
    void onExit(ActionEvent event) {
        Platform.exit();

    }

    @FXML
    void onLock(ActionEvent event) {
txtEditor.setEditable(false);
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
            while (input.hasNext()){
//                txtEditor.setText(input.nextLine()+"\n");
                txtEditor.appendText(input.next() +"\n");
            }
            input.close();
            lblCharacters.setText("Number of characters:"+txtEditor.getText().length());
             }
    }

    @FXML
    void onSave(ActionEvent event) throws FileNotFoundException {
        choose.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files(*.txt)","*.txt"));
// show save dialog box
        File selected =choose.showSaveDialog(new Stage());
        if(selected==null){
            //do nothing
        }else {
            PrintWriter output =new PrintWriter(selected);
            String text=txtEditor.getText();
            output.println(text);
            output.close();//always close printwriter
            txtEditor.setText("");
//            lblCharacters.setText("");
            lblCharacters.setText("Number of characters:"+txtEditor.getText().length());
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choose.setInitialDirectory(new File("C:\\Users"));
    }
}
