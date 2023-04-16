module com.example.combo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.combo to javafx.fxml;
    exports com.example.combo;
}