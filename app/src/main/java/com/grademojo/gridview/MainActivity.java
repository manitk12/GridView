package com.grademojo.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;

    private My_Adapter m_Adapter;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);





        List<Getter> input = new ArrayList<>();

        for (int i = 0; i < 15; i++) {


            Getter getter_getter = new Getter();







            getter_getter.setClass2("morning"+i);




            input.add(getter_getter);
        }



        m_Adapter = new My_Adapter(input);






        recyclerView.setAdapter(m_Adapter);


        int maxSpansPerRow = 6;

        



        GridLayoutManager gridview = new GridLayoutManager(this,maxSpansPerRow);

        gridview.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return 2;
            }
        });

        recyclerView.setLayoutManager(gridview);


    }
}

