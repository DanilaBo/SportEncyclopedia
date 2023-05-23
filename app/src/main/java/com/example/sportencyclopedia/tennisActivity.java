package com.example.sportencyclopedia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class tennisActivity extends AppCompatActivity {

    private TextView text;
    private ImageButton tennis1;
    private ImageButton tennis2;
    private ImageButton strelka1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tennis);

        tennis1 = findViewById(R.id.tennis1);
        tennis2 = findViewById(R.id.tennis2);
        strelka1 = findViewById(R.id.strelka1);

        TextView text = (TextView)findViewById(R.id.text);
        text.setText("Будущий легендарный пловец родился в закрытом городе на Урале, сейчас он называется Лесной. Родители отвели сына в бассейн, чтобы чем-то его занять, ведь оба работали на секретном предприятии. Первый тренер, Галина Витман, разглядела в мальчике предпосылки к профессиональному плаванию и начала с ним заниматься. Геннадий Турецкий, наставник Попова в университете, смог раскрыть его лучшие спортивные качества: физические параметры и прекрасное чувство воды.\n" +
                "\n" +
                "Первые победы пришли к Александру Попову в 1991 году на чемпионате Европы в Афинах, где он получил 4 золотые медали на дистанциях 50 и 100 м и за участие в эстафетах. Олимпиада 1992 года в Барселоне принесла российскому пловцу две медали высшей пробы. Тренер Геннадий Турецкий в 1993 году переехал в Австралию, вслед за наставником туда отправился и Попов.\n" +
                "\n" +
                "Олимпиада 1996 года в Атланте доказала, что на тот момент равных Александру пловцов не было. Эта победа была вдвойне ценной, так как американцы были уверены, что победит их спортсмен, Гэри Холл-младший. Международная федерация плавания вручила в 1998 году Попову кубок как выдающемуся пловцу десятилетия." +
                "Прямым предшественником современного тенниса считается игра в помещениях, до конца XIX века носившая то же название, а в настоящее время известная как реал-теннис, корт-теннис или жё-де-пом (фр. jeu de paume, в буквальном переводе игра ладонью). Жё-де-пом, в который могли играть одновременно до 12 человек[4], появился в XI веке, по-видимому, в монастырях. Вначале в этой игре, как и в ручной пелоте, мяч отбивали рукой, затем появились перчатки, биты и, наконец, в XVI веке, ракетки и сетка. На это же время приходится пик популярности жё-де-пома, в который играли французские, английские и испанские короли того времени[5][6].\n" +
                "\n" +
                "Одним из наиболее известных упоминаний тенниса в средневековой литературе является эпизод в исторической хронике Шекспира «Генрих V», где французский дофин в насмешку присылает молодому английскому королю бочонок теннисных мячей.\n" +
                "\n" +
                "В XVI веке практически все французские короли играли в теннис: теннисный зал был оборудован на королевской яхте Франциска I, Генрих II повелел построить теннисный зал в Лувре, а Карл IX в 1571 году, даруя парижским игрокам в теннис и мастерам, изготовлявшим ракетки, право на гильдию, назвал теннис «одним из самых благородных, достойных и полезных для здоровья упражнений, которыми могут заниматься принцы, пэры и другие знатные особы».\n" +
                "\n" +
                "Тем не менее, на протяжении большей части своей истории теннис оставался игрой избранных. Малое количество участников матча и ограниченное пространство для зрителей не позволили ему стать по-настоящему народным развлечением[5], и уже через сто лет даже в Париже было всего десять залов для игры в теннис, все в плохом состоянии[7]. Теннисные залы стали приспосабливать для иных нужд, в том числе для выступления театральных трупп, и, согласно «Оксфордской иллюстрированной энциклопедии театра», это предопределило форму будущих театральных залов[6].\n" +
                "\n" +
                "В 1874 году майор Вальтер Клоптон из Уингфилда (Англия) разработал правила новой, близкой по сути к современному теннису игры, которую он назвал «сферистика». По прошествии года правила сферистики были усовершенствованы, и игра получила новое название — «лаун-теннис», что в переводе с английского означает «теннис на лужайке».[8]\n" +
                "\n" +
                "В 1899 году у четырёх студентов Гарвардского университета зародилась идея проведения теннисного турнира, в котором участвуют национальные сборные команды. Один из них, Дуайт Дэвис, разработал схему проведения турнира и купил на собственные деньги приз для победителя — серебряный кубок[9]. Первый турнир состоялся в Бруклайне (штат Массачусетс) в 1900 году, и в нём приняли участие сборные США и Великобритании. Дэвис вместе с двумя другими студентами Гарварда играл за команду США, которая неожиданно победила, выиграв затем и следующий матч в 1902 году[10]. С тех пор турнир проводился каждый год (за некоторыми исключениями), а после смерти Дэвиса в 1945 году получил название Кубок Дэвиса и сейчас является популярным ежегодным событием в мире тенниса.\n" +
                "\n" +
                "В 1923 году одна из ведущих теннисисток мира, Хейзел Хочкисс-Уайтмен, в целях популяризации женского тенниса учредила командный Кубок Уайтмен, но это соревнование, будучи впервые проведённым между женскими сборными США и Великобритании, так и осталось внутренним делом этих двух команд[11] на всём протяжении своего существования до 1990 года, когда британская сторона объявила о прекращении участия в турнире[12]. Только в 1963 году Международная федерация лаун-тенниса учредила Кубок Федерации — женское командное соревнование, ставшее аналогом мужского Кубка Дэвиса.\n" +
                "\n" +
                "Начиная с 1920-х годов, профессиональные теннисные игроки начали зарабатывать деньги, выступая в показательных матчах перед публикой, которая платила за право смотреть игру. Первой, кто подписал профессиональный контракт на выступления перед публикой, стала чемпионка Олимпийских игр в Антверпене Сюзанн Ленглен. Её турне организовал предприниматель Чарльз Пайл, пытавшийся также заключить контракт с другими ведущими теннисистками мира, Хелен Уиллз и Моллой Мэллори, но не преуспевший в этом. Тогда в качестве партнёрши для Ленглен была ангажирована Мэри Браун, трёхкратная чемпионка США и капитан сборной страны в Кубке Уайтмен, которой к тому моменту было уже 35 лет. Сумма контракта Ленглен составляла 75 тысяч долларов[13], а Браун должна была, по слухам, получить 30 тысяч[14]. Пайл также заключил контракт с четвёртой ракеткой Франции Полем Фере и звездой американского тенниса, двукратным олимпийским чемпионом и обладателем Кубка Дэвиса Винсентом Ричардсом, наряду с ещё двумя менее известными теннисистами. Первый профессиональный теннисный матч в истории состоялся 9 октября 1926 года в Нью-Йорке на крытой арене «Медисон-сквер-гарден», в присутствии 13 тысяч зрителей. В теннисных кругах возникновение профессионального тура было воспринято со смешанными чувствами, вызвав как поддержку, так и резкую критику[13].\n" +
                "\n" +
                "Однако Ричардс оказался не столь успешным менеджером, как Пайл, и профессиональный тур перестал приносить доходы, пока в 1931 году к нему не присоединился многократный победитель Уимблдонского турнира, чемпионата США и Кубка Дэвиса Билл Тилден, чьё противостояние с чемпионом США среди профессионалов 1929 года[15], чехословацким мастером Карелом Кожелугом снова привлекло внимание публики и принесло около четверти миллиона долларов за сезон.");

        tennis1.setOnClickListener(listener);
        tennis2.setOnClickListener(listener);
        strelka1.setOnClickListener(listener);
    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.tennis1:
                    Intent intent = new Intent(getApplicationContext(), tennis1Activity.class);
                    startActivity(intent);
                    break;
                case R.id.tennis2:
                    intent = new Intent(getApplicationContext(), tennis2Activity.class);
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