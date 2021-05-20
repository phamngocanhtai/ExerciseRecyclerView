package com.example.exerciserecyclerview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements UserAdapter.OnItemClickListener {
    RecyclerView recyclerView;
    ArrayList<User> arrayList;
    UserAdapter userAdapter;
    Button btnInsert, btnRemove, btnEmpty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList = User.getMockData();

        userAdapter = new UserAdapter(MainActivity.this, arrayList, MainActivity.this);

        recyclerView = findViewById(R.id.layout_linear);
        recyclerView.setAdapter(userAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        btnInsert = findViewById(R.id.btnInsert);
        btnRemove = findViewById(R.id.btnRemove);
        btnEmpty = findViewById(R.id.btnEmpty);

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User("LLLL", "1010...");
                arrayList.add(0, user);
                userAdapter.notifyItemInserted(0);
            }
        });

        btnRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User("LLLL", "1010...");
                arrayList.remove(user);
                arrayList.remove(0);
                userAdapter.notifyItemRemoved(0);
            }
        });

        btnEmpty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayList.clear();
                userAdapter.notifyDataSetChanged();
            }
        });
    }

    @Override
    public void setOnUserClick(User user) {
        Toast.makeText(this, user.name, Toast.LENGTH_SHORT).show();
    }
}