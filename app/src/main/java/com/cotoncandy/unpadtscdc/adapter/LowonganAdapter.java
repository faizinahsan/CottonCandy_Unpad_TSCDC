package com.cotoncandy.unpadtscdc.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cotoncandy.unpadtscdc.R;
import com.cotoncandy.unpadtscdc.model.LowonganClass;

import java.util.ArrayList;

public class LowonganAdapter extends RecyclerView.Adapter<LowonganAdapter.LowonganViewHolder> {
    ArrayList<LowonganClass > lowonganClasses = new ArrayList<>();
    Context context;

    public LowonganAdapter(ArrayList<LowonganClass> lowonganClasses, Context context) {
        this.lowonganClasses = lowonganClasses;
        this.context = context;
    }

    @NonNull
    @Override
    public LowonganViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item,viewGroup,false);
        return new LowonganViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LowonganViewHolder lowonganViewHolder, int i) {
        LowonganClass lowongan = lowonganClasses.get(i);
        lowonganViewHolder.titleLowongan.setText(lowongan.getTitle());
        lowonganViewHolder.descLowongan.setText(lowongan.getDescription());
        lowonganViewHolder.idLowongan.setText(lowongan.getId_lowongan());
    }

    @Override
    public int getItemCount() {
        return lowonganClasses.size();
    }

    public class LowonganViewHolder extends RecyclerView.ViewHolder {
        TextView idLowongan, titleLowongan, descLowongan;

        public LowonganViewHolder(@NonNull View itemView) {
            super(itemView);
            idLowongan = itemView.findViewById(R.id.id_lowongan);
            titleLowongan = itemView.findViewById(R.id.title_lowongan);
            descLowongan = itemView.findViewById(R.id.deskripsi_lowongan);
        }
    }
}
