package com.grademojo.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {


    public RecyclerView recyclerView;
    private My_Adapter_New my_adapter_new;


    private List<Pojo_Class> pojo_classes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view_first);

        pojo_classes = new ArrayList<>();

        pojo_classes.add(new Pojo_Class(R.drawable.ic_proged_outline_search_user_blue_64dp,
                "Rahul",
                R.color.grey,
                R.color.white,
                R.color.blue

                ));

        pojo_classes.add(new Pojo_Class(R.drawable.ic_proged_outline_search_user_blue_64dp,
                "Deepak",
                R.color.blue,
                R.color.blue,
                R.color.blue

        ));


        pojo_classes.add(new Pojo_Class(R.drawable.ic_proged_outline_search_user_blue_64dp,
                "Mani",
                R.color.light_blue,
                R.color.white,
                R.color.blue

        ));


        pojo_classes.add(new Pojo_Class(R.drawable.ic_proged_outline_search_user_blue_64dp,
                "Gourav",
                R.color.yellow,
                R.color.blue,
                R.color.blue

        ));



        pojo_classes.add(new Pojo_Class(R.drawable.ic_proged_outline_search_user_blue_64dp,
                "Raju",
                R.color.orange,
                R.color.white,
                R.color.blue

        ));

        my_adapter_new = new My_Adapter_New(pojo_classes);

        recyclerView.setAdapter(my_adapter_new);


        int Spans = 6;


        final GridLayoutManager gridLayoutManager = new GridLayoutManager(this,Spans);


        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {

                if (pojo_classes.size() % 2==1)

                {

                    if (position == pojo_classes.size() -1)

                    {

                        return 6;


                    } else{

                    return 3;
                    }


                }

                else {


                    return 3;
                }

            }
        });


        recyclerView.setLayoutManager(gridLayoutManager);





    }
}
