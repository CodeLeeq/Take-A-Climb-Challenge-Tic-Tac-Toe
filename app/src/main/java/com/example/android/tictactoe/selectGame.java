package com.example.android.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class selectGame extends AppCompatActivity {

    private Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_game);

        button1 = (Button) findViewById(R.id.buttonVsComp);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGameVsComputer();
            }
        });

        button2 = (Button) findViewById(R.id.buttonVsFriend);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGameVsHuman();
            }
        });
    }
    //This activity open game versus the computer.
    public void openGameVsComputer(){
        Intent intent = new Intent(this, ComputerGame.class );
        startActivity(intent);
    }
    //This activity open game versus human player.
    public void openGameVsHuman(){
        Intent intent = new Intent(this, HumanPlayer.class );
        startActivity(intent);
    }
}
