package com.example.sportencyclopedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class football1Activity extends AppCompatActivity {

    private TextView text;
    private ImageButton strelka2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football1);

        strelka2 = findViewById(R.id.strelka2);
        strelka2.setOnClickListener(listener);

        TextView text = (TextView)findViewById(R.id.text);
        text.setText("Есть 17 официальных правил игры, каждое из которых содержит список оговорок и руководящих принципов. Эти правила предназначены для применения на всех уровнях футбола, хотя есть некоторые изменения для таких групп, как юниоры, взрослые, женщины и люди с ограниченными физическими возможностями. Законы очень часто формулировались в общих чертах, которые позволяют упростить их применения в зависимости от характера игры. Правила игры публикуются в ФИФА, но поддерживаются Международным советом футбольных ассоциаций (IFAB)[36].\n" +
                "\n" +
                "Каждая команда состоит максимум из одиннадцати игроков (без учёта запасных), один из которых должен быть вратарём. Правила неофициальных соревнований могут уменьшить количество игроков, максимум до 7. Вратари являются единственными игроками, которым позволено играть руками при условии: они делают это в пределах штрафной площади у своих собственных ворот. Хотя есть различные позиции на поле, эти позиции не обязательны[37].\n" +
                "\n" +
                "Отдельная футбольная игра называется матч, который в свою очередь состоит из двух таймов по 45 минут. Пауза между первым и вторым таймами составляет 15 минут, в течение которой команды отдыхают, а по её окончании меняются воротами[38].\n" +
                "\n" +
                "Цель игры — забить мяч в ворота противника, сделать это как можно большее количество раз и постараться не допустить гола в свои ворота. Матч выигрывает команда, забившая большее количество голов.\n" +
                "\n" +
                "В случае, если в течение двух таймов команды забили одинаковое количество голов (ничья), то или фиксируется ничья, или победитель выявляется согласно установленному регламенту матча. В этом случае может быть назначено дополнительное время — ещё два тайма по 15 минут каждый. Как правило, между основным и дополнительным временем матча командам предоставляется перерыв. Между дополнительными таймами командам даётся лишь время на смену сторон. Одно время в футболе существовало правило, по которому победителем объявлялась команда, первой забившая гол (правило «золотого гола») или выигрывавшая по окончании любого из дополнительных таймов (правило «серебряного гола»). В настоящий момент дополнительное время либо не играется вовсе, либо играется в полном объёме (2 тайма по 15 минут). Если в течение дополнительного времени победителя выявить не удаётся, проводится серия послематчевых пенальти, не являющихся частью матча: по воротам противника с расстояния 11 метров пробивается по пять ударов разными игроками. Если количество забитых пенальти у обеих команд будет равным, тогда пробиваются по одной паре пенальти, пока не будет выявлен победитель[39].\n" +
                "\n" +
                "Стандартные положения\n" +
                "Основная статья: Мяч в игре и не в игре\n" +
                "\n" +
                "Мячи под буквами A, B и C находятся в игре, а мяч D — не в игре.\n" +
                "\n" +
                "Игрок выполняет штрафной удар, а «стенка» из игроков команды соперника старается блокировать удар.\n" +
                "В футболе бывают стандартные положения. Стандартными положениями в футболе являются штрафные, свободные, угловые и прочие удары, которые наносятся по сигналу судьи.\n" +
                "\n" +
                "Стандартными положениями являются:\n" +
                "\n" +
                "Начальный удар. Наносится в начале каждого тайма, а также — после каждого забитого мяча. Назначается с центральной точки поля (в центральном круге).\n" +
                "Вбрасывание мяча (аут). Бросается руками из-за боковой линии. Назначается после того, как мяч эту самую боковую линию пересёк. При этом аут бросает соперник игрока, которого мяч коснулся последним перед уходом за боковую линию.\n" +
                "Удар от ворот. Наносится вратарём, после того, как мяч полностью пересёк линию ворот (вне территории ворот) от игрока нападавшей команды.\n" +
                "Угловой удар. Наносится игроком нападающей команды из углового сектора. Назначается в случае, если мяч полностью пересекает линию ворот (вне территории ворот) от игрока защищавшейся команды.\n" +
                "Свободный удар. Назначается в случае опасной игры против соперника (несостоявшееся нарушение) в ворота команды, которая совершила опасную игру. Пробивается с точки, где произошёл момент опасной игры. Гол, забитый прямым ударом со свободного, не засчитывается[43].\n" +
                "Штрафной удар. Назначается в случае нарушения правил в ворота команды, нарушившей правила. Может быть назначен только за пределами штрафной площадки команды-нарушителя (в случае, если фол произошёл в пределах штрафной, назначается пенальти). Штрафной также, как и свободный удар пробивается с точки нарушения. Гол, забитый прямым ударом со штрафного, засчитывается[43].\n" +
                "Пенальти. Наносится со специальной отметки, расположенной в 11 метрах от ворот. Назначается в случае, если игрок нарушает правила в своей штрафной.\n" +
                "Спорный мяч. Совершается судьёй, скидивающим мяч между двумя игроками-соперниками. Назначается в случае, если игра была остановлена в ситуации, не связанной с правилами. Напоминает хоккейное вбрасывание.\n" +
                "Нарушения правил\n" +
                "Основная статья: Нарушения и недисциплинированное поведение (футбол)\n" +
                "\n" +
                "Игрок забивает пенальти\n" +
                "Фолы (нарушения)\n" +
                "Самыми частыми нарушениями являются:\n" +
                "\n" +
                "Удар соперника ногой или его попытка;\n" +
                "Подножка или попытка сделать её сопернику;\n" +
                "Прыжок на соперника;\n" +
                "Атака соперника;\n" +
                "Толчок соперника руками;\n" +
                "Удар или попытка такового против соперника.\n" +
                "Недисциплинированное поведение\n" +
                "Недисциплинированное поведение в футболе может быть представлено таковыми явлениями:\n" +
                "\n" +
                "Драки;\n" +
                "Плевки;\n" +
                "Нецензурные выражения и жесты.\n" +
                "Правила игры состоят из 17 пунктов. В них регулярно вносятся изменения. В 2020 году IFAB принял изменения в ряде правил (Правила 1, 2, 4, 10, 11, 12, 14), внес изменения в протокол VAR, словарь футбольных терминов и практические рекомендации .");


    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent = new Intent(getApplicationContext(), footballActivity.class);
            startActivity(intent);
        }
    };
}