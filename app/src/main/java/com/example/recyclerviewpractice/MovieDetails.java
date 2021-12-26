package com.example.recyclerviewpractice;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class MovieDetails extends AppCompatActivity {

    private ImageView movieCover, moviePhoto;
    private TextView movieTitle, movieDetail;
    private RatingBar ratingBarDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);

        //initCollapsingToolbar();

        moviePhoto = findViewById(R.id.moviePhoto);
        movieCover = findViewById(R.id.movieCover);
        movieTitle = findViewById(R.id.title);
        ///ratingBarDetails = findViewById(R.id.ratingBar);
        movieDetail = findViewById(R.id.overview);

        Intent startedActivityIntent = getIntent();
        if(startedActivityIntent.hasExtra("original_title")) {
            String movieThumbnail = getIntent().getExtras().getString("poster_path");
            String movieName = getIntent().getExtras().getString("original_title");
            String movieOverview = getIntent().getExtras().getString("overview");
            String rating = getIntent().getExtras().getString("vote_average");
            String dateOfRelease = getIntent().getExtras().getString("release_date");

            /*Glide.with(MainActivity.this)
                    .load("https://image.tmdb.org/t/p/w500"+movieList.get(position).getPosterPath())
                    .into(holder.flag);*/

            Glide.with(this)
                    .load(movieThumbnail)
                    .placeholder(R.drawable.load).into(moviePhoto);

            movieTitle.setText(movieName);
            movieDetail.setText(movieOverview);
            // userrating
           // dateOfRelease.set
        } else {
            Toast.makeText(this, "No Api data", Toast.LENGTH_SHORT).show();
        }
    }
/*
    private void initCollapsingToolbar() {
        final CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.)
    }*/
}