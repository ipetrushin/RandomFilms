package com.samsung.itschool.films;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] movies;
    boolean [] shownMovies;
    TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTitle = (TextView) findViewById(R.id.title);
        // загружаем ресурсы
        Resources r = getResources();

        movies = r.getStringArray(R.array.movies);
        shownMovies = new boolean[movies.length];

    }

    public void nextClick(View v) {
        // выбрать случайный номер фильма
        int k = (int) (Math.random()*movies.length);
        // если фильм был показан, сгенерировать новое
        // случайное число, иначе отобразить название фильма
        // и отметь, что фильм показан
        // рекомендуется использовать цикл do-while

        // если фильмы закончились, выдать сообщение об этом
        // например, с помощью toast
        // http://developer.alexanderklimov.ru/android/toast.php
    }

    public void resetClick(View v) {
        // очистить или создать заново массив shownFilms
    }
}
