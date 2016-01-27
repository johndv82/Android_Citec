package com.citec.asus.crecyclerview;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Asus on 24/01/2016.
 */
public class RecyclerAdap extends RecyclerView.Adapter<RecyclerAdap.ViewHolder> {

    List<Fotografia> foto;

    RecyclerAdap(List<Fotografia> foto){
        this.foto = foto;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        CardView cv;
        TextView nameAuthor;
        ImageView photo;

        ViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.recycler);
            nameAuthor = (TextView)itemView.findViewById(R.id.texto);
            photo = (ImageView)itemView.findViewById(R.id.imagen);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent, false);
        ViewHolder pvh = new ViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.nameAuthor.setText(foto.get(position).nombreAutor);
        holder.photo.setImageResource(foto.get(position).idFoto);
    }

    @Override
    public int getItemCount() {
        return foto.size();
    }
}
