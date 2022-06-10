module com.example.utulsbermarket {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.utilsbermarket to javafx.fxml;
    exports com.example.utilsbermarket;
}