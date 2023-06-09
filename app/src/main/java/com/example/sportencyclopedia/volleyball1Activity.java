package com.example.sportencyclopedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class volleyball1Activity extends AppCompatActivity {

    private TextView text;
    private ImageButton strelka2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volleyball1);

        strelka2 = findViewById(R.id.strelka2);
        strelka2.setOnClickListener(listener);

        TextView text = (TextView)findViewById(R.id.text);
        text.setText("Общие правила\n" +
                "Игра ведётся на прямоугольной площадке размером 18х9 метров. Волейбольная площадка разделена посередине сеткой. Высота сетки для мужчин — 2,43 м, для женщин — 2,24 м.\n" +
                "Основная статья: Волейбольная площадка\n" +
                "Игра ведётся сферическим мячом окружностью 65—67 сантиметров, массой 260—280 г.\n" +
                "Основная статья: Волейбольный мяч\n" +
                "Каждая из двух команд может иметь в составе до 14 игроков, на поле во время игры могут находиться 6 игроков. Цель игры — атакующим ударом добить мяч до пола, то есть до игровой поверхности площадки половины противника, или заставить его ошибиться.\n" +
                "Игра начинается вводом мяча при помощи подачи согласно жребию. После ввода мяча подачей и успешного розыгрыша подача переходит к той команде, которая выиграла очко. Площадка по количеству игроков условно разделена на 6 зон. После каждого перехода право подачи переходит от одной команды к другой в результате розыгрыша очка, игроки перемещаются в следующую зону по часовой стрелке.\n" +
                "\n" +
                "Расстановка\n" +
                "Чёткой границы между зонами 1—6 нет, однако существуют ограничения на расстановку и действия игроков на площадке:\n" +
                "1) Игроки делятся на «переднюю линию» (зоны 2, 3, 4) и «заднюю линию» (зоны 1, 5, 6). Игроки задней линии не могут ставить блок и атаковать выше троса в передней зоне около сетки (ближе трёхметровой линии).\n" +
                "2) Во время подачи игроки на каждой стороне должны стоять так, чтобы игрок задней линии не находился ближе к сетке, чем соответствующий ему игрок передней линии (1 не ближе 2, 6 не ближе 3, 5 не ближе 4), также должен соблюдаться порядок внутри каждой из линий: слева направо должны располагаться игроки 4, 3 и 2; также слева направо должны располагаться игроки 5, 6 и 1. Однако правила, например, не запрещают игроку 5 зоны стоять ближе к сетке, чем игрок зоны 3. После подачи игроки могут произвольно перемещаться по площадке.\n" +
                "В современном профессиональном волейболе игроки специализируются на игре в определённой зоне («амплуа игроков»), перед подачей они встают на площадке так, чтобы выполнить требования к расстановке, а после подачи перемещаются в удобную для себя зону до конца розыгрыша.\n" +
                "\n" +
                "Подача\n" +
                "Выполняет подачу игрок, который в результате последнего перехода перемещается из второй в первую зону. Подача производится из зоны подачи за задней линией игровой площадки с целью приземлить мяч на половине противника или максимально усложнить приём. Не допускается заступ на игровую площадку во время подачи. В полёте мяч может коснуться сетки, но не должен касаться антенн или их мысленного продолжения вверх. Если мяч коснётся поверхности игровой площадки на стороне принимающей команды, подающей команде засчитывается очко. Если игрок, который подавал, нарушил правила или отправил мяч в аут, то очко засчитывается принимающей команде. Не разрешается блокировать мяч при подаче, прерывая его траекторию над сеткой. Если очко выиграно командой, которая подавала мяч, то подачу продолжает выполнять тот же игрок.\n" +
                "В современном волейболе наиболее распространена силовая подача в прыжке[20]. Её противоположностью является укороченная (планирующая, тактическая) подача, когда мяч направляется близко к сетке.\n" +
                "Приём подачи\n" +
                "Обычно принимают мяч игроки, стоящие на задней линии, то есть в 5-й, 6-й, 1-й зонах. Однако принять подачу может любой игрок. Игрокам принимающей команды разрешается сделать три касания (игроку нельзя дважды подряд трогать мяч) и максимум третьим касанием перевести мяч на половину противника. Обрабатывать мяч на приёме можно в любом месте площадки и свободного пространства, но только не на самой половине площадки противника. При этом если приходится пасом переводить мяч обратно на свою игровую половину, вторая передача из трёх не может проходить между антеннами, а обязательно должна проходить мимо антенн. При приёме не допускается никакая задержка мяча при его обработке, хотя принимать мяч можно любой частью тела[21]. Планирующую подачу могут принимать 2 игрока на задней линии, но для приёма силовой подачи требуется уже 3 игрока.\n" +
                "\n" +
                "Атака\n" +
                "Обычно при хорошем приёме мяч принимается игроками задней линии (1-е касание) и доводится до связующего игрока. Связующий передаёт (2-м касанием) мяч игроку для выполнения атакующего удара (3-е касание). При атакующем ударе мяч должен пройти над сеткой, но в пространстве между двумя антеннами, при этом мяч может задеть сетку, но не должен задевать антенны или их мысленные продолжения вверх. Игроки передней линии могут атаковать с любой точки площадки. Игроки задней линии перед атакой должны отталкиваться за специальной трёхметровой линией. Либеро может атаковать, только если мяч (хотя бы частично) находится ниже линии верхнего края сетки.\n" +
                "Различают атакующие удары: прямые (по ходу) и боковые, удары с переводом вправо (влево) и обманные удары (скидки). Все атакующие удары выполняются только на своей стороне, переносить руки на сторону противника можно только после выполнения удара[22].\n" +
                "\n" +
                "Блокирование\n" +
                "Это игровой приём, при котором защищающаяся команда препятствует переводу мяча при атаке противника на свою сторону, перекрывая его ход любой частью тела над сеткой, обычно руками, перенесёнными на сторону противника в рамках правил. Разрешается переносить руки на сторону противника при блокировании в той степени, чтобы они не мешали противнику до его атаки или другого игрового действия.\n" +
                "Блок может быть одиночным или групповым (двойным, тройным). Касание блока не считается за одно из трёх касаний. Блокировать могут только те игроки, что стоят на передней линии, то есть в зонах 2, 3, 4.\n" +
                "\n" +
                "Защита (приём атаки)\n" +
                "Приём атакующего удара отличается от приёма подачи, так как в защите в обязательном порядке всегда участвуют все 6 игроков, находящихся на площадке; некоторые игроки передней линии ставят блок (иногда все трое), а все остальные играют в защите. Цель защищающихся оставить мяч в игре и по возможности довести его пасующему. Защита может быть эффективной только в случае согласованных действий всех игроков команды, поэтому были разработаны схемы игры в защите, из которых прижились только две: «углом назад» и «углом вперёд». В обеих схемах крайние защитники стоят по боковым линиям, выходя из-за блока в 5-6 метрах от сетки, а вот защитник в 6 зоне, в соответствии с названием схемы, играет или непосредственно позади блока (ловит скидки за блок), или за лицевой линией (играет дальние рикошеты от блока).\n" +
                "\n" +
                "Либеро\n" +
                "Один или двое игроков (до 2009 года — только один игрок) команды могут быть назначены либеро. Игроки этого амплуа не могут участвовать в блоке, подавать, выполнять нападающий удар по мячу, полностью находящемуся выше верхнего края сетки. Форма либеро должна отличаться от формы остальных игроков. Разрешается заменять либеро неограниченное количество раз, не ставя в известность судью. Так как либеро не имеет права атаковать и блокировать, он обычно находится на задней линии, меняясь позицией с игроками, которых выгодно держать на передней линии, например, с центральным блокирующим.\n" +
                "С выходом редакции правил 2021—2024 г., игроку либеро позволено быть как игровым капитаном, так и капитаном команды. До этого момента либеро не мог быть капитаном." +
                "\n" +
                "\n" +
                "Регламент\n" +
                "Матч заканчивается, когда одна из команд выиграет три партии. До начала матча первый судья в присутствии капитанов команд проводит жеребьёвку, победитель которой выбирает либо мяч (подачу или приём), либо сторону площадки. После окончания каждой партии команды меняются сторонами площадки, а при счете 2:2 перед пятой партией проводится новая жеребьёвка. При достижении одной из команд 8 очков в пятой партии производится смена сторон.\n" +
                "Волейбольная партия не ограничена во времени и продолжается до 25 очков, в пятой партии (тай-брейк) счёт идёт до 15 очков. При этом если преимущество над противником не достигло 2 очков, партия будет продолжаться до тех пор, пока это не произойдёт.\n" +
                "В каждой партии тренер каждой из команд может попросить два тайм-аута по 30 секунд. Дополнительно в первых 4 партиях назначаются технические тайм-ауты по достижении одной из команд 8 и 16 очков (по 60 секунд).\n" +
                "В каждой партии тренер имеет право произвести не более 6 замен полевых игроков (кроме либеро), причём заменённый игрок может в той же партии вернуться на площадку только вместо того игрока, который его ранее заменил, после чего последний не сможет выходить на площадку до следующей партии. Также в случае травмы волейболиста, который не может продолжать игру, команде, ранее уже использовавшей все 6 замен, может быть разрешена так называемая «исключительная» замена." +
                "Нарушения правил\n" +
                "Ниже перечислены наиболее характерные для игры ошибки игроков и тренера.\n" +
                "\n" +
                "При подаче\n" +
                "Игрок заступил ногой на площадку.\n" +
                "Игрок подбросил и поймал мяч или не коснулся мяча.\n" +
                "Мяч касается антенны, игрока подающей команды или не пересекает вертикальную плоскость сетки полностью через площадь перехода, выходит в аут.\n" +
                "Подача, совершённая до свистка судьи, не засчитывается и повторяется.\n" +
                "По истечении 8 секунд после свистка судьи мяч передаётся команде соперников.\n" +
                "При розыгрыше\n" +
                "Сделано более трёх касаний (не учитывая блок).\n" +
                "Касание игроком сетки между антеннами, касание антенны[25].\n" +
                "Заступ игроком задней линии трёхметровой линии при атаке.\n" +
                "Двойное касание или задержка мяча.\n" +
                "Переход центральной линии стопой полностью (фиксируется по проекции стопы на площадку).\n" +
                "\n" +
                "Регламент\n" +
                "Нарушение расстановки.\n" +
                "Неспортивное поведение одного из игроков или тренера.\n" +
                "\n" +
                "Виды наказаний\n" +
                "Предупреждение (игроку, тренеру или всей команде предъявляется жёлтая карточка): за первый случай затяжки времени или неспортивного поведения; санкция считается профилактической и, кроме предъявления карточки, последствий не имеет, хотя и заносится в игровой протокол;\n" +
                "Замечание (игроку или тренеру предъявляется красная карточка): за первый случай грубого поведения либо за повторное неспортивное поведение; получившая замечание команда наказывается проигрышем очка и потерей подачи;\n" +
                "Удаление (игроку или тренеру предъявляются жёлтая и красная карточки, которые судья держит вместе в одной руке): за первый случай оскорбительного поведения либо за повторный случай грубого поведения; удалённый участник матча должен покинуть игровую площадку с правом замены (тренер — командную зону) и до конца партии находиться на специальном месте для удалённых; по окончании партии он может продолжить участие в игре;\n" +
                "Дисквалификация (игроку или тренеру предъявляются жёлтая и красная карточки, которые судья держит в руках раздельно): за агрессивное поведение, либо за повторный случай оскорбительного поведения, либо за третий случай грубого поведения; дисквалифицированный игрок или тренер должен покинуть место проведения соревнований (игрок — с правом замены), при этом он лишается права участвовать в матче до его окончания.");


    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent = new Intent(getApplicationContext(), volleyballActivity.class);
            startActivity(intent);
        }
    };
}