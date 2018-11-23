package com.ziyata.allaboutpersija;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Context context;
    String[] namaPilihan, isiPilihan;
    int[] imgPersija;

    public Adapter(Context context, String[] namaPilihan, String[] isiPilihan, int[] imgPersija) {
        this.context = context;
        this.namaPilihan = namaPilihan;
        this.isiPilihan = isiPilihan;
        this.imgPersija = imgPersija;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_persija, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder viewHolder, int i) {
        viewHolder.txtListTitle.setText(namaPilihan[i]);
        Glide.with(context).load(imgPersija[i]).into(viewHolder.imglist);


    }

    @Override
    public int getItemCount() {
        return imgPersija.length;
     }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imglist;
        TextView txtListTitle;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imglist = itemView.findViewById(R.id.imgList);
            txtListTitle = itemView.findViewById(R.id.txtListTitle);
        }
    }
}

