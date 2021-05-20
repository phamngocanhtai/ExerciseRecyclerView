package com.example.exerciserecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LogosAdapter extends RecyclerView.Adapter<LogosAdapter.LogosVH> {

    Context context;
    ArrayList<Logos> arrayList;
    OnItemClickListener onItemClickListener;

    public LogosAdapter(Context context, ArrayList<Logos> arrayList, OnItemClickListener onItemClickListener) {
        this.context = context;
        this.arrayList = arrayList;
        this.onItemClickListener = onItemClickListener;
    }

    interface OnItemClickListener {
        void setOnUserClick(User user);
    }

    @NonNull
    @Override
    public LogosVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View convertView = layoutInflater.inflate(R.layout.item_grid, parent, false);

        LogosVH logosVH = new LogosVH(convertView);
        return logosVH;
    }

    @Override
    public void onBindViewHolder(@NonNull LogosAdapter.LogosVH holder, int position) {

        Logos logos = arrayList.get(position);
        holder.txtName.setText(logos.name);
        holder.txtDes.setText(logos.des);
        holder.imgIcon.setImageResource(logos.icon);
    }

    @Override
    public int getItemCount() {

        return arrayList.size();
    }

    public static class LogosVH extends RecyclerView.ViewHolder {

        TextView txtName;
        TextView txtDes;
        ImageView imgIcon;

        public LogosVH(@NonNull View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txtName);
            txtDes = itemView.findViewById(R.id.txtDes);
            imgIcon = itemView.findViewById(R.id.imgLogo);
        }
    }
}
