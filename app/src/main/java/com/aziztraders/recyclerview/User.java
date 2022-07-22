package com.aziztraders.recyclerview;

public class User {
    private int img;
    private String Text;

    public User(int img, String text) {
        this.img = img;
        Text = text;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }
}
