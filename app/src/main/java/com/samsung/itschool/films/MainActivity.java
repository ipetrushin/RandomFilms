package com.samsung.itschool.films;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] movies;
    TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTitle = (TextView) findViewById(R.id.title);
        // загружаем ресурсы
        Resources r = getResources();
        movies = r.getStringArray(R.array.movies);
    }

    public void nextClick(View v) {
        tvTitle.setText(movies[0]);
    }

    public void resetClick(View v) {

    }
}
