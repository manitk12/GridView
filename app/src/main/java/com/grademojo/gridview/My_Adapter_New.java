package com.grademojo.gridview;

import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sapling_a0 on 3/8/17.
 */

public class My_Adapter_New extends RecyclerView.Adapter<My_Adapter_New.ViewHolder> {


    private List<Pojo_Class> value1;




    public class ViewHolder extends RecyclerView.ViewHolder{


        public TextView textView_Search;

        public ImageView image_Search;

        public View border_View ,border_View_first ,border_View_second;

        public View layout_view;


        public ViewHolder(View itemView) {

            super(itemView);


            layout_view =itemView;

            textView_Search = (TextView) itemView.findViewById(R.id.search1);

            image_Search = (ImageView) itemView.findViewById(R.id.image);

            border_View = itemView.findViewById(R.id.view_line);

            border_View_first = itemView.findViewById(R.id.view_line1);

            border_View_second = itemView.findViewById(R.id.view_line2);





        }
    }


    public My_Adapter_New(List<Pojo_Class> my_data)
    {

        value1 = my_data;

    }




    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.relative__background,parent,false);

        My_Adapter_New.ViewHolder viewHolder = new My_Adapter_New.ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {


        Pojo_Class item = value1.get(position);


        String text_Search = value1.get(position).getSearch_text();


        holder.image_Search.setBackgroundResource(item.getImage_icon());


        holder.textView_Search.setText(""+text_Search);


        holder.border_View.setBackgroundColor(ContextCompat.getColor(holder.layout_view.getContext(),item.getView_1()));

        holder.border_View_first.setBackgroundColor(ContextCompat.getColor(holder.layout_view.getContext(),item.getView_2()));

        holder.border_View_second.setBackgroundColor(ContextCompat.getColor(holder.layout_view.getContext(),item.getView_3()));

    }



    @Override
    public int getItemCount() {
        return value1.size();
    }

}
