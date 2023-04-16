module com.example.abass {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.abass to javafx.fxml;
    exports com.example.abass;
}