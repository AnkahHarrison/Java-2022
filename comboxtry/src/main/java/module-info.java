module com.example.comboxtry {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.comboxtry to javafx.fxml;
    exports com.example.comboxtry;
}