package ly.generalassemb.drewmahrt.tictactoe;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    //Saves space for buttons.
    private Button[] mButtons = new Button[10];
    //The squares will be identified as integers.
    private int count;
    //Saves space for textview.
    private TextView textView;
    //Changes string name to tag to identify on getIntent when the Activity starts and with every turn.
    String playerOne, playerTwo;
    public static final String PLAYER_ONE_TAG = "playerOne";
    public static final String PLAYER_TWO_TAG = "playerTwo";
    //I'm sure there is a way for me to get the winner in the buttonOnClick method, but for now I will explore this.
    private String[] board;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //Declare Buttons & TextView
        mButtons[1] = (Button) (findViewById(R.id.a1));
        mButtons[2] = (Button) (findViewById(R.id.a2));
        mButtons[3] = (Button) (findViewById(R.id.a3));
        mButtons[4] = (Button) (findViewById(R.id.b1));
        mButtons[5] = (Button) (findViewById(R.id.b2));
        mButtons[6] = (Button) (findViewById(R.id.b3));
        mButtons[7] = (Button) (findViewById(R.id.c1));
        mButtons[8] = (Button) (findViewById(R.id.c2));
        mButtons[9] = (Button) (findViewById(R.id.c3));

        textView = (TextView) (findViewById(R.id.game_message_text));

        //Getting intent from MainActivity.
        //Need to fix textView alternating name.
        Intent oldIntent = getIntent();
        playerOne = oldIntent.getStringExtra(PLAYER_ONE_TAG);
        playerTwo = oldIntent.getStringExtra(PLAYER_TWO_TAG);
        textView.setText(playerOne + "'s Turn");

        SharedPreferences sharedPreferences = getSharedPreferences("UniqueCode", Context.MODE_PRIVATE);

    }

    //Place all buttons under one method by applying android:onClick="buttonOnClick".
    public void buttonOnClick(View v) {
        count++;
        boolean playerOneClicked = true;

        switch (v.getId()) {
            case R.id.a1:
                if (count % 2 == 0 && playerOneClicked) {
                    mButtons[1].setText("O");
                    textView.setText(playerTwo + "'s Turn");
                    //Allows user to click on the button once.
                    v.setClickable(false);
                    break;

                } else {
                    mButtons[1].setText("X");
                    textView.setText(playerOne + "'s Turn");
                    v.setClickable(false);
                    break;
                }

            case R.id.a2:
                if (count % 2 == 0 && playerOneClicked) {
                    mButtons[2].setText("O");
                    textView.setText(playerTwo + "'s Turn");
                    v.setClickable(false);
                    break;

                } else {
                    mButtons[2].setText("X");
                    textView.setText(playerOne + "'s Turn");
                    v.setClickable(false);
                    break;
                }

            case R.id.a3:
                if (count % 2 == 0 && playerOneClicked) {
                    mButtons[3].setText("O");
                    textView.setText(playerTwo + "'s Turn");
                    v.setClickable(false);
                    break;

                } else {
                    mButtons[3].setText("X");
                    textView.setText(playerOne + "'s Turn");
                    v.setClickable(false);
                    break;
                }

            case R.id.b1:
                if (count % 2 == 0 && playerOneClicked) {
                    mButtons[4].setText("O");
                    textView.setText(playerTwo + "'s Turn");
                    v.setClickable(false);
                    break;

                } else {
                    mButtons[4].setText("X");
                    textView.setText(playerOne + "'s Turn");
                    v.setClickable(false);
                    break;
                }

            case R.id.b2:
                if (count % 2 == 0 && playerOneClicked) {
                    mButtons[5].setText("O");
                    textView.setText(playerTwo + "'s Turn");
                    v.setClickable(false);
                    break;

                } else {
                    mButtons[5].setText("X");
                    textView.setText(playerOne + "'s Turn");
                    v.setClickable(false);
                    break;
                }

            case R.id.b3:
                if (count % 2 == 0 && playerOneClicked) {
                    mButtons[6].setText("O");
                    textView.setText(playerTwo + "'s Turn");
                    v.setClickable(false);
                    break;

                } else {
                    mButtons[6].setText("X");
                    textView.setText(playerOne + "'s Turn");
                    v.setClickable(false);
                    break;
                }

            case R.id.c1:
                if (count % 2 == 0 && playerOneClicked) {
                    mButtons[7].setText("O");
                    textView.setText(playerTwo + "'s Turn");
                    v.setClickable(false);
                    break;

                } else {
                    mButtons[7].setText("X");
                    textView.setText(playerOne + "'s Turn");
                    v.setClickable(false);
                    break;
                }

            case R.id.c2:
                if (count % 2 == 0 && playerOneClicked) {
                    mButtons[8].setText("O");
                    textView.setText(playerTwo + "'s Turn");
                    v.setClickable(false);
                    break;

                } else {
                    mButtons[8].setText("X");
                    textView.setText(playerOne + "'s Turn");
                    v.setClickable(false);
                    break;
                }

            case R.id.c3:
                if (count % 2 == 0 && playerOneClicked) {
                    mButtons[9].setText("O");
                    textView.setText(playerTwo + "'s Turn");
                    v.setClickable(false);
                    break;

                } else {
                    mButtons[9].setText("X");
                    textView.setText(playerOne + "'s Turn");
                    v.setClickable(false);
                    break;
                }
        }
    }

    public boolean winner() {
        board = new String [10];
        board[1] = mButtons[1].getText().toString();
        board[2] = mButtons[2].getText().toString();
        board[3] = mButtons[3].getText().toString();
        board[4] = mButtons[4].getText().toString();
        board[5] = mButtons[5].getText().toString();
        board[6] = mButtons[6].getText().toString();
        board[7] = mButtons[7].getText().toString();
        board[8] = mButtons[8].getText().toString();
        board[9] = mButtons[9].getText().toString();

        int one;
        int two;

        for (int i = 0; i < board.length; i++) {
            one = 0;
            two = 0;
            if(board[i].equals("X")) {
                one++;

            }else if (board[i].equals("O")) {
                two++;

            }if (one == 3) {
                textView.setText(playerOne + " Wins!");
                return true;

            }if (two == 3) {
                textView.setText(playerTwo + " Wins!");
                return true;
            }
        }

        return false;
    }

}
