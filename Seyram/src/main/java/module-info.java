module com.harry.seyram {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.harry.seyram to javafx.fxml;
    exports com.harry.seyram;
}