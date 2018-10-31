package com.example.mishlahul.nbabasketballteams.adapter;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.mishlahul.nbabasketballteams.DetailActivity;
import com.example.mishlahul.nbabasketballteams.R;
import com.example.mishlahul.nbabasketballteams.model.MainModel;

import java.util.LinkedList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ListMenuViewHolder> {

    private Context context;
    private final LinkedList<MainModel>listTim;

    public MainAdapter(Context context, LinkedList<MainModel>listTim){
        this.context = context;
        this.listTim = listTim;
    }

    @Override
    public ListMenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_tim, null, false);

        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        mItemView.setLayoutParams(layoutParams);

        return new ListMenuViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(ListMenuViewHolder holder, int position) {
        final MainModel mCurrent = listTim.get(position);
        holder.namaTim.setText(mCurrent.getNamaTim());
        holder.kotaTim.setText(mCurrent.getKotaTim());
        holder.deskTim.setText(mCurrent.getDeskTim());
        holder.fotoTim.setImageResource(mCurrent.getFotoTim());
    }

    @Override
    public int getItemCount() {
        return listTim.size();
    }

    public class ListMenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView namaTim, kotaTim, deskTim;
        private ImageView fotoTim;
        private CardView cdView;

        final MainAdapter mainAdapter;
        public ListMenuViewHolder(View itemView, MainAdapter adapter){
            super(itemView);
            cdView = itemView.findViewById(R.id.detail);
            namaTim = itemView.findViewById(R.id.namaTim);
            kotaTim = itemView.findViewById(R.id.kotaTim);
            deskTim = itemView.findViewById(R.id.deskTim);
            fotoTim = itemView.findViewById(R.id.fotoTim);

            this.mainAdapter = adapter;
            cdView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view){
            int mPosition = getLayoutPosition();
            MainModel element = listTim.get(mPosition);

            Intent i = new Intent(context, DetailActivity.class);

            i.putExtra("Nama Tim",element.getNamaTim());
            i.putExtra("Kota Tim",element.getKotaTim());
            i.putExtra("Deskripsi Tim",element.getDeskTim());
            i.putExtra("Foto",element.getFotoTim());

            context.startActivity(i);
            mainAdapter.notifyDataSetChanged();
        }
    }
}
