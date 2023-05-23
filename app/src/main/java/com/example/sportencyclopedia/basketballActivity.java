package com.example.sportencyclopedia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class basketballActivity extends AppCompatActivity {

    private TextView text;
    private ImageButton basketball1;
    private ImageButton basketball2;
    private ImageButton strelka1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball);

        basketball1 = findViewById(R.id.basketball1);
        basketball2 = findViewById(R.id.basketball2);
        strelka1 = findViewById(R.id.strelka1);

    TextView text = (TextView)findViewById(R.id.text);
        text.setText("Баскетбо́л (англ. basket «корзина» + ball «мяч») — спортивная командная игра с мячом, в которой мяч забрасывают руками в кольцо соперника.\n" +
                "\n" +
                "В баскетбол играют две команды, каждая из которых состоит из пяти полевых игроков (замены не ограничены). Цель каждой команды — забросить мяч в кольцо с сеткой (корзину) соперника и помешать другой команде завладеть мячом и забросить его в свою корзину. Корзина находится на высоте 3,05 м от паркета (10 футов). За мяч, заброшенный с ближней и средней дистанций, засчитывается два очка, с дальней (из-за трёхочковой линии) — три очка; штрафной бросок оценивается в одно очко. Стандартный размер баскетбольной площадки — 28 м в длину и 15 м — в ширину. Баскетбол — один из самых популярных видов спорта в мире[1].\n" +
                "\n" +
                "Баскетбол входит в программу Олимпийских игр с 1936 года (изобретатель игры Джеймс Нейсмит был там в качестве гостя). Регулярные чемпионаты мира по баскетболу среди мужчин проводятся с 1950 года, среди женщин — с 1953 года, а чемпионаты Европы — с 1935 года.\n" +
                "\n" +
                "В Европе проводятся международные клубные соревнования по баскетболу: Евролига, Еврокубок, Кубок вызова ФИБА.\n" +
                "\n" +
                "Наибольшего развития эта игра достигла в США: чемпионат Национальной баскетбольной ассоциации (НБА) более 50 лет является сильнейшим национальным клубным турниром в мире. Баскетбол считается национальным видом спорта в Литве.       ");

        basketball1.setOnClickListener(listener);
        basketball2.setOnClickListener(listener);
        strelka1.setOnClickListener(listener);
    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.basketball1:
                    Intent intent = new Intent(getApplicationContext(), basketball1Activity.class);
                    startActivity(intent);
                    break;
                case R.id.basketball2:
                    intent = new Intent(getApplicationContext(), basketball2Activity.class);
                    startActivity(intent);
                    break;
                case R.id.strelka1:
                    intent = new Intent(getApplicationContext(), SecondActivity.class);
                    startActivity(intent);
                    break;
          }
        }
    };
}