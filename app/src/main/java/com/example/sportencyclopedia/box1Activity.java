package com.example.sportencyclopedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class box1Activity extends AppCompatActivity {

    private TextView text;
    private ImageButton strelka2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_box1);

        strelka2 = findViewById(R.id.strelka2);
        strelka2.setOnClickListener(listener);

        TextView text = (TextView)findViewById(R.id.text);
        text.setText("С момента своего издания в 1867 году правила маркиза Куинсберри были основным источником регулирования боксёрских поединков.\n" +
                "\n" +
                "Как правило, раунды имеют продолжительность 3 минуты (хотя в Великобритании использовались и 2-минутные раунды). Каждый боксёр выходит на ринг из отведённого ему угла, и после каждого раунда он направляется сюда для того, чтобы отдохнуть, получить советы тренера и необходимую помощь врача. Рефери контролирует бой: находясь на ринге, он следит за поведением бойцов, отсчитывает нокдауны и штрафует за нарушение правил. До трёх судей может находиться рядом с рингом для того, чтобы присваивать участникам очки.Участник боя может стать победителем, отправив своего оппонента в нокаут. Если боксёр сбит на землю ударом и касается пола любой частью тела, кроме ноги, рефери начинает отсчёт. Если в течение 10 секунд он поднимается — бой продолжается, если нет — то он считается нокаутированным, а его соперник становится победителем. Также возможен технический нокаут: он признаётся рефери, врачом или углом боксёра в случае, если он получил травму или не может защищаться. Иногда действует правило трёх нокдаунов (в титульных боях под эгидой WBA), когда это количество приравнивается к техническому нокауту. Если поединок закончился, и ни один из участников не одержал досрочной победы, то его исход решается судьями. Победителем становится спортсмен, набравший наибольшее количество очков, но иногда случаются и ничейные результаты.Боксёрам запрещается наносить удары ниже пояса, держать друг друга, толкаться, кусаться, плеваться и бороться. Также нельзя бить ногой, головой, коленом и любой другой частью руки кроме сжатого кулака (локтем, плечом, предплечьем, запястьем, открытой ладонью). Запрещено делать удары в спину, в заднюю часть шеи, в затылок и по почкам. Нельзя держаться за канат или соперника во время удара, а также делать нырки ниже пояса. Если клинч разбивается рефери, оба бойца, перед тем как нанести удар, должны сделать полный шаг назад. Когда один из боксёров находится в нокдауне, второй должен отойти в нейтральный угол и ждать решения судьи.Боксерам нельзя много убегать и быть возле канатов много раз. За это снимается одно очко\n" +
                "\n" +
                "Рефери может наказывать за нарушение правил предупреждением, снятием очков или даже дисквалификацией. Умышленное действие против правил, наносящее травму сопернику и останавливающее бой, как правило приводит к последней и самой строгой мере. Боксёр, получивший случайный удар ниже пояса, может восстановить силы в течение 5 минут. Если после отведённого времени он не готов продолжить бой, он признаётся нокаутированным. Особым пунктом правил является случайное столкновение головами, повлёкшее травму, делающую невозможным или опасным продолжение боя. Если событие произошло в первые четыре раунда, то бой считается ничейным либо несостоявшимся (какой именно будет итог, оговаривается до боя). Если событие произошло после четвёртого раунда, то бой останавливается, и судьи считают голоса за полные раунды. Намеренное столкновение головами считается нарушением и штрафуется.Запрещённые приёмы:\n" +
                "\n" +
                "удар ниже пояса;\n" +
                "удар (или опасное движение) головой;\n" +
                "удар по затылку;\n" +
                "удар по почкам;\n" +
                "удар в спину;\n" +
                "удар открытой перчаткой (ребром или тыльной стороной, особенно шнуровкой);\n" +
                "захват (головы, руки, перчатки, туловища);\n" +
                "захват с нанесением удара;\n" +
                "нажим рукой на лицо соперника;\n" +
                "повороты спиной к противнику;\n" +
                "толкание противника;\n" +
                "использование канатов для нанесения удара;\n" +
                "хватание канатов.");


    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent = new Intent(getApplicationContext(), boxActivity.class);
            startActivity(intent);
        }
    };
}