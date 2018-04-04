package com.example.android.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ComputerGame extends AppCompatActivity {

    int player;
    int computer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_game);
    }
}
