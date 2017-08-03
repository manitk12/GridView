package com.grademojo.gridview;

/**
 * Created by sapling_a0 on 3/8/17.
 */

public class Pojo_Class {

    private String search_text;

    private int image_icon;

    private int view_1;
    private int view_2;
    private int view_3;


    Pojo_Class(int ic, String s, int blue ,int v1 ,int v2) {
        this.image_icon= ic;
        this.search_text= s;
        this.view_1=blue;
        this.view_2 = v1;
        this.view_3= v2;


    }



    public String getSearch_text() {
        return search_text;
    }

    public int getImage_icon() {
        return image_icon;
    }

    public int getView_1() {
        return view_1;
    }

    public int getView_2() {
        return view_2;
    }

    public int getView_3() {
        return view_3;
    }

    public void setSearch_text(String search_text) {
        this.search_text = search_text;
    }

    public void setImage_icon(int image_icon) {
        this.image_icon = image_icon;
    }

    public void setView_1(int view_1) {
        this.view_1 = view_1;
    }

    public void setView_2(int view_2) {
        this.view_2 = view_2;
    }

    public void setView_3(int view_3) {
        this.view_3 = view_3;
    }




}
