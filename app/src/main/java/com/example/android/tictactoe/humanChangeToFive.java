package com.example.android.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class humanChangeToFive extends AppCompatActivity {

    //This is a global variable for all the  buttons plus reset button.
    private Button button1_1,button1_2,button1_3,button1_4,button1_5,
                   button2_1,button2_2,button2_3,button2_4,button2_5,
                   button3_1,button3_2,button3_3,button3_4,button3_5,
                   button4_1,button4_2,button4_3,button4_4,button4_5,
                   button5_1,button5_2,button5_3,button5_4,button5_5,
                   show3,reset;

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
        gameEnd();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human_change_to_five);

        button1_1 = findViewById(R.id.button1_1);
        button1_2 = findViewById(R.id.button1_2);
        button1_3 = findViewById(R.id.button1_3);
        button1_4 = findViewById(R.id.button1_4);
        button1_5 = findViewById(R.id.button1_5);

        button2_1 = findViewById(R.id.button2_1);
        button2_2 = findViewById(R.id.button2_2);
        button2_3 = findViewById(R.id.button2_3);
        button2_4 = findViewById(R.id.button2_4);
        button2_5 = findViewById(R.id.button2_5);

        button3_1 = findViewById(R.id.button3_1);
        button3_2 = findViewById(R.id.button3_2);
        button3_3 = findViewById(R.id.button3_3);
        button3_4 = findViewById(R.id.button3_4);
        button3_5 = findViewById(R.id.button3_5);

        button4_1 = findViewById(R.id.button4_1);
        button4_2 = findViewById(R.id.button4_2);
        button4_3 = findViewById(R.id.button4_3);
        button4_4 = findViewById(R.id.button4_4);
        button4_5 = findViewById(R.id.button4_5);

        button5_1 = findViewById(R.id.button5_1);
        button5_2 = findViewById(R.id.button5_2);
        button5_3 = findViewById(R.id.button5_3);
        button5_4 = findViewById(R.id.button5_4);
        button5_5 = findViewById(R.id.button5_5);

        show3 = findViewById(R.id.show3);
        reset = findViewById(R.id.reset);


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
        button1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button1_3);
            }
        });
        button1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button1_4);
            }
        });
        button1_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button1_5);
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
        button2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button2_3);
            }
        });
        button2_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button2_4);
            }
        });
        button2_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button2_5);
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
        button3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button3_3);
            }
        });
        button3_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button3_4);
            }
        });
        button3_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button3_5);
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
        button4_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button4_3);
            }
        });
        button4_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button4_4);
            }
        });
        button4_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button4_5);
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
        button5_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button5_3);
            }
        });
        button5_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button5_4);
            }
        });
        button5_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(button5_5);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetBoard();
            }
        });

        show3 =  findViewById(R.id.show3);
        show3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decreaseToThree();
            }
        });


    }

    //This endGame method will display the winner.
    private void gameEnd() {

        String btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,
                btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,
                btn21,btn22,btn23,btn24,btn25;

          btn1 = button1_1.getText().toString();
         btn2 = button1_2.getText().toString();
         btn3 = button1_3.getText().toString();
         btn4 = button1_4.getText().toString();
         btn5 = button1_5.getText().toString();

        btn6 = button2_1.getText().toString();
        btn7 = button2_2.getText().toString();
        btn8 = button2_3.getText().toString();
        btn9 = button2_4.getText().toString();
        btn10 = button2_5.getText().toString();

        btn11 = button3_1.getText().toString();
        btn12 = button3_2.getText().toString();
        btn13 = button3_3.getText().toString();
        btn14 = button3_4.getText().toString();
        btn15 = button3_5.getText().toString(); // This is where i stop for the game win code.

        btn16 = button4_1.getText().toString();
        btn17 = button4_2.getText().toString();
        btn18 = button4_3.getText().toString();
        btn19 = button4_4.getText().toString();
        btn20 = button4_5.getText().toString();

        btn21 = button5_1.getText().toString();
        btn22 = button5_2.getText().toString();
        btn23 = button5_3.getText().toString();
        btn24 = button5_4.getText().toString();
        btn25 = button5_5.getText().toString();


        //This check the moves for Player X if it wins.
        if (btn1.equals("X") && btn2.equals("X") && btn3.equals("X") && btn4.equals("X") && btn5.equals("X")) {
            Toast.makeText(humanChangeToFive.this, "Congrats! Player X WON!", Toast.LENGTH_LONG).show();
            playerX_score++;
            displayForPlayerX(playerX_score);
            resetBoard();

        }// checks for the left horizontal win.
        if (btn1.equals("X") && btn6.equals("X") && btn11.equals("X") && btn16.equals("X") && btn21.equals("X")) {
            Toast.makeText(humanChangeToFive.this, "Congrats! Player X WON!", Toast.LENGTH_LONG).show();
            playerX_score = +1;
            displayForPlayerX(playerX_score);
            resetBoard();
        }// checks the right horizontal win.
        if (btn5.equals("X") && btn10.equals("X") && btn15.equals("X")&& btn20.equals("X") && btn25.equals("X")) {
            Toast.makeText(humanChangeToFive.this, "Congrats! Player X WON!", Toast.LENGTH_LONG).show();
            playerX_score = +1;
            displayForPlayerX(playerX_score);
            resetBoard();
        }//Lower vertical win.
        if (btn21.equals("X") && btn22.equals("X") && btn23.equals("X") && btn24.equals("X") && btn25.equals("X")) {
            Toast.makeText(humanChangeToFive.this, "Congrats! Player X WON!", Toast.LENGTH_LONG).show();
            playerX_score = +1;
            displayForPlayerX(playerX_score);
            resetBoard();

        }//Checks second row vertically.
        if (btn6.equals("X") && btn7.equals("X") && btn8.equals("X") && btn9.equals("X") && btn10.equals("X")) {
            Toast.makeText(humanChangeToFive.this, "Congrats! Player X WON!", Toast.LENGTH_LONG).show();
            playerX_score = +1;
            displayForPlayerX(playerX_score);
            resetBoard();

        }//checks vertical line from 11 - 15.
        if (btn11.equals("X") && btn12.equals("X") && btn13.equals("X") && btn14.equals("X") && btn15.equals("X")) {
            Toast.makeText(humanChangeToFive.this, "Congrats! Player X WON!", Toast.LENGTH_LONG).show();
            playerX_score = +1;
            displayForPlayerX(playerX_score);
            resetBoard();
        }
        //check vertical line from 16 -20.
        if (btn16.equals("X") && btn17.equals("X") && btn18.equals("X") && btn19.equals("X") && btn20.equals("X")) {
            Toast.makeText(humanChangeToFive.this, "Congrats! Player X WON!", Toast.LENGTH_LONG).show();
            playerX_score = +1;
            displayForPlayerX(playerX_score);
            resetBoard();
        }//check diagonal from right to left.
        if (btn5.equals("X") && btn9.equals("X") && btn13.equals("X") && btn17.equals("X") && btn21.equals("X")) {
            Toast.makeText(humanChangeToFive.this, "Congrats! Player X WON!", Toast.LENGTH_LONG).show();
            playerX_score = +1;
            displayForPlayerX(playerX_score);
            resetBoard();
        }//check diagonal from left to right.
        if (btn1.equals("X") && btn7.equals("X") && btn13.equals("X") && btn19.equals("X") && btn25.equals("X")) {
            Toast.makeText(humanChangeToFive.this, "Congrats! Player X WON!", Toast.LENGTH_LONG).show();
            playerX_score = +1;
            displayForPlayerX(playerX_score);
            resetBoard();
        }//check second column horizontally.
        if (btn2.equals("X") && btn7.equals("X") && btn12.equals("X") && btn17.equals("X") && btn22.equals("X")) {
            Toast.makeText(humanChangeToFive.this, "Congrats! Player X WON!", Toast.LENGTH_LONG).show();
            playerX_score = +1;
            displayForPlayerX(playerX_score);
            resetBoard();
        }//check third column horizontally.
        if (btn3.equals("X") && btn8.equals("X") && btn13.equals("X") && btn18.equals("X") && btn23.equals("X")) {
            Toast.makeText(humanChangeToFive.this, "Congrats! Player X WON!", Toast.LENGTH_LONG).show();
            playerX_score = +1;
            displayForPlayerX(playerX_score);
            resetBoard();
        }//check fourth column horizontally.
        if (btn4.equals("X") && btn9.equals("X") && btn14.equals("X") && btn19.equals("X") && btn24.equals("X")) {
            Toast.makeText(humanChangeToFive.this, "Congrats! Player X WON!", Toast.LENGTH_LONG).show();
            playerX_score = +1;
            displayForPlayerX(playerX_score);
            resetBoard();
        }


        //This check the moves for Player O if it wins.
        if (btn1.equals("O") && btn2.equals("O") && btn3.equals("O") && btn4.equals("O") && btn5.equals("O")) {
            Toast.makeText(humanChangeToFive.this, "Congrats! Player O WON!", Toast.LENGTH_LONG).show();
            playerO_score++;
            displayForPlayerO(playerO_score);
            resetBoard();

        }// checks for the left horizontal win.
        if (btn1.equals("O") && btn6.equals("O") && btn11.equals("O") && btn16.equals("O") && btn21.equals("O")) {
            Toast.makeText(humanChangeToFive.this, "Congrats! Player O WON!", Toast.LENGTH_LONG).show();
            playerO_score++;
            displayForPlayerO(playerO_score);
            resetBoard();
        }// checks the right horizontal win.
        if (btn5.equals("O") && btn10.equals("O") && btn15.equals("O")&& btn20.equals("O") && btn25.equals("O")) {
            Toast.makeText(humanChangeToFive.this, "Congrats! Player O WON!", Toast.LENGTH_LONG).show();
            playerO_score++;
            displayForPlayerO(playerO_score);
            resetBoard();
        }//Lower vertical win.
        if (btn21.equals("O") && btn22.equals("O") && btn23.equals("O") && btn24.equals("O") && btn25.equals("O")) {
            Toast.makeText(humanChangeToFive.this, "Congrats! Player O WON!", Toast.LENGTH_LONG).show();
            playerO_score++;
            displayForPlayerO(playerO_score);
            resetBoard();

        }//Checks second row vertically.
        if (btn6.equals("O") && btn7.equals("O") && btn8.equals("O") && btn9.equals("O") && btn10.equals("O")) {
            Toast.makeText(humanChangeToFive.this, "Congrats! Player O WON!", Toast.LENGTH_LONG).show();
            playerO_score++;
            displayForPlayerO(playerO_score);
            resetBoard();

        }//checks vertical line from 11 - 15.
        if (btn11.equals("O") && btn12.equals("O") && btn13.equals("O") && btn14.equals("O") && btn15.equals("O")) {
            Toast.makeText(humanChangeToFive.this, "Congrats! Player O WON!", Toast.LENGTH_LONG).show();
            playerO_score++;
            displayForPlayerO(playerO_score);
            resetBoard();
        }
        //check vertical line from 16 -20.
        if (btn16.equals("O") && btn17.equals("O") && btn18.equals("O") && btn19.equals("O") && btn20.equals("O")) {
            Toast.makeText(humanChangeToFive.this, "Congrats! Player O WON!", Toast.LENGTH_LONG).show();
            playerO_score++;
            displayForPlayerO(playerO_score);
            resetBoard();
        }//check diagonal from right to left.
        if (btn5.equals("O") && btn9.equals("O") && btn13.equals("O") && btn17.equals("O") && btn21.equals("O")) {
            Toast.makeText(humanChangeToFive.this, "Congrats! Player O WON!", Toast.LENGTH_LONG).show();
            playerO_score++;
            displayForPlayerO(playerO_score);
            resetBoard();
        }//check diagonal from left to right.
        if (btn1.equals("O") && btn7.equals("O") && btn13.equals("O") && btn19.equals("O") && btn25.equals("O")) {
            Toast.makeText(humanChangeToFive.this, "Congrats! Player O WON!", Toast.LENGTH_LONG).show();
            playerO_score++;
            displayForPlayerO(playerO_score);
            resetBoard();
        }//check second column horizontally.
        if (btn2.equals("O") && btn7.equals("O") && btn12.equals("O") && btn17.equals("O") && btn22.equals("O")) {
            Toast.makeText(humanChangeToFive.this, "Congrats! Player O WON!", Toast.LENGTH_LONG).show();
            playerO_score++;
            displayForPlayerO(playerO_score);
            resetBoard();
        }//check third column horizontally.
        if (btn3.equals("O") && btn8.equals("O") && btn13.equals("O") && btn18.equals("O") && btn23.equals("O")) {
            Toast.makeText(humanChangeToFive.this, "Congrats! Player O WON!", Toast.LENGTH_LONG).show();
            playerO_score++;
            displayForPlayerO(playerO_score);
            resetBoard();
        }//check fourth column horizontally.
        if (btn4.equals("O") && btn9.equals("O") && btn14.equals("O") && btn19.equals("O") && btn24.equals("O")) {
            Toast.makeText(humanChangeToFive.this, "Congrats! Player X WON!", Toast.LENGTH_LONG).show();
            playerO_score++;
            displayForPlayerO(playerO_score);
            resetBoard();
        }
        //if no score added, just display its a draw.
       /* if (playerX_score == 0 && playerO_score == 0) {
            Toast.makeText(HumanPlayer.this, "Well Done! Its a Draw!", Toast.LENGTH_LONG).show();
            */


    }

    public void decreaseToThree(){
        Intent intent = new Intent(this, HumanPlayer.class );
        startActivity(intent);
    }

    // This method will rest the whole button to an empty string when clicked.
    public void resetBoard( ) {

        button1_1.setText("");
        button1_2.setText("");
        button1_3.setText("");
        button1_4.setText("");
        button1_5.setText("");

        button2_1.setText("");
        button2_2.setText("");
        button2_3.setText("");
        button2_4.setText("");
        button2_5.setText("");

        button3_1.setText("");
        button3_2.setText("");
        button3_3.setText("");
        button3_4.setText("");
        button3_5.setText("");

        button4_1.setText("");
        button4_2.setText("");
        button4_3.setText("");
        button4_4.setText("");
        button4_5.setText("");

        button5_1.setText("");
        button5_2.setText("");
        button5_3.setText("");
        button5_4.setText("");
        button5_5.setText("");

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
