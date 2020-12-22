package com.example.lap_app_passio;

public class RCV_View {
   private   String text1;
   private String text2;
   private int anh;

    public RCV_View(String text1, String text2, int anh) {
        this.text1 = text1;
        this.text2 = text2;
        this.anh = anh;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }
}
