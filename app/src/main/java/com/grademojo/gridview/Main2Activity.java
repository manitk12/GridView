package com.grademojo.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {


    public RecyclerView recyclerView;
    private Again_Adapter_new my_adapter_new;


    private List<Getter_Setter_2> getterSetter2s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view_first);

        getterSetter2s = new ArrayList<>();

        getterSetter2s.add(new Getter_Setter_2(R.drawable.ic_proged_outline_search_user_blue_64dp,
                "Rahul",
                R.color.grey,
                R.color.white,
                R.color.blue

                ));

        getterSetter2s.add(new Getter_Setter_2(R.drawable.ic_proged_outline_search_user_blue_64dp,
                "Deepak",
                R.color.blue,
                R.color.blue,
                R.color.blue

        ));


        getterSetter2s.add(new Getter_Setter_2(R.drawable.ic_proged_outline_search_user_blue_64dp,
                "Mani",
                R.color.light_blue,
                R.color.white,
                R.color.blue

        ));


        getterSetter2s.add(new Getter_Setter_2(R.drawable.ic_proged_outline_search_user_blue_64dp,
                "Gourav",
                R.color.yellow,
                R.color.blue,
                R.color.blue

        ));



        getterSetter2s.add(new Getter_Setter_2(R.drawable.ic_proged_outline_search_user_blue_64dp,
                "Raju",
                R.color.orange,
                R.color.white,
                R.color.blue

        ));

        my_adapter_new = new Again_Adapter_new(getterSetter2s);

        recyclerView.setAdapter(my_adapter_new);


        int Spans = 6;


        final GridLayoutManager gridLayoutManager = new GridLayoutManager(this,Spans);


        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {

                if (getterSetter2s.size() % 2==1)

                {

                    if (position == getterSetter2s.size() -1)

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
