package com.example.sportencyclopedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class basketball2Activity extends AppCompatActivity {
    private TextView text;
    private ImageButton strelka2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball2);

        strelka2 = findViewById(R.id.strelka2);
        strelka2.setOnClickListener(listener);

        TextView text = (TextView)findViewById(R.id.text);
        text.setText("Оскар Шмидт\n" +
                "Оскар Даниэль Безерра Шмидт – бразильский баскетболист, являющийся мировым рекордсменом по количеству набранных очков. По подсчетам за карьеру на клубном уровне и в сборной Бразилии Шмидт набрал 49 703 очка. Для сравнения, у рекордсмена НБА Карима Абдул-Джаббара – 38 387.\n" +
                "\n" +
                "Сергей Белов\n" +
                "Чемпион Олимпийских игр, двукратный чемпион мира, четырехкратный чемпион Европы, чемпион Универсиады, двукратный обладатель Кубка европейских чемпионов (сейчас – Евролига). Это список лишь главных достижений легенды советского и европейского баскетбола Сергея Белова.\n" +
                "В 1991 году Международная федерация баскетбола признала Сергея Александровича лучшим игроком среди всех баскетболистов, выступавших за свои национальные сборные (без учета НБА). В конечном счете даже в Национальной баскетбольной ассоциации отметили заслуги Белова, включив его в Зал славы. Сергей Александрович стал первым неамериканцем, удостоившимся такой чести.\n" +
                "\n" +
                "Джерри Уэст\n" +
                "За 14-летнюю карьеру в НБА Джерри Уэст стал чемпионом лишь 1 раз. У него нет титула MVP сезона или звания «Новичок года». И все же Уэст является для НБА знаковой фигурой. Современная эмблема Ассоциации – игрок, ведущий мяч, – была представлена в конце 1969 года. Спустя 40 лет автор изображения Алан Сигел признался, что создал эмблему на основе фотографии Уэста, сделанной в ходе одной из игр «Лейкерс»." +
                "Джерри Уэст – первый обладатель титула Самого ценного игрока финала НБА. При этом Уэст единственный за всю историю вручения награды получил ее в составе проигравшей команды. Также он является членом клуба «27+». Среди баскетболистов, завершивших карьеру, только Уэст, Джордан, Бэйлор и Чемберлен набирали в среднем 27 и более очков за игру.\n" +
                "\n"+
                "Коби Брайант\n" +
                "Коби Брайант завоевал 5 чемпионских перстней, титул MVP НБА, 2 олимпийских золотых медали, 18 раз выступал в Матче всех звезд. Брайант, бесспорно, является одним из лучших атакующих защитников в истории НБА, который, как никто другой, близко подобрался к иконе – Майклу Джордану.\n" +
                "Помимо многочисленных наград, Коби на протяжении всей карьеры подступался к несокрушимым рекордам. На данный момент Брайант занимает четвертое место в списке самых результативных игроков в истории НБА (33 643 очка). Также ему принадлежит второй результат по набранным баллам в одной игре – в 2006 году Коби отгрузил в корзину «Торонто» 81 очко.");
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent = new Intent(getApplicationContext(), basketballActivity.class);
            startActivity(intent);
        }
    };
}