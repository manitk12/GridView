package com.grademojo.gridview;

import android.widget.ImageView;

/**
 * Created by sapling_a0 on 28/7/17.
 */

public class Getter {


    private String search;

    private int image_icon;

    Getter(int ic_proged_outline_search_user_blue_64dp, String s, int blue) {
    }

    public void setView1(int view1) {
        this.view1 = view1;
    }

    public int getView1() {
        return view1;
    }

    private int view1;

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



























}
