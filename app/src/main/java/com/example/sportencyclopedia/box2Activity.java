package com.example.sportencyclopedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class box2Activity extends AppCompatActivity {

    private TextView text;
    private ImageButton strelka2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_box2);

        strelka2 = findViewById(R.id.strelka2);
        strelka2.setOnClickListener(listener);

        TextView text = (TextView)findViewById(R.id.text);
        text.setText("Майк Тайсон\n" +
                "При рождении он получил имя Майкл Джерард, стал известен миру под именем Майк Тайсон. А сейчас его имя — Малик Абдул Азиз. Этот спортсмен одержал множество побед, он выигрывал во многих спорных боях и чемпионатах тяжеловесов.\n" +
                "Он — самый молодой боец, который стал чемпионом в тяжелом весе. Ему было всего 20 лет, когда он выиграл этот титул и был объявлен самым молодым боксером по версии IBF, WBA и WBC.Тайсон также известен в боксерском мире благодаря его невероятной скорости движения по рингу. Возможно, его вклад в историю мирового бокса недооценен, но, согласно нашему списку, он в тройке самых талантливых боксеров в истории. В его карьере было 5-6 славных лет, когда он побеждал почти каждого боксера на ринге. Возможно," +
                " ему надо было закончить карьеру чуть раньше, чтобы не омрачить свою репутацию некоторыми скандальными поражениями.\n" +
                "\n" +
                "Мохаммед Али\n" +
                "Мохаммед Али — не только лучший боксер в истории, но и великий человек." +
                " Его настоящее имя — Кассиус Марцелл Клей-младший. Когда он принял Ислам, он сменил свое имя на Мохаммед Али. Он был не только физически сильным, но и сильным духовно. Ему было всего 12 лет, когда он начал заниматься боксом, а в возрасте 18 лет он получил свою первую золотую медаль, которая была действительно большим достижением для боксера в таком молодом возрасте.В то время он занимался любительским боксом, а в 1960 году, когда одержал победу над Тунни Хунсакером, он начал свой путь в профессиональном боксе. Это была великолепная победа после 6 раундов. Противник был тоже отличным боксером, но Али отличался от него тем, что, используя жестокие атаки," +
                " он всегда опирался на хладнокровный расчет, чтобы сбить своего противника. А еще Мохаммед Али — автор множества цитат о жизни, спорте и предназначении человека.\n" +
                "\n" +
                "Мэнни Пакьяо\n" +
                "Мэнни — еще один величайший спортсмен современности. WBC, WBO и Боксерская Ассоциация Америки объявила Мэнни Пакьяо «бойцом десятилетия». Он стал чемпионом в восьми! категориях, а в пяти категориях — он единственный линейный пятикратный чемпион.Мэнни, действительно, отличный боксер — несколько раз Ассоциация журналистов, освещающих бокс, выбирала его «Боксером года»." +
                " Мэнни был настолько ожесточенно и мощно проводил боксерские атаки, что Флойд Мейвезер даже отказывался от боев с Мэнни, боясь своего поражения. Пакьяо не только один из лучших боксеров мира, но и большой политик — в настоящее время он работает сенатором на Филиппинах, в стране, где он родился.\n" +
                "\n" +
                "Джо Луис\n" +
                "В боксерском мире Джо был известен как Браун-бомбардир. Журнал «Ринг» присудил ему первое место в списке 100 лучших боксеров-панчеров всех времен. Он родился в 1914 году и умер в 1981-м, пережил как золотую эпоху бокса, так и Вторую мировую войну." +
                "Когда он начал свою карьеру в профессиональном боксе, он был известен как первый афроамериканец, которому удалось добиться подобного успеха на боксерском ринге. Поражает еще одно его достижение — титул чемпиона мира по тяжелом весе оставался у него с 1937 по 1949 год, и это действительно удивительно. Поэтому он, без сомнения, один из десяти лучших боксеров на свете.");


    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent = new Intent(getApplicationContext(),boxActivity.class);
            startActivity(intent);
        }
    };
}