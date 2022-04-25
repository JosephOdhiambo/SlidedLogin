module com.example.slidedlogin {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.slidedlogin to javafx.fxml;
    exports com.example.slidedlogin;
}