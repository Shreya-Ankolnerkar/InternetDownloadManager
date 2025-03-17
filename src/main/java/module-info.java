module com.example.downloadmanager {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.downloadmanager to javafx.fxml;
    exports com.example.downloadmanager;
}