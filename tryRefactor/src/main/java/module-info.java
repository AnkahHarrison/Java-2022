module com.example.tryrefactor {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tryrefactor to javafx.fxml;
    exports com.example.tryrefactor;
}