package com.example.retrofit;

import android.view.View;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class ArtistHolder extends RecyclerView.ViewHolder  {

    public CardView cardArtist;
    public TextView txtName;


    public ArtistHolder(View itemView) {
        super(itemView);
        cardArtist = (CardView) itemView.findViewById(R.id.cardArtist);
        txtName = (TextView) itemView.findViewById(R.id.txtName);

    }

}