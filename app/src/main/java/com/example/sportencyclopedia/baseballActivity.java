package com.example.sportencyclopedia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class baseballActivity extends AppCompatActivity {

    private TextView text;
    private ImageButton baseball1;
    private ImageButton baseball2;
    private ImageButton strelka1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baseball);

        baseball1 = findViewById(R.id.baseball1);
        baseball2 = findViewById(R.id.baseball2);
        strelka1 = findViewById(R.id.strelka1);

        TextView text = (TextView)findViewById(R.id.text);
        text.setText("Бейсбо́л (англ. baseball, от base — «база, основание» и ball — «мяч») — командная спортивная игра с бейсбольным мячом и битой. В состязаниях участвуют две команды по девять игроков каждая.\n" +
                "\n" +
                "Бейсбол наиболее популярен на Кубе, в США, в Венесуэле, в Японии, Китае и Южной Корее. В США, Японии, Чехии и других странах распространён также софтбол — упрощённый вариант бейсбола — игра, которую можно проводить в помещении и на небольших полях. На данный момент в бейсбол играют более чем в 120 странах мира.\n" +
                "\n" +
                "К родственным бейсболу видам спорта относятся крикет в Англии, песапалло в Финляндии, ойна в Румынии, лапта в России и чилик-дангал в Таджикистане.Эволюция старинных игр с битой и мячом в бейсбол прослеживается с трудом. Французский манускрипт 1344 года содержит иллюстрацию, на которой изображены священники, играющие в некую игру — предположительно, «la soule» — во многом похожую на бейсбол. Другие старые французские игры, такие как «thèque», «la balle au bâton» и «la balle empoisonnée», также имеют некоторое сходство с бейсболом. Принято считать, что современный бейсбол есть североамериканское развитие более старой английской лапты, популярной в Великобритании и Ирландии.\n" +
                "\n" +
                "В американских газетах начала XIX века упоминались игры под названиями «бейсбол» (англ. Base-Ball), «базовый мяч» или «основной мяч» (англ. Bass-Ball, Base Ball), «база» (англ. Base), «голбол» (англ. Goalball), «городской мяч» (англ. Town Ball). В 1829 году в США вышла «Собственная книга мальчика» (англ. The Boy's Own Book), которая считается первым известным печатным упоминанием об игре, напоминающей бейсбол.\n" +
                "\n" +
                "Долгое время автором правил бейсбола считался Эбнер Даблдей из американского городка Куперстаун[en]. Однако сейчас оспаривается даже факт проживания человека с такой фамилией в Куперстауне. В 1845 году житель Нью-Йорка Александр Картрайт разработал правила игры в бейсбол, которые вскоре были приняты всеми бейсбольными клубами города. 19 июня 1846 года состоялся первый матч по правилам Картрайта. В 1869 году в городе Цинциннати местная команда «Ред Стокингс» стала первой командой, начавшей платить игрокам деньги за участие в матчах. А уже через два года была создана первая в США и в мире профессиональная бейсбольная лига. К началу XX века в большинстве городов восточного побережья США были свои профессиональные бейсбольные команды[1].\n" +
                "\n" +
                "Чемпионат мира по бейсболу проводится с 1938 года среди мужчин и с 2004 года среди женщин. В сентябре 1986 года МОК включил бейсбол и софтбол в программу летних Олимпийских игр. 8 июля 2005 года на 117-й сессии МОК в Сингапуре бейсбол и софтбол были исключены из списка олимпийских видов спорта как из-за недостаточной популярности в большинстве стран-членов МОК, так и по причине разногласий между МОК и Лигой бейсбола в США, которая отказалась переносить свои соревнования на время проведения Олимпийских игр. В результате на Олимпийских играх в Пекине бейсбол был представлен в последний раз, но в 2020 году бейсбол снова был включен в программу Олимпийских игр.");

        baseball1.setOnClickListener(listener);
        baseball2.setOnClickListener(listener);
        strelka1.setOnClickListener(listener);
    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.baseball1:
                    Intent intent = new Intent(getApplicationContext(), baseball1Activity.class);
                    startActivity(intent);
                    break;
                case R.id.baseball2:
                    intent = new Intent(getApplicationContext(), baseball2Activity.class);
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