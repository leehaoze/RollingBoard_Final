package com.jabil.scm.model;

import java.io.File;
import java.sql.ResultSet;

public class procedure {
    private int id;
    private String FilePath;
    private String title;
    private String picPath;
    private String description;
    private String Category_id;
    private String tag_id;
    private int number;

    public procedure(int id, String filePath, String title, String picPath, String description, String category_id, String tag_id, int number) {
        this.id = id;
        FilePath = filePath;
        this.title = title;
        this.picPath = picPath;
        this.description = description;
        Category_id = category_id;
        this.tag_id = tag_id;
        this.number = number;
    }
    public procedure(ResultSet resultSet){
        super();
        try{
            id = resultSet.getInt(1);
            FilePath = resultSet.getString(2);
            title = resultSet.getString(3);
            picPath = resultSet.getString(4);
            description = resultSet.getString(5);
            Category_id = resultSet.getString(6);
            tag_id = resultSet.getString(7);
            number = resultSet.getInt(8);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilePath() {
        return FilePath;
    }

    public void setFilePath(String filePath) {
        FilePath = filePath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory_id() {
        return Category_id;
    }

    public void setCategory_id(String category_id) {
        Category_id = category_id;
    }

    public String getTag_id() {
        return tag_id;
    }

    public void setTag_id(String tag_id) {
        this.tag_id = tag_id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}