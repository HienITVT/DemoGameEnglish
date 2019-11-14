package com.example.demoenglishgame;

public class ListGame {
    private int Imglist;
    private String Tengame;


    public ListGame() {
    }

    public int getImglist() {
        return Imglist;
    }

    public void setImglist(int imglist) {
        Imglist = imglist;
    }

    public String getTengame() {
        return Tengame;
    }

    public void setTengame(String tengame) {
        Tengame = tengame;
    }

    public ListGame(int imglist, String tengame){
        this.Imglist= imglist;
        this.Tengame = tengame;

    }
}
