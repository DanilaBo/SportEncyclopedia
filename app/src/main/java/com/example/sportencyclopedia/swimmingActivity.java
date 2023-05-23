package com.example.sportencyclopedia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class swimmingActivity extends AppCompatActivity {

    private TextView text;
    private ImageButton swimming1;
    private ImageButton swimming2;
    private ImageButton strelka1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swimming);

        swimming1 = findViewById(R.id.swimming1);
        swimming2 = findViewById(R.id.swimming2);
        strelka1 = findViewById(R.id.strelka1);

        TextView text = (TextView)findViewById(R.id.text);
        text.setText("Пла́вание — вид спорта или спортивная дисциплина, заключающаяся в преодолении вплавь за наименьшее время различных дистанций[1]. При этом в подводном положении по действующим ныне правилам разрешается проплыть не более 15 м после старта или поворота (в плавании брассом подобное ограничение сформулировано по-другому); скоростные виды подводного плавания относятся не к плаванию, а к подводному спорту.\n" +
                "\n" +
                "По классификации МОК (согласно принципу «одна федерация — один вид спорта») плавание как вид спорта включает в себя: собственно плавание, водное поло, прыжки в воду и синхронное плавание[2]; в русскоязычной спортивной литературе в качестве синонима плавания в этом значении употребляется словосочетание «водные виды спорта». Координацией развития водных видов спорта в мире занимается Международная федерация плавания (ФИНА, фр. FINA, Fédération Internationale de Natation, создана в 1908 году)[3][4], проводящая чемпионаты мира (с 1973); в Европе — Лига европейского плавания (ЛЕН, фр. LEN, Ligue Européenne de Natation, создана в 1926 году)[5], проводящая чемпионаты Европы (с 1926 года).\n" +
                "\n" +
                "Согласно Всероссийскому реестру видов спорта все водные виды считаются различными видами спорта.\n" +
                "\n" +
                "Также плавание является составной частью современного пятиборья (заплыв на 200 м), триатлона (различные дистанции в открытой воде) и некоторых прикладных многоборий." +
                "Рисунки на археологических находках свидетельствуют, что люди в Древнем Египте, Ассирии, Финикии и во многих других странах умели плавать за несколько тысячелетий до нашей эры, и известные им способы плавания напоминали современные кроль и брасс. В то время плавание носило чисто прикладной характер — при рыбной ловле, охоте за водоплавающей дичью, подводном промысле, в военном деле. В Древней Греции плавание стало использоваться как важное средство физического воспитания[6].\n" +
                "\n" +
                "Первые соревнования по плаванию относятся к рубежу XV—XVI веков (так, в 1515 году прошли состязания пловцов в Венеции)[2]. Первая спортивная организация пловцов возникла в Англии в 1869 году («Ассоциация любителей спортивного плавания Англии»), следом подобные организации появились в Швеции (1882), Германии, Венгрии (1886), Франции (1887), Нидерландах, США (1888), Новой Зеландии (1890), России (1894), Италии, Австрии (1899). Рост популярности спортивного плавания в конце XIX века связан с началом строительства искусственных бассейнов[7].\n" +
                "\n" +
                "В 1889 году в Вене прошли крупные международные соревнования с участием спортсменов из нескольких европейских стран; далее они стали проводиться регулярно и носили название «первенство Европы»[8][9]. В 1896 году плавание вошло в программу первых Олимпийских игр, и с тех пор неизменно входит в олимпийскую программу.\n" +
                "\n" +
                "Перед началом Олимпийских игр 1908 года ФИНА разработала и утвердила «Правила ФИНА», включавшие перечень дистанций для проведения соревнований, порядок комплектования и проведения заплывов, порядок регистрации мировых рекордов. Тогда же были зарегистрированы первые мировые рекорды в плавании, самым ранним из них стал результат Золтана Халмаи на дистанции 100 м вольным стилем (1.05,8), показанный 3 декабря 1905 года в Вене.");

        swimming1.setOnClickListener(listener);
        swimming2.setOnClickListener(listener);
        strelka1.setOnClickListener(listener);
    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.swimming1:
                    Intent intent = new Intent(getApplicationContext(), swimming1Activity.class);
                    startActivity(intent);
                    break;
                case R.id.swimming2:
                    intent = new Intent(getApplicationContext(), swimming2Activity.class);
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