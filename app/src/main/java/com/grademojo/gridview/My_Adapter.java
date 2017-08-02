package com.grademojo.gridview;

import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class My_Adapter extends RecyclerView.Adapter<My_Adapter.ViewHolder> {


    private List<Getter> values;




    public class ViewHolder extends RecyclerView.ViewHolder{

        

        public TextView text_search;

        public ImageView imageView_search;

        public View view_Line ,view_Line1 ,view_Line2;



        public View layout;



        public ViewHolder(View itemView) {

            super(itemView);

            layout = itemView;

            text_search = (TextView) itemView.findViewById(R.id.search1);

            imageView_search = (ImageView) itemView.findViewById(R.id.image);

            view_Line = itemView.findViewById(R.id.view_line);

            view_Line1 = itemView.findViewById(R.id.view_line1);

            view_Line2 = itemView.findViewById(R.id.view_line2);






        }
    }




    public My_Adapter(List<Getter> mydataset){

        values = mydataset;
    }


    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.relative_background,parent,false);

        My_Adapter.ViewHolder viewHolder = new My_Adapter.ViewHolder(view);

        return viewHolder;
    }


    public void onBindViewHolder(ViewHolder holder, final int position) {

        Getter item = values.get(position);


        String text_serach = values.get(position).getSearch();




        holder.imageView_search.setImageResource(
                item.getImage_icon()
        );

     //  holder.text_search.setText(""+item.getSearch());

        holder.text_search.setText(""+text_serach);



     holder.view_Line.setBackgroundColor(
             ContextCompat.getColor(holder.layout.getContext(), item.getView1())
     );

        holder.view_Line1.setBackgroundColor(ContextCompat.getColor(holder.layout.getContext(), item.getView2()));

        holder.view_Line2.setBackgroundColor(ContextCompat.getColor(holder.layout.getContext(), item.getView3()));




    }


    public int getItemCount() {

        return values.size();
    }





//    public void remove(int position){
//
//        values.remove(position);
//        notifyItemRemoved(position);
//
//    }
}

