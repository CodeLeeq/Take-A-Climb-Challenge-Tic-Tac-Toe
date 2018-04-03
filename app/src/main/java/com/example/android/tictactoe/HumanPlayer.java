package com.example.android.tictactoe;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class HumanPlayer extends AppCompatActivity {

    //This is a global variable for all the 9 buttons plus rest button.
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button1_1;
    private Button button1_2;
    private Button button2_1;
    private Button button2_2;
    private Button button3_1;
    private Button button3_2;
    private Button button4_1;
    private Button button4_2;
    private Button button5_1;
    private Button button5_2;
    private Button show5;
    private Button reset;

    /**
     * This are variable for the score
     */
    private int playerX_score ;
    private int playerO_score ;


    /**
     * RadioButton playX = (RadioButton) findViewById(R.id.playerX);
     * boolean Xturn = playX.isChecked();
     * <p>
     * RadioButton playO = (RadioButton) findViewById(R.id.playerX);
     * boolean Oturn = playO.isChecked();
     */
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
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        button1_1 = findViewById(R.id.button1_1);
        button1_2 = findViewById(R.id.button1_2);
        button2_1 = findViewById(R.id.button2_1);
        button2_2 = findViewById(R.id.button2_2);
        button3_1 = findViewById(R.id.button3_1);
        button3_2 = findViewById(R.id.button3_2);
        button4_1 = findViewById(R.id.button4_1);
        button4_2 = findViewById(R.id.button4_2);
        button5_1 = findViewById(R.id.button5_1);
        button5_2 = findViewById(R.id.button5_2);
        show5 = findViewById(R.id.show5);
        reset = findViewById(R.id.reset);
        //initializing the remaining button visibility.
        button10.setVisibility(View.GONE);
        button11.setVisibility(View.GONE);
        button12.setVisibility(View.GONE);
        button13.setVisibility(View.GONE);
        button14.setVisibility(View.GONE);
        button15.setVisibility(View.GONE);
        button1_1.setVisibility(View.GONE);
        button1_2.setVisibility(View.GONE);
        button2_1.setVisibility(View.GONE);
        button2_2.setVisibility(View.GONE);
        button3_1.setVisibility(View.GONE);
        button3_2.setVisibility(View.GONE);
        button4_1.setVisibility(View.GONE);
        button4_2.setVisibility(View.GONE);
        button5_1.setVisibility(View.GONE);
        button5_2.setVisibility(View.GONE);


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
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button10);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button11);
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button12);
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button13);
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button14);
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button15);
            }
        });
        button1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button1_1);
            }
        });
        button1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button1_2);
            }
        });
        button2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button2_1);
            }
        });
        button2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button2_2);
            }
        });
        button3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button3_1);
            }
        });
        button3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button3_2);
            }
        });
        button4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button4_1);
            }
        });
        button4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button4_2);
            }
        });
        button5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button5_1);
            }
        });
        button5_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button5_2);
            }
        });

        //This button change its text to another textString to reveal the other buttons and display the hidden button when called.
        show5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String curText = String.valueOf(((TextView) view).getText());
                //If the text is "Change to 5", it will make this hidden button visible
                if (curText.equals("Change to 5")) {
                    button10.setVisibility(View.VISIBLE);
                    button11.setVisibility(View.VISIBLE);
                    button12.setVisibility(View.VISIBLE);
                    button13.setVisibility(View.VISIBLE);
                    button14.setVisibility(View.VISIBLE);
                    button15.setVisibility(View.VISIBLE);
                    button1_1.setVisibility(View.VISIBLE);
                    button1_2.setVisibility(View.VISIBLE);
                    button2_1.setVisibility(View.VISIBLE);
                    button2_2.setVisibility(View.VISIBLE);
                    button3_1.setVisibility(View.VISIBLE);
                    button3_2.setVisibility(View.VISIBLE);
                    button4_1.setVisibility(View.VISIBLE);
                    button4_2.setVisibility(View.VISIBLE);
                    button5_1.setVisibility(View.VISIBLE);
                    button5_2.setVisibility(View.VISIBLE);
                    ((TextView) view).setText("Change to 3");
                }
                //If the text is "Change to 3", it will make this button hidden.
                if (curText.equals("Change to 3")) {
                    button10.setVisibility(View.GONE);
                    button11.setVisibility(View.GONE);
                    button12.setVisibility(View.GONE);
                    button13.setVisibility(View.GONE);
                    button14.setVisibility(View.GONE);
                    button15.setVisibility(View.GONE);
                    button1_1.setVisibility(View.GONE);
                    button1_2.setVisibility(View.GONE);
                    button2_1.setVisibility(View.GONE);
                    button2_2.setVisibility(View.GONE);
                    button3_1.setVisibility(View.GONE);
                    button3_2.setVisibility(View.GONE);
                    button4_1.setVisibility(View.GONE);
                    button4_2.setVisibility(View.GONE);
                    button5_1.setVisibility(View.GONE);
                    button5_2.setVisibility(View.GONE);
                    ((TextView) view).setText("Change to 5");
                }


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
            playerX_score = +1;
            displayForPlayerX(playerX_score);

        }
        if (btn1.equals("X") && btn4.equals("X") && btn7.equals("X")) {
            Toast.makeText(HumanPlayer.this, "Congrats! Player X WON!", Toast.LENGTH_LONG).show();
            playerX_score = +1;
            displayForPlayerX(playerX_score);
        }
        if (btn1.equals("X") && btn5.equals("X") && btn9.equals("X")) {
            Toast.makeText(HumanPlayer.this, "Congrats! Player X WON!", Toast.LENGTH_LONG).show();
            playerX_score = +1;
            displayForPlayerX(playerX_score);
        }
        if (btn3.equals("X") && btn6.equals("X") && btn9.equals("X")) {
            Toast.makeText(HumanPlayer.this, "Congrats! Player X WON!", Toast.LENGTH_LONG).show();
            playerX_score = +1;
            displayForPlayerX(playerX_score);

        }
        if (btn3.equals("X") && btn5.equals("X") && btn7.equals("X")) {
            Toast.makeText(HumanPlayer.this, "Congrats! Player X WON!", Toast.LENGTH_LONG).show();
            playerX_score = +1;
            displayForPlayerX(playerX_score);

        }
        if (btn7.equals("X") && btn8.equals("X") && btn9.equals("X")) {
            Toast.makeText(HumanPlayer.this, "Congrats! Player X WON!", Toast.LENGTH_LONG).show();
            playerX_score = +1;
            displayForPlayerX(playerX_score);
        }
        if (btn4.equals("X") && btn5.equals("X") && btn6.equals("X")) {
            Toast.makeText(HumanPlayer.this, "Congrats! Player X WON!", Toast.LENGTH_LONG).show();
            playerX_score = +1;
            displayForPlayerX(playerX_score);
        }
        if (btn2.equals("X") && btn5.equals("X") && btn8.equals("X")) {
            Toast.makeText(HumanPlayer.this, "Congrats! Player X WON!", Toast.LENGTH_LONG).show();
            playerX_score = +1;
            displayForPlayerX(playerX_score);
        }


        //This check the moves for Player O if it wins.
        if (btn1.equals("O") && btn2.equals("O") && btn3.equals("O")) {
            Toast.makeText(HumanPlayer.this, "Congrats! Player O WON!", Toast.LENGTH_LONG).show();
            playerO_score += 1;
            displayForPlayerO(playerO_score);
        }
        if (btn1.equals("O") && btn4.equals("O") && btn7.equals("O")) {
            Toast.makeText(HumanPlayer.this, "Congrats! Player O WON!", Toast.LENGTH_LONG).show();
            playerO_score += 1;
            displayForPlayerO(playerO_score);
        }
        if (btn1.equals("O") && btn5.equals("O") && btn9.equals("O")) {
            Toast.makeText(HumanPlayer.this, "Congrats! Player O WON!", Toast.LENGTH_LONG).show();
            playerO_score += 1;
            displayForPlayerO(playerO_score);
        }
        if (btn3.equals("O") && btn6.equals("O") && btn9.equals("O")) {
            Toast.makeText(HumanPlayer.this, "Congrats! Player O WON!", Toast.LENGTH_LONG).show();
            playerO_score += 1;
            displayForPlayerO(playerO_score);
        }
        if (btn3.equals("O") && btn5.equals("O") && btn7.equals("O")) {
            Toast.makeText(HumanPlayer.this, "Congrats! Player O WON!", Toast.LENGTH_LONG).show();
            playerO_score += 1;
            displayForPlayerO(playerO_score);
        }
        if (btn7.equals("O") && btn8.equals("O") && btn9.equals("O")) {
            Toast.makeText(HumanPlayer.this, "Congrats! Player O WON!", Toast.LENGTH_LONG).show();
            playerO_score += 1;
            displayForPlayerO(playerO_score);
        }
        if (btn4.equals("O") && btn5.equals("O") && btn6.equals("O")) {
            Toast.makeText(HumanPlayer.this, "Congrats! Player O WON!", Toast.LENGTH_LONG).show();
            playerO_score += 1;
            displayForPlayerO(playerO_score);
        }
        if (btn2.equals("O") && btn5.equals("O") && btn8.equals("O")) {
            Toast.makeText(HumanPlayer.this, "Congrats! Player O WON!", Toast.LENGTH_LONG).show();
            playerO_score += 1;
            displayForPlayerO(playerO_score);
        }
        //if no score added, just display its a draw.
        if (playerX_score == 0 && playerO_score == +0) {
            Toast.makeText(HumanPlayer.this, "Well Done! Its a Draw!", Toast.LENGTH_LONG).show();
        }

    }

    // This method will rest the whole button to an empty string when clicked.
    public void resetBoard(View view) {

        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        button10.setText("");
        button11.setText("");
        button12.setText("");
        button13.setText("");
        button14.setText("");
        button15.setText("");
        button1_1.setText("");
        button1_2.setText("");
        button2_1.setText("");
        button2_2.setText("");
        button3_1.setText("");
        button3_2.setText("");
        button4_1.setText("");
        button4_2.setText("");
        button5_1.setText("");
        button5_2.setText("");


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


}
