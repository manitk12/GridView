package com.grademojo.gridview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class My_Adapter extends RecyclerView.Adapter<My_Adapter.ViewHolder> {


    private List<Getter> values;




    public class ViewHolder extends RecyclerView.ViewHolder{

        

        public TextView text_Name;



        public View layout;



        public ViewHolder(View itemView) {

            super(itemView);

            layout = itemView;

            text_Name = (TextView) itemView.findViewById(R.id.text_name);




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

        final String class2= values.get(position).getClass2();







        // Information current=data.get(position);
        //   holder.title.setText(current.title);

        // holder.title.setText(current.title);


        //Integer.parseInt(view.getTag().toString())

        holder.text_Name.setText(" " +class2);





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

