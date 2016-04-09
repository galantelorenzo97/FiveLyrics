package me.lorenzogalante.android.fivelyrics;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String currentlyPlaying;

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

    private void buySong(){
        if (currentlyPlaying.equals("PinkFloyd"))
        {
            //insert Intent to Play store here
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
        printAlbum("Everlong", "Foo Fighters", "The Colour and the Shape", "1997", "Capitol");
        printLyrics("Hello, ...");
    }

    public void TheBuggles(View view){
        printAlbum("Kid Dynamo", "The Buggles", "The Age of Plastic", "1979", "Island");
        printLyrics("Though today you may be riding the engines of progress...");
    }

    public void Toto(View view){
        printAlbum("Africa", "Toto", "IV", "1982", "Columbia");
        printLyrics("I hear the drums echoing tonight...");
    }

    public void ironMaiden(View view){
        printAlbum("The Trooper", "Iron Maiden", "Piece of Mind", "1983", "Capitol");
        printLyrics("You'll take my life but I'll take yours too...");
    }
}
