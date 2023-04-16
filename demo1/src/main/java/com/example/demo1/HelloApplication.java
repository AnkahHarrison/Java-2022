package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Login");
//        to add image to the main application
        Image icon = new Image(getClass().getResourceAsStream("python.png"));
        stage.getIcons().add(icon);
        //end
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        //
    }

    public static void main(String[] args) {
        launch();
    }
}