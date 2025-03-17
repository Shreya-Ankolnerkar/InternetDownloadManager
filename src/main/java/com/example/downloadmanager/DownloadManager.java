package com.example.downloadmanager;

import com.example.downloadmanager.Config.AppConfig;
import com.example.downloadmanager.Nodels.FileInfo;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import java.io.File;
import static java.lang.Integer.parseInt;


public class DownloadManager {


    @FXML
    private TableView<FileInfo> tableView;

    @FXML
    private TextField urlTextField;
    private int index = 0;

    @FXML
    void downloadButtonClicked(javafx.event.ActionEvent actionEvent) {

        String url = urlTextField.getText().trim();
        String filename = url.substring(url.lastIndexOf("/")+1);
        String status = "STARTING";
        String action ="OPEN";
        String path = AppConfig.DOWNLOAD_PATH + File.separator+filename;
        FileInfo file = new FileInfo((index+1)+" ",filename,url,status,action,path);
        this.index = this.index+1;
        DownloadThread thread = new DownloadThread(file,this);
        this.tableView.getItems().add(Integer.parseInt(file.getIndex().trim())-1,file);
        thread.start();
    }

    public void updateUI(FileInfo metaFile){
        System.out.println(metaFile);
        FileInfo fileInfo = this.tableView.getItems().get(Integer.parseInt(metaFile.getIndex().trim())-1);
        fileInfo.setStatus(metaFile.getStatus());
        this.tableView.refresh();
        System.out.println("_________________");

    }
    @FXML
    public void initialize(){
        System.out.println("View Initialized");
        TableColumn<FileInfo,String> sn = (TableColumn<FileInfo, String>) this.tableView.getColumns().get(0);
        sn.setCellValueFactory(p -> {
                 return p.getValue().indexProperty();
        });

        TableColumn<FileInfo,String> filename = (TableColumn<FileInfo, String>) this.tableView.getColumns().get(1);
        filename.setCellValueFactory(p -> {
            return p.getValue().nameProperty();
        });

        TableColumn<FileInfo,String> url= (TableColumn<FileInfo, String>) this.tableView.getColumns().get(2);
        url.setCellValueFactory(p -> {
            return p.getValue().urlProperty();
        });

        TableColumn<FileInfo,String> status = (TableColumn<FileInfo, String>) this.tableView.getColumns().get(3);
        status.setCellValueFactory(p -> {
            return p.getValue().statusProperty();
        });

        TableColumn<FileInfo,String> action = (TableColumn<FileInfo, String>) this.tableView.getColumns().get(4);
        action.setCellValueFactory(p -> {
            return p.getValue().statusProperty();
        });




    }
}
