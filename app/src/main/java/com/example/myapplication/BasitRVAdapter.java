package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BasitRVAdapter extends RecyclerView.Adapter<BasitRVAdapter.CardViewTasarimNesneleriniTutucu>{
    private Context mContext;
    private List<String> ulkelerDısarıdanGelenList;

    public BasitRVAdapter(Context mContext, List<String> ulkelerDısarıdanGelenList) {

        this.mContext = mContext;
        this.ulkelerDısarıdanGelenList = ulkelerDısarıdanGelenList;
    }

    public class CardViewTasarimNesneleriniTutucu extends RecyclerView.ViewHolder {
        public TextView satirYazi;
        public CardView satirCardView;

        public CardViewTasarimNesneleriniTutucu (View View){
            super(View);
            satirYazi = itemView.findViewById(R.id.satirYazi);
            satirCardView = itemView.findViewById(R.id.satirCardView);
        }
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public CardViewTasarimNesneleriniTutucu onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_tasarim, parent,false);

        return new CardViewTasarimNesneleriniTutucu(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull BasitRVAdapter.CardViewTasarimNesneleriniTutucu holder, int position) {
        final String ulke = ulkelerDısarıdanGelenList.get(position);
        holder.satirYazi.setText(ulke);

        holder.satirCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "Seçilen Ülke : " + ulke, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return ulkelerDısarıdanGelenList.size();
    }


}
