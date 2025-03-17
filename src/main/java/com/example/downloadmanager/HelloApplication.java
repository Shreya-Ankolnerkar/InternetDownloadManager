package com.example.downloadmanager;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class HelloApplication extends Application {
    private static Scene scene;

    public HelloApplication() {
    }

    public void start(Stage stage) throws IOException {
        Scene scene = new Scene(loadFXML("downloadManager"), 1000.0, 700.0);
        stage.setTitle("Download Manager");
        stage.setScene(scene);
        stage.show();
        scene.getStylesheets().add(this.getClass().getResource("style.css").toExternalForm());

    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String downloadManager) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("downloadManager.fxml"));
        return fxmlLoader.<Parent>load();
    }

    public static void main(String[] args) {
        launch(new String[0]);
    }
}