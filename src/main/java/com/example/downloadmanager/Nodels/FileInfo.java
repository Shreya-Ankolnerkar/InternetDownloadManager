package com.example.downloadmanager.Nodels;

import com.example.downloadmanager.DownloadManager;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class FileInfo {

    private SimpleStringProperty index = new SimpleStringProperty();
    private SimpleStringProperty name = new SimpleStringProperty();
    private SimpleStringProperty url = new SimpleStringProperty();
    private SimpleStringProperty status = new SimpleStringProperty();
    private SimpleStringProperty action = new SimpleStringProperty();
    private SimpleStringProperty path = new SimpleStringProperty();

    //private DownloadManager downloadManagerController;

    public FileInfo(String index,String name,String url,String status,String action,String path){
        this.index.set(index);
        this.name.set(name);
        this.url.set(url);
        this.status.set(status);
        this.action.set(action);
        this.path.set(path);
    }

    public String getIndex(){
        return index.get();
    }
    public SimpleStringProperty indexProperty(){
        return index;
    }
    public void setIndex(String index){
        this.index.set(index);
    }

    public String getName(){
        return name.get();
    }
    public SimpleStringProperty nameProperty(){
        return name;
    }
    public void setName(String name){
        this.name.set(name);
    }

    public String getUrl(){
        return url.get();
    }
    public SimpleStringProperty urlProperty(){
        return url;
    }
    public void setUrl(String url){
        this.name.set(url);
    }

    public String getStatus(){
        return status.get();
    }
    public SimpleStringProperty statusProperty(){
        return status;
    }
    public void setStatus(String status){
        this.status.set(status);
    }

    public String getAction(){
        return name.get();
    }
    public SimpleStringProperty actionProperty(){
        return action;
    }
    public void setAction(String action){
        this.action.set(action);
    }

    public String getPath(){
        return path.get();
    }
    public SimpleStringProperty pathProperty(){
        return path;
    }
    public void setPath(String path){
        this.path.set(path);
    }



}