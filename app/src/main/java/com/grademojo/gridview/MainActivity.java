package com.grademojo.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import static com.grademojo.gridview.R.id.icon;
import static com.grademojo.gridview.R.id.image;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;

    private My_Adapter m_Adapter;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);





        List<Getter> input = new ArrayList<>();


        input.add(new Getter(R.drawable.ic_proged_outline_search_user_blue_64dp,"Add ",R.color.blue));

        input.add(new Getter(
            R.drawable.ic_proged_outline_search_user_blue_64dp,
                "Add record",
                R.color.grey
        ));


        input.add(new Getter(
                R.drawable.ic_proged_outline_search_user_blue_64dp,
                "Add record",
                R.color.light_blue
        ));


        input.add(new Getter(
                R.drawable.ic_proged_outline_search_user_blue_64dp,
                "Add record",
                R.color.yellow
        ));



        input.add(new Getter(
                R.drawable.ic_proged_outline_search_user_blue_64dp,
                "Add record",
                R.color.orange
        ));


        input.add(new Getter(
                R.drawable.ic_proged_outline_search_user_blue_64dp,
                "Add record",
                R.color.cardview_shadow_end_color
        ));


        input.add(new Getter(
                R.drawable.ic_proged_outline_search_user_blue_64dp,
                "Add record",
                R.color.blue
        ));





//
//        for (int i = 0; i < 7; i++) {
//
//
//            Getter getter_getter = new Getter();
//
//
//
//            getter_getter.setSearch("SEARCH\\nSTUDENT"+i);
//            getter_getter.setImage_icon(R.drawable.ic_proged_outline_search_user_blue_64dp);
//            getter_getter.setView1(R.drawable.xml_blue_bg);
//
//
//
//
//
//
//
//            input.add(getter_getter);
//        }

        m_Adapter = new My_Adapter(input);
        recyclerView.setAdapter(m_Adapter);

        int maxSpansPerRow = 6;


        GridLayoutManager gridview = new GridLayoutManager(this,maxSpansPerRow);

        gridview.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return 3;
            }
        });

        recyclerView.setLayoutManager(gridview);
    }
}
