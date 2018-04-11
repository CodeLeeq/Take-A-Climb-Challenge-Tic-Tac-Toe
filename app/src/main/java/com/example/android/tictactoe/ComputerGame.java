package com.example.android.tictactoe;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Random;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;



public class ComputerGame extends AppCompatActivity {

    int c[][];
     int i, j = 0;
     Button btn[][];
     algorithm computer;
    private Button show5;
    private Button reset;

     //variable to display score
      private int computer_score = 0 ;
    private int humanscore = 0 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_game);

        setBoard();

        reset = findViewById(R.id.reset);
        show5 = findViewById(R.id.show5);

        //This method respond once the button is clicked, it will change the board to 5x5.
        show5 =  findViewById(R.id.show5);
        show5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                increaseToFive();
            }
        });




        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Resets the board once the button is clicked.
                resetBoard();
                //This method set the board for new game.
                setBoard();
            }
        });
    }

    private void setBoard() {
          computer = new algorithm();
          btn = new Button[4][4];
          c = new int[4][4];





          btn[1][3] =   findViewById(R.id.button1_1);
          btn[1][2] =   findViewById(R.id.button1_2);
          btn[1][1] =   findViewById(R.id.button1_3);


          btn[2][3] =   findViewById(R.id.button2_1);
          btn[2][2] =   findViewById(R.id.button2_2);
          btn[2][1] =   findViewById(R.id.button2_3);


          btn[3][3] =   findViewById(R.id.button3_1);
          btn[3][2] =   findViewById(R.id.button3_2);
          btn[3][1] =   findViewById(R.id.button3_3);

          for (i = 1; i <= 3; i++) {
               for (j = 1; j <= 3; j++)
                    c[i][j] = 2;
          }



          // add the click listeners for each button
          for (i = 1; i <= 3; i++) {
               for (j = 1; j <= 3; j++) {
                    btn[i][j].setOnClickListener(new MyClickListener(i, j));
                    if(!btn[i][j].isEnabled()) {
                         btn[i][j].setText(" ");
                         btn[i][j].setEnabled(true);
                    }
               }
          }
     }

     class MyClickListener implements View.OnClickListener {
          int x;
          int y;


          private MyClickListener(int x, int y) {
               this.x = x;
               this.y = y;
          }


          public void onClick(View view) {
               if (btn[x][y].isEnabled()) {
                    btn[x][y].setEnabled(false);
                    btn[x][y].setText("O");
                    c[x][y] = 0;

                    if (!checkBoard()) {
                         computer.takeTurn();
                    }
               }
          }
     }

     private class algorithm {
          public void takeTurn() {
          if(c[1][1]==2 &&
                    ((c[1][2]==0 && c[1][3]==0) ||
                     (c[2][2]==0 && c[3][3]==0) ||
                     (c[2][1]==0 && c[3][1]==0))) {
               markSquare(1,1);
          } else if (c[1][2]==2 &&
                    ((c[2][2]==0 && c[3][2]==0) ||
                     (c[1][1]==0 && c[1][3]==0))) {
               markSquare(1,2);
          } else if(c[1][3]==2 &&
                    ((c[1][1]==0 && c[1][2]==0) ||
                     (c[3][1]==0 && c[2][2]==0) ||
                     (c[2][3]==0 && c[3][3]==0))) {
               markSquare(1,3);
          } else if(c[2][1]==2 &&
                    ((c[2][2]==0 && c[2][3]==0) ||
                     (c[1][1]==0 && c[3][1]==0))){
               markSquare(2,1);
          } else if(c[2][2]==2 &&
                    ((c[1][1]==0 && c[3][3]==0) ||
                     (c[1][2]==0 && c[3][2]==0) ||
                     (c[3][1]==0 && c[1][3]==0) ||
                     (c[2][1]==0 && c[2][3]==0))) {
               markSquare(2,2);
          } else if(c[2][3]==2 &&
                    ((c[2][1]==0 && c[2][2]==0) ||
                     (c[1][3]==0 && c[3][3]==0))) {
               markSquare(2,3);
          } else if(c[3][1]==2 &&
                    ((c[1][1]==0 && c[2][1]==0) ||
                     (c[3][2]==0 && c[3][3]==0) ||
                     (c[2][2]==0 && c[1][3]==0))){
               markSquare(3,1);
          } else if(c[3][2]==2 &&
                    ((c[1][2]==0 && c[2][2]==0) ||
                     (c[3][1]==0 && c[3][3]==0))) {
               markSquare(3,2);
          }else if( c[3][3]==2 &&
                    ((c[1][1]==0 && c[2][2]==0) ||
                     (c[1][3]==0 && c[2][3]==0) ||
                     (c[3][1]==0 && c[3][2]==0))) {
               markSquare(3,3);
          } else {
               Random rand = new Random();

               int a = rand.nextInt(4);
               int b = rand.nextInt(4);
               while(a==0 || b==0 || c[a][b]!=2) {
                    a = rand.nextInt(4);
                    b = rand.nextInt(4);
               }
               markSquare(a,b);
          }
     }


          private void markSquare(int x, int y) {
               btn[x][y].setEnabled(false);
               btn[x][y].setText("X");
               c[x][y] = 1;
               checkBoard();
          }
     }

     // check the board to see if someone has won
     private boolean checkBoard() {
          boolean gameOver = false;
          if ((c[1][1] == 0 && c[2][2] == 0 && c[3][3] == 0)
                    || (c[1][3] == 0 && c[2][2] == 0 && c[3][1] == 0)
                    || (c[1][2] == 0 && c[2][2] == 0 && c[3][2] == 0)
                    || (c[1][3] == 0 && c[2][3] == 0 && c[3][3] == 0)
                    || (c[1][1] == 0 && c[1][2] == 0 && c[1][3] == 0)
                    || (c[2][1] == 0 && c[2][2] == 0 && c[2][3] == 0)
                    || (c[3][1] == 0 && c[3][2] == 0 && c[3][3] == 0)
                    || (c[1][1] == 0 && c[2][1] == 0 && c[3][1] == 0)) {
              android.widget.Toast.makeText(ComputerGame.this, "Congrats! You Win!", Toast.LENGTH_LONG).show();
              humanscore++;
              displayForHuman(humanscore);
              //gameOver = true;
              resetBoard();


          } else if ((c[1][1] == 1 && c[2][2] == 1 && c[3][3] == 1)
                    || (c[1][3] == 1 && c[2][2] == 1 && c[3][1] == 1)
                    || (c[1][2] == 1 && c[2][2] == 1 && c[3][2] == 1)
                    || (c[1][3] == 1 && c[2][3] == 1 && c[3][3] == 1)
                    || (c[1][1] == 1 && c[1][2] == 1 && c[1][3] == 1)
                    || (c[2][1] == 1 && c[2][2] == 1 && c[2][3] == 1)
                    || (c[3][1] == 1 && c[3][2] == 1 && c[3][3] == 1)
                    || (c[1][1] == 1 && c[2][1] == 1 && c[3][1] == 1)) {
              android.widget.Toast.makeText(ComputerGame.this, "Awwww! You Lost!", Toast.LENGTH_LONG).show();
              computer_score++;
              displayForComputer(computer_score);
              //gameOver = true;
              resetBoard();


          } else {
               boolean empty = false;
               for(i=1; i<=3; i++) {
                    for(j=1; j<=3; j++) {
                         if(c[i][j]==2) {
                              empty = true;
                              break;
                         }
                    }
               }
               if(!empty) {
                    gameOver = true;
                    android.widget.Toast.makeText(ComputerGame.this, "Good Job! Its a Tie!", Toast.LENGTH_LONG).show();
                   resetBoard();
               }
          }
          return gameOver;

     }
    // This method will rest the whole button to an empty string when clicked.
    public void resetBoard( ) {

        for (i = 1; i <= 3; i++) {
            for (j = 1; j <= 3; j++) {
                btn[i][j].setText(" ");
                btn[i][j].setEnabled(true);
            }
        }
        setBoard();
    }

    public void increaseToFive(){
        Intent intent = new Intent(this, compChangeToFive.class );
        startActivity(intent);
        onBackPressed();

    }

    /**
     * Displays the given score for Player X.
     */
    private void displayForComputer(int score) {
        TextView scoreView = findViewById(R.id.computer_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Player O.
     */
    private void displayForHuman(int score) {
        TextView scoreView = findViewById(R.id.human_score);
        scoreView.setText(String.valueOf(score));
    }
}
