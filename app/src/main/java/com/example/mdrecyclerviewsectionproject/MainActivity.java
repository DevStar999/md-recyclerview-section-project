package com.example.mdrecyclerviewsectionproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private RecyclerView recyclerView;

    private void initialise() {
        toolbar = findViewById(R.id.tool_bar);
        recyclerView = findViewById(R.id.recycler_view);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialise();
        setSupportActionBar(toolbar);

        List<User> sampleUsers = new ArrayList<User>() {{
            add(new User("User 01", "This is the description of User 01", R.drawable.img01));
            add(new User("User 02", "This is the description of User 02", R.drawable.img02));
            add(new User("User 03", "This is the description of User 03", R.drawable.img03));
            add(new User("User 04", "This is the description of User 04", R.drawable.img04));
            add(new User("User 05", "This is the description of User 05", R.drawable.img05));
            add(new User("User 06", "This is the description of User 06", R.drawable.img06));
            add(new User("User 07", "This is the description of User 07", R.drawable.img07));
            add(new User("User 08", "This is the description of User 08", R.drawable.img08));
            add(new User("User 09", "This is the description of User 09", R.drawable.img09));
            add(new User("User 10", "This is the description of User 10", R.drawable.img10));
            add(new User("User 11", "This is the description of User 11", R.drawable.img11));
        }};

        // Here we are setting the Layout Manager to the RecyclerView that of LinearLayoutManager.
        /*
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        */

        // Now, let us set a different Layout Manager to the RecyclerView for e.g. GridLayoutManager.
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);

        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new RecyclerAdapter(sampleUsers, getApplicationContext()));
    }
}