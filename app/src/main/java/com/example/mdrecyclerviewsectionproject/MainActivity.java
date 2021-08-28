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
            add(new User("User 1", "This is the description of User 1", R.drawable.img1));
            add(new User("User 2", "This is the description of User 2", R.drawable.img2));
            add(new User("User 3", "This is the description of User 3", R.drawable.img3));
            add(new User("User 4", "This is the description of User 4", R.drawable.img4));
            add(new User("User 5", "This is the description of User 5", R.drawable.img5));
            add(new User("User 6", "This is the description of User 6", R.drawable.img6));
            add(new User("User 7", "This is the description of User 7", R.drawable.img7));
            add(new User("User 8", "This is the description of User 8", R.drawable.img8));
            add(new User("User 9", "This is the description of User 9", R.drawable.img9));
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