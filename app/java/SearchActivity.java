package com.example.administrator.movieonline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SearchActivity extends AppCompatActivity {
    private List<Movie> MovieList = new ArrayList<Movie>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        EditText key_word = (EditText) findViewById(R.id.key_word);

        initMovie();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.search_item);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(layoutManager);
        MovieAdapter adapter = new MovieAdapter(MovieList);
        recyclerView.setAdapter(adapter);
    }

    private void initMovie(){
        Date date = new Date();
        for (int i = 0; i < 4; i++) {
            Movie the_movie = new Movie(1, "The Shawshank Redemption", "An impressive story", 1, "Frank Darabont", "Tim Robbins", 142, date);
            MovieList.add(the_movie);
        }
    }
}
