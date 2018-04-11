package com.example.android.tictactoe;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class HumanPlayer extends AppCompatActivity {

    //This is a global variable for all the  buttons plus reset button.
    private Button button1,button2,button3,button4,button5,
                   button6,button7,button8,button9,
                   show5,reset;

    /**
     * This are variable for the score
     */
    private int playerX_score ;
    private int playerO_score ;



    //set a chosen text to a button.
    private void play(Button button) {
        //check if board is empty
        if (button.getText().toString().equals("")) {
            String player;

            RadioButton playX = findViewById(R.id.playerX);
            RadioButton playO = findViewById(R.id.playerO);
            if (playX.isChecked()) {
                player = "X";
                button.setText(player);
                playX.setChecked(false);
                playO.setChecked(true);
            } else if (playO.isChecked()) {
                playX.setChecked(true);
                player = "O";
                button.setText(player);
            }
        }
        //gameEnd5();
        gameEnd();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human_player);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);

        show5 = findViewById(R.id.show5);
        reset = findViewById(R.id.reset);

        //initializing the remaining button visibility. So, it wont show when lunch until button click.



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button2);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button3);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button4);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button5);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button6);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button7);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button8);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button9);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetBoard();
            }
        });

        //This button change its text to another textString to reveal the other buttons and display the hidden button when called.
        show5 =   findViewById(R.id.show5);
        show5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                increaseToFive();
            }
        });
    }

    //This endGame method will display the winner.
    private void gameEnd() {

        String btn1 = button1.getText().toString();
        String btn2 = button2.getText().toString();
        String btn3 = button3.getText().toString();
        String btn4 = button4.getText().toString();
        String btn5 = button5.getText().toString();
        String btn6 = button6.getText().toString();
        String btn7 = button7.getText().toString();
        String btn8 = button8.getText().toString();
        String btn9 = button9.getText().toString();

        //This check the moves for Player X if it wins.
        if (btn1.equals("X") && btn2.equals("X") && btn3.equals("X")) {
            Toast.makeText(HumanPlayer.this, "Congrats! Player X WON!", Toast.LENGTH_LONG).show();
            playerX_score++;
            displayForPlayerX(playerX_score);
            resetBoard();

        }
        if (btn1.equals("X") && btn4.equals("X") && btn7.equals("X")) {
            Toast.makeText(HumanPlayer.this, "Congrats! Player X WON!", Toast.LENGTH_LONG).show();
            playerX_score = +1;
            displayForPlayerX(playerX_score);
            resetBoard();
        }
        if (btn1.equals("X") && btn5.equals("X") && btn9.equals("X")) {
            Toast.makeText(HumanPlayer.this, "Congrats! Player X WON!", Toast.LENGTH_LONG).show();
            playerX_score = +1;
            displayForPlayerX(playerX_score);
            resetBoard();
        }
        if (btn3.equals("X") && btn6.equals("X") && btn9.equals("X")) {
            Toast.makeText(HumanPlayer.this, "Congrats! Player X WON!", Toast.LENGTH_LONG).show();
            playerX_score = +1;
            displayForPlayerX(playerX_score);
            resetBoard();

        }
        if (btn3.equals("X") && btn5.equals("X") && btn7.equals("X")) {
            Toast.makeText(HumanPlayer.this, "Congrats! Player X WON!", Toast.LENGTH_LONG).show();
            playerX_score = +1;
            displayForPlayerX(playerX_score);
            resetBoard();

        }
        if (btn7.equals("X") && btn8.equals("X") && btn9.equals("X")) {
            Toast.makeText(HumanPlayer.this, "Congrats! Player X WON!", Toast.LENGTH_LONG).show();
            playerX_score = +1;
            displayForPlayerX(playerX_score);
            resetBoard();
        }
        if (btn4.equals("X") && btn5.equals("X") && btn6.equals("X")) {
            Toast.makeText(HumanPlayer.this, "Congrats! Player X WON!", Toast.LENGTH_LONG).show();
            playerX_score = +1;
            displayForPlayerX(playerX_score);
            resetBoard();
        }
        if (btn2.equals("X") && btn5.equals("X") && btn8.equals("X")) {
            Toast.makeText(HumanPlayer.this, "Congrats! Player X WON!", Toast.LENGTH_LONG).show();
            playerX_score = +1;
            displayForPlayerX(playerX_score);
            resetBoard();
        }


        //This check the moves for Player O if it wins.
        if (btn1.equals("O") && btn2.equals("O") && btn3.equals("O")) {
            Toast.makeText(HumanPlayer.this, "Congrats! Player O WON!", Toast.LENGTH_LONG).show();
            playerO_score += 1;
            displayForPlayerO(playerO_score);
            resetBoard();

        }
        if (btn1.equals("O") && btn4.equals("O") && btn7.equals("O")) {
            Toast.makeText(HumanPlayer.this, "Congrats! Player O WON!", Toast.LENGTH_LONG).show();
            playerO_score += 1;
            displayForPlayerO(playerO_score);
            resetBoard();
        }
        if (btn1.equals("O") && btn5.equals("O") && btn9.equals("O")) {
            Toast.makeText(HumanPlayer.this, "Congrats! Player O WON!", Toast.LENGTH_LONG).show();
            playerO_score += 1;
            displayForPlayerO(playerO_score);
            resetBoard();
        }
        if (btn3.equals("O") && btn6.equals("O") && btn9.equals("O")) {
            Toast.makeText(HumanPlayer.this, "Congrats! Player O WON!", Toast.LENGTH_LONG).show();
            playerO_score += 1;
            displayForPlayerO(playerO_score);
            resetBoard();
        }
        if (btn3.equals("O") && btn5.equals("O") && btn7.equals("O")) {
            Toast.makeText(HumanPlayer.this, "Congrats! Player O WON!", Toast.LENGTH_LONG).show();
            playerO_score += 1;
            displayForPlayerO(playerO_score);
            resetBoard();
        }
        if (btn7.equals("O") && btn8.equals("O") && btn9.equals("O")) {
            Toast.makeText(HumanPlayer.this, "Congrats! Player O WON!", Toast.LENGTH_LONG).show();
            playerO_score += 1;
            displayForPlayerO(playerO_score);
            resetBoard();
        }
        if (btn4.equals("O") && btn5.equals("O") && btn6.equals("O")) {
            Toast.makeText(HumanPlayer.this, "Congrats! Player O WON!", Toast.LENGTH_LONG).show();
            playerO_score += 1;
            displayForPlayerO(playerO_score);
            resetBoard();
        }
        if (btn2.equals("O") && btn5.equals("O") && btn8.equals("O")) {
            Toast.makeText(HumanPlayer.this, "Congrats! Player O WON!", Toast.LENGTH_LONG).show();
            playerO_score += 1;
            displayForPlayerO(playerO_score);
            resetBoard();
        }


    }

   //This activity open game versus the computer.
   public void increaseToFive(){
       Intent intent = new Intent(this, humanChangeToFive.class );
       startActivity(intent);
       onBackPressed();

   }

    // This method will rest the whole button to an empty string when clicked.
    public void resetBoard( ) {

        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
           }

    /**
     * Displays the given score for Player X.
     */
    private void displayForPlayerX(int score) {
        TextView scoreView = findViewById(R.id.playerX_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Player O.
     */
    private void displayForPlayerO(int score) {
        TextView scoreView = findViewById(R.id.playerO_score);
        scoreView.setText(String.valueOf(score));
    }
    @Override
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }


}
