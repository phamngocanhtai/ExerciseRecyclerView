package com.example.exerciserecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserVH> {
    Context context;
    ArrayList<User> arrayList;
    OnItemClickListener onItemClickListener;

    public UserAdapter(Context context, ArrayList<User> arrayList, OnItemClickListener onItemClickListener) {
        this.context = context;
        this.arrayList = arrayList;
        this.onItemClickListener = onItemClickListener;
    }

    interface OnItemClickListener {
        void setOnUserClick (User user);
    }

    @NonNull
    @Override
    public UserVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View convertView = layoutInflater.inflate(R.layout.linear_item, parent, false);

        UserVH userVH = new UserVH(convertView);
        return userVH;
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.UserVH holder, int position) {

        User users = arrayList.get(position);
        holder.txtName.setText(users.name);
        holder.txtPhone.setText(users.phone);

        switch (users.avatar)
        {
            case 0: holder.imgAvatar.setImageResource(R.drawable.icon_female); break;
            case 1: holder.imgAvatar.setImageResource(R.drawable.icon_female1); break;
            case 2: holder.imgAvatar.setImageResource(R.drawable.icon_female2); break;
            case 3: holder.imgAvatar.setImageResource(R.drawable.icon_male); break;
            case 4: holder.imgAvatar.setImageResource(R.drawable.icon_male1); break;
            case 5: holder.imgAvatar.setImageResource(R.drawable.icon_male2); break;
            case 6: holder.imgAvatar.setImageResource(R.drawable.icon_person); break;
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickListener.setOnUserClick(users);
            }
        });

        holder.txtName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, users.name, Toast.LENGTH_SHORT).show();
            }
        });

        holder.txtPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, users.phone, Toast.LENGTH_SHORT).show();
            }
        });

        holder.imgCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, users.phone, Toast.LENGTH_SHORT).show();
            }
        });

        holder.imgMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, users.name, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {

        return arrayList.size();
    }

    static class UserVH extends RecyclerView.ViewHolder {

        TextView txtName;
        TextView txtPhone;
        ImageView imgAvatar;
        ImageView imgCall;
        ImageView imgMessage;

        public UserVH(@NonNull View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txtName);
            txtPhone = itemView.findViewById(R.id.txtPhone);
            imgAvatar = itemView.findViewById(R.id.imgAvatar);
            imgCall = itemView.findViewById(R.id.imgCall);
            imgMessage = itemView.findViewById(R.id.imgMessage);
        }
    }
}
