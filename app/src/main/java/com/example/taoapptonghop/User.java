package com.example.taoapptonghop;

public class User {
    private String name, diachi;
    private int imageId;

    public User(String name, String diachi, int imageId) {
        this.name = name;
        this.diachi = diachi;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
