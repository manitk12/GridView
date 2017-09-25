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
 * Created by sapling_a0 on 4/8/17.
 */

public class Again_Adapter_new extends RecyclerView.Adapter<Again_Adapter_new.ViewHolder> {


    private List<Getter_Setter_2> values2;

    public  class ViewHolder extends RecyclerView.ViewHolder{

        public TextView text_Search;

        public ImageView image_View_Search;

        public View view_Line_1 ,view_LIne_2 ,view_Line_3;


        public View layout_View;



        public ViewHolder(View itemView) {


            super(itemView);

            layout_View = itemView;

            text_Search = (TextView) itemView.findViewById(R.id.search1);

            image_View_Search = (ImageView) itemView.findViewById(R.id.image);

            view_Line_1 = itemView.findViewById(R.id.view_line);

            view_LIne_2 = itemView.findViewById(R.id.view_line1);

            view_Line_3 = itemView.findViewById(R.id.view_line2);



        }
    }


    public Again_Adapter_new(List<Getter_Setter_2> mydata){

        values2 = mydata;




    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.relative_background,parent,false);

        Again_Adapter_new.ViewHolder viewHolder = new Again_Adapter_new.ViewHolder(view);



        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {



        Getter_Setter_2 item_1 = values2.get(position);

        String text_searching = values2.get(position).getSearch_1();


        holder.image_View_Search.setImageResource(item_1.getImage_icon_2());

        holder.text_Search.setText(""+text_searching);

        holder.view_Line_1.setBackgroundColor(ContextCompat.getColor(holder.layout_View.getContext(), item_1.getView_border_1()));

        holder.view_LIne_2.setBackgroundColor(ContextCompat.getColor(holder.layout_View.getContext(),item_1.getView_border_2()));

        holder.view_Line_3.setBackgroundColor(ContextCompat.getColor(holder.layout_View.getContext(), item_1.getView_border_3()));







    }

    @Override
    public int getItemCount() {
        return values2.size();
    }


}
