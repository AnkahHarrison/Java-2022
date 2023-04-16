module com.example.classfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.classfx to javafx.fxml;
    exports com.example.classfx;
}