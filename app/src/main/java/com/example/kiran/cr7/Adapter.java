package com.example.kiran.cr7;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    private RecyclerView mRecyclerView;
    private Context context;
    private ArrayList<Item> itemlist;
    OnCardClickListner onCardClickListner;


    public Adapter(Context context, ArrayList<Item> itemlist){
        this.context = context;
        this.itemlist = itemlist;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);


        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycle_view);
        ViewHolder viewholder = new ViewHolder(view);
        return viewholder;

    }

    //bind views with data
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final Item item = itemlist.get(position);

        //get element form your dataset at this position
        //replace the contents of the view with that element
        Picasso.with(context)
                .load(item.img)
                .placeholder(R.drawable.fern)
                .error(android.R.drawable.stat_notify_error)
                .into(holder.cardimage);
//        holder.cardtext.setText(item.text);

        holder.card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onCardClickListner.OnCardClicked(v,position);
                Intent in = new Intent(context,Test.class);
                in.putExtra("item",item);
                in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(in);
            }
        });

    }

    @Override
    public int getItemCount() {
        if(itemlist != null){
            return itemlist.size();
        }
        return 0;
    }

    //provide the reference to the views for each data item
    //ViewHolder class
    //since it is static it uses only single memory so protect memory leak  : a design pattern for android
    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public CardView card_view;
        public TextView cardtext;
        public ImageView cardimage;

        //connects which view belongs to which layout
        public ViewHolder(View itemView) {
            super(itemView);
            card_view = (CardView)itemView.findViewById(R.id.card_view);
            //cardtext = (TextView)itemView.findViewById(R.id.cardtext);
            cardimage = (ImageView)itemView.findViewById(R.id.cardimage);
        }

        @Override
        public void onClick(View view) {

        }
    }
    public interface OnCardClickListner {
        void OnCardClicked(View view, int position);
    }

    public void setOnCardClickListner(OnCardClickListner onCardClickListner) {
        this.onCardClickListner = onCardClickListner;
    }
}



































































