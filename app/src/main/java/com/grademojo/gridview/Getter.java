package com.grademojo.gridview;

import android.widget.ImageView;

/**
 * Created by sapling_a0 on 28/7/17.
 */

public class Getter {


    private String search;

    private int image_icon;

    private int view1;
    private int view2;

    private int view3;

    public int getView2() {
        return view2;
    }

    public void setView2(int view2) {
        this.view2 = view2;
    }

    public int getView3() {
        return view3;
    }

    public void setView3(int view3) {
        this.view3 = view3;
    }

    public void setView1(int view1) {
        this.view1 = view1;
    }

    public int getView1() {
        return view1;
    }


    public int getImage_icon() {
        return image_icon;
    }


    public String getSearch() {

        return search;
    }


    public void setImage_icon(int image_icon) {
        this.image_icon = image_icon;
    }




    public void setSearch(String search) {

        this.search = search;
    }





    Getter(int ic, String s, int blue ,int v1 ,int v2) {
        this.image_icon= ic;
        this.search= s;
        this.view1=blue;
        this.view2 = v1;
        this.view3 = v2;


    }




























}
