package me.lorenzogalante.android.fivelyrics;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String currentlyPlaying = "none";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void printAlbum(String name, String artist, String album, String year, String label){
        String nameOutput = name;
        nameOutput += "\n" + artist;
        nameOutput += "\n" + album;
        nameOutput += "\n" + year;
        nameOutput += "\n" + label;
        TextView nameDisplay = (TextView) findViewById(R.id.name_display);
        nameDisplay.setText(nameOutput);
    }

    private void printLyrics(String lyrics) {
        TextView lyricsDisplay = (TextView) findViewById(R.id.lyric_display);
        lyricsDisplay.setText(lyrics);
    }

    public void buySong(View view){
        if (currentlyPlaying.equals("none"))
        {
            Toast.makeText(MainActivity.this, "Error: No Song Selected", Toast.LENGTH_SHORT).show();
        }
        if (currentlyPlaying.equals("PinkFloyd"))
        {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://play.google.com/store/music/album/Pink_Floyd_Wish_You_Were_Here?id=Bw2kk345y5ivx4m35tflhzsvg6a"));
            startActivity(intent);
        }
        else if(currentlyPlaying.equals("FooFighters"))
        {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://play.google.com/store/music/album/Foo_Fighters_The_Colour_And_The_Shape?id=Bvweco2gz6k6efekpkeq4pxgkfu"));
            startActivity(intent);
        }
        else if(currentlyPlaying.equals("TheBuggles"))
        {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://play.google.com/store/music/album/The_Buggles_The_Age_Of_Plastic?id=Bmicpplkidgdhcgqzawrwovibne"));
            startActivity(intent);
        }
        else if(currentlyPlaying.equals("Toto"))
        {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://play.google.com/store/music/album/Toto_Toto_IV?id=Bhogghhlgo6hpq7zp26erzhlepi"));
            startActivity(intent);
        }
        else if(currentlyPlaying.equals("ironMaiden"))
        {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://play.google.com/store/music/album/Iron_Maiden_Piece_of_Mind?id=Bnkbq2blyvhfv76miklcj3jlprm"));
            startActivity(intent);
        }
    }

    public void PinkFloyd(View view){
        currentlyPlaying = "PinkFloyd";

        printAlbum("Wish You Were Here", "Pink Floyd", "Wish You Were Here", "1975", "Columbia");

        String lyrics = "So, so you think you can tell Heaven from Hell, blue skies from pain.\n";
        lyrics += "Can you tell a green field from a cold steel rail?\n";
        lyrics += "A smile from a veil?\n";
        lyrics += "Do you think you can tell?\n\n";

        lyrics += "Did they get you to trade your heroes for ghosts?\n";
        lyrics += "Hot ashes for trees?\n";
        lyrics += "Hot air for a cool breeze?\n";
        lyrics += "Cold comfort for change?\n";
        lyrics += "Did you exchange a walk on part in the war for a lead role in a cage?\n\n";

        lyrics += "How I wish, how I wish you were here.\n";
        lyrics += "We're just two lost souls swimming in a fish bowl, year after year,\n";
        lyrics += "Running over the same old ground.\n";
        lyrics += "What have we found?\n";
        lyrics += "The same old fears.\n";
        lyrics += "Wish you were here.";
        printLyrics(lyrics);
    }

    public void FooFighters(View view){
        currentlyPlaying = "FooFighters";

        printAlbum("Everlong", "Foo Fighters", "The Colour and the Shape", "1997", "Capitol");

        String lyrics = "Hello\n";
        lyrics += "I've waited here for you\n";
        lyrics += "Everlong\n\n";

        lyrics += "Tonight I throw myself in two\n";
        lyrics += "Out of the red\n";
        lyrics += "Out of her head she sang\n\n";

        lyrics += "Come down and waste away with me\n";
        lyrics += "Down with me\n";
        lyrics += "Slow, how you wanted it to be\n";
        lyrics += "I'm over my head\n";
        lyrics += "Out of her head she sang\n\n";

        lyrics += "And I wonder\n";
        lyrics += "When I sing along with you\n";
        lyrics += "If everything could ever feel this real forever\n";
        lyrics += "If anything could ever be this good again\n";
        lyrics += "The only thing I'll ever ask of you\n";
        lyrics += "You've got to promise not to stop when I say when\n";
        lyrics += "She sang\n\n";

        lyrics += "Breathe out\n";
        lyrics += "So I can breathe you in\n";
        lyrics += "Hold you in\n";
        lyrics += "And now\n";
        lyrics += "I know you've always been\n";
        lyrics += "Out of your head\n";
        lyrics += "Out of my head I sang\n\n";

        lyrics += "And I wonder\n";
        lyrics += "When I sing along with you\n";
        lyrics += "If everything could ever feel this real forever\n";
        lyrics += "If anything could ever be this good again\n";
        lyrics += "The only thing I'll ever ask of you\n";
        lyrics += "You've got to promise not to stop when I say when\n";
        lyrics += "She sang\n\n";

        lyrics += "And I wonder\n";
        lyrics += "If everything could ever feel this real forever\n";
        lyrics += "If anything could ever be this good again\n";
        lyrics += "The only thing I'll ever ask of you\n";
        lyrics += "You've got to promise not to stop when I say when\n";

        printLyrics(lyrics);
    }

    public void TheBuggles(View view){
        currentlyPlaying = "TheBuggles";

        printAlbum("Kid Dynamo", "The Buggles", "The Age of Plastic", "1979", "Island");

        String lyrics = "Though today you may be riding\n";
        lyrics += "The engines of progress\n";
        lyrics += "Working in the major factories\n";
        lyrics += "Call me if you ever feel like letting go\n\n";

        lyrics += "I still remember the days of\n";
        lyrics += "Kid dynamo, kid dynamo\n";
        lyrics += "Kid dynamo, kid dynamo\n\n";

        lyrics += "Bowowowowowo wa-ah ow\n";
        lyrics += "Wowowowowowo wa-ah ow\n\n";

        lyrics += "Spreading in the subways\n";
        lyrics += "Of the playback from the train tracks\n";
        lyrics += "I think your mind was born with water wings\n";
        lyrics += "And now when I see you\n";
        lyrics += "All the generation screams\n\n";

        lyrics += "I remember the dreams \n";
        lyrics += "Kid dynamo, kid dynamo\n";
        lyrics += "Kid dynamo, kid dynamo\n\n";

        lyrics += "Kid dynamo, I remember you\n";
        lyrics += "Kid dynamo, because I sleep with you\n";
        lyrics += "Kid dynamo, cause I have been with you\n";
        lyrics += "Oh let it be said\n";
        lyrics += "How the media builds stars\n";
        lyrics += "And our minds will not change\n";
        lyrics += "Only our cars\n\n";

        lyrics += "Kid dynamo, kid dynamo\n";
        lyrics += "Kid dynamo\n";
        lyrics += "Kid dynamo\n";
        lyrics += "Kid dynamo\n";
        lyrics += "Kid dynamo, I remember you\n";
        lyrics += "Kid dynamo, because I think of you\n";
        lyrics += "Kid dynamo, cause I have looked at you\n";
        lyrics += "Kid dynamo\n";
        lyrics += "Kid dynamo, kid dynamo\n";
        lyrics += "Kid dynamo, kid dynamo\n\n";
        printLyrics(lyrics);
    }

    public void Toto(View view){
        currentlyPlaying = "Toto";
        printAlbum("Africa", "Toto", "Toto IV", "1982", "Columbia");
        String lyrics = "I hear the drums echoing tonight\n";
        lyrics += "But she hears only whispers of some quiet conversation\n";
        lyrics += "She's coming in, twelve-thirty flight\n";
        lyrics += "The moonlight wings reflect the stars that guide me towards salvation\n";
        lyrics += "I stopped an old man along the way\n";
        lyrics += "Hoping to find some old forgotten words or ancient melodies\n";
        lyrics += "He turned to me as if to say \"Hurry boy, it's waiting there for you\"\n\n";

        lyrics += "It's gonna take me a lot to drag me away from you\n";
        lyrics += "There's nothing that a hundred men or more could ever do\n";
        lyrics += "I bless the rains down in Africa\n";
        lyrics += "Gonna take some time to do the things we never had\n\n";

        lyrics += "The wild dogs cry out in the night\n";
        lyrics += "As they grow restless, longing for some solitary company\n";
        lyrics += "I know that I must do what's right\n";
        lyrics += "As sure as Kilimanjaro rises like Olympus above the Serengeti\n";
        lyrics += "I seek to cure what's deep inside, frightened of this thing that I've become\n\n";

        lyrics += "It's gonna take me a lot to drag me away from you\n";
        lyrics += "There's nothing that a hundred men or more could ever do\n";
        lyrics += "I bless the rains down in Africa\n";
        lyrics += "Gonna take some time to do the things we never had\n\n";

        lyrics += "Hurry boy, she's waiting there for you\n\n\n";

        lyrics += "It's gonna take me a lot to drag me away from you\n";
        lyrics += "There's nothing that a hundred men or more could ever do\n";
        lyrics += "I bless the rains down in Africa\n";
        lyrics += "I bless the rains down in Africa\n";
        lyrics += "(I bless the rain)\n";
        lyrics += "I bless the rains down in Africa\n";
        lyrics += "(I bless the rain)\n";
        lyrics += "I bless the rains down in Africa\n";
        lyrics += "I bless the rains down in Africa\n";
        lyrics += "(Ah, gonna take the time)\n";
        lyrics += "Gonna take some time to do the things we never had\n\n";

        printLyrics(lyrics);
    }

    public void ironMaiden(View view){
        currentlyPlaying = "ironMaiden";
        printAlbum("The Trooper", "Iron Maiden", "Piece of Mind", "1983", "Capitol");

        String lyrics = "You'll take my life but I'll take yours too\n";
        lyrics += "You'll fire your musket but I'll run you through\n" +
                "So when you're waiting for the next attack\n" +
                "You'd better stand there's no turning back\n\n";

        lyrics += "The bugle sounds as the charge begins\n" +
                "But on this battlefield no one wins\n" +
                "The smell of acrid smoke and horses breath\n" +
                "As you plunge into a certain death\n\n";

        lyrics += "The horse he sweats with fear we break to run\n" +
                "The mighty roar of the Russian guns\n" +
                "And as we race towards human wall\n" +
                "The screams of pain as my comrades fall\n\n";

        lyrics += "We hurdle bodies that lay on the ground\n" +
                "And as the Russians fire another round\n" +
                "We get so near yet so far away\n" +
                "We won't live to fight another day\n\n";

        lyrics += "We get so close near enough to fight\n" +
                "When a Russian gets me in his sights\n" +
                "He pulls the trigger and I feel the blow\n" +
                "A burst of rounds takes my horse below\n\n";

        lyrics += "And as I lay there gazing at the sky\n" +
                "My body's numb and my throat is dry\n" +
                "And as I lay forgotten and alone\n" +
                "Without a tear I draw my parting groan\n\n";

        printLyrics(lyrics);
    }
}
