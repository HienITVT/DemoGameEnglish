package com.example.demoenglishgame;

public class ModelGame {

    String texttospeech;
    int img1;
    int img2;
    int img3;
    int img4;


    public ModelGame(String texttospeech, int img1, int img2, int img3, int img4) {
        this.texttospeech = texttospeech;

        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;

    }

    public String getTexttospeech() {
        return texttospeech;
    }

    public void setTexttospeech(String texttospeech) {
        this.texttospeech = texttospeech;
    }


    public int getImg1() {
        return img1;
    }

    public void setImg1(int img1) {
        this.img1 = img1;
    }

    public int getImg2() {
        return img2;
    }

    public void setImg2(int img2) {
        this.img2 = img2;
    }

    public int getImg3() {
        return img3;
    }

    public void setImg3(int img3) {
        this.img3 = img3;
    }

    public int getImg4() {
        return img4;
    }

    public void setImg4(int img4) {
        this.img4 = img4;
    }



}
