package com.example.sportencyclopedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SecondActivity extends AppCompatActivity {

    private ImageButton box;
    private ImageButton basketball;
    private ImageButton volleyball;
    private ImageButton hokkei;
    private ImageButton tennis;
    private ImageButton swimming;
    private ImageButton football;
    private ImageButton baseball;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        box = findViewById(R.id.box);
        basketball = findViewById(R.id.basketball);
        volleyball = findViewById(R.id.volleyball);
        hokkei = findViewById(R.id.hokkei);
        tennis = findViewById(R.id.tennis);
        swimming = findViewById(R.id.swimming);
        football = findViewById(R.id.football);
        baseball = findViewById(R.id.baseball);

        baseball.setOnClickListener(listener);
        box.setOnClickListener(listener);
        basketball.setOnClickListener(listener);
        volleyball.setOnClickListener(listener);
        tennis.setOnClickListener(listener);
        swimming.setOnClickListener(listener);
        football.setOnClickListener(listener);
        hokkei.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.box:
                    Intent intent = new Intent(getApplicationContext(),boxActivity.class);
                    startActivity(intent);
                    break;
                case R.id.basketball:
                    intent = new Intent(getApplicationContext(),basketballActivity.class);
                    startActivity(intent);
                    break;
                case R.id.baseball:
                    intent = new Intent(getApplicationContext(),baseballActivity.class);
                    startActivity(intent);
                    break;
                case R.id.tennis:
                    intent = new Intent(getApplicationContext(),tennisActivity.class);
                    startActivity(intent);
                    break;
                case R.id.volleyball:
                    intent = new Intent(getApplicationContext(),volleyballActivity.class);
                    startActivity(intent);
                    break;
                case R.id.football:
                    intent = new Intent(getApplicationContext(),footballActivity.class);
                    startActivity(intent);
                    break;
                case R.id.hokkei:
                    intent = new Intent(getApplicationContext(), hokkeiActivity.class);
                    startActivity(intent);
                    break;
                case R.id.swimming:
                    intent = new Intent(getApplicationContext(), swimmingActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    };
}