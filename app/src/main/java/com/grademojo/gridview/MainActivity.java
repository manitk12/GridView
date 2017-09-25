package com.grademojo.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import static com.grademojo.gridview.R.id.icon;
import static com.grademojo.gridview.R.id.image;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;

    private My_Adapter m_Adapter;



    private List<Getter> input;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);



        input = new ArrayList<>();


        input.add(new Getter(
                R.drawable.ic_proged_outline_search_user_blue_64dp,
                "first ",
                R.color.blue,R.color.white,R.color.grey));

        input.add(new Getter(
                R.drawable.ic_proged_outline_search_user_blue_64dp,
                "Second",
                R.color.grey,R.color.grey,R.color.grey
        ));


        input.add(new Getter(
                R.drawable.ic_proged_outline_search_user_blue_64dp,
                "third",
                R.color.light_blue,R.color.white,R.color.grey
        ));


        input.add(new Getter(
                R.drawable.ic_proged_outline_search_user_blue_64dp,
                "fourth",
                R.color.yellow,R.color.grey,R.color.grey
        ));



        input.add(new Getter(
                R.drawable.ic_proged_outline_search_user_blue_64dp,
                "five",
                R.color.orange,R.color.white,R.color.grey
        ));


        input.add(new Getter(
                R.drawable.ic_proged_outline_search_user_blue_64dp,
                "six",
                R.color.orange,R.color.grey,R.color.grey
        ));


        input.add(new Getter(
                R.drawable.ic_proged_outline_search_user_blue_64dp,
                "seven",
                R.color.blue,R.color.white,R.color.white
        ));


        m_Adapter = new My_Adapter(input);
        recyclerView.setAdapter(m_Adapter);




        int maxSpansPerRow = 6;



        final GridLayoutManager gridview = new GridLayoutManager(this,maxSpansPerRow);

        gridview.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {


                if (input.size() % 2 == 1)

                {
                    if (position == input.size() - 1) {

                        return 6;

                    } else {

                        return 3;
                    }
                }
                else {

                    return 3;
                }


//                switch (position % 7) {
//                    // first three items span 3 columns each
//                    case 0:
//                    case 1:
//                    case 2:
//                    case 3:
//                    case 4:
//                    case 5:
//                        return 3;
//                    // next four items span 2 columns each
//
//
//                    case 6:
//                        return 6;
//                }
//                return position;
            }



        });

        recyclerView.setLayoutManager(gridview);
    }
}
