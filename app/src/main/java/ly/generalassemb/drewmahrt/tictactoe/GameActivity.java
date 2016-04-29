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
    private Button[] mButtons = new Button[9];
    //The squares will be identified as integers.
    private int count = 0;
    //Saves space for textview.
    private TextView textView;
    //Changes string name to tag to identify on getIntent when the Activity starts and with every turn.
    private String playerOne, playerTwo;
    public static final String PLAYER_ONE_TAG = "playerOne";
    public static final String PLAYER_TWO_TAG = "playerTwo";
    public String lastWinner;
    private boolean currentPlayer;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    String[][] board = new String[3][3];
    public Button mMainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //Declare Buttons & TextView
        mButtons[0] = (Button) (findViewById(R.id.a1));
        mButtons[1] = (Button) (findViewById(R.id.a2));
        mButtons[2] = (Button) (findViewById(R.id.a3));
        mButtons[3] = (Button) (findViewById(R.id.b1));
        mButtons[4] = (Button) (findViewById(R.id.b2));
        mButtons[5] = (Button) (findViewById(R.id.b3));
        mButtons[6] = (Button) (findViewById(R.id.c1));
        mButtons[7] = (Button) (findViewById(R.id.c2));
        mButtons[8] = (Button) (findViewById(R.id.c3));

        //Using for loop to set a String into an empty array instead of null.
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board.length; y++){
                board[x][y] = new String("");
            }
        }

        textView = (TextView) (findViewById(R.id.game_message_text));

        mMainButton = (Button) (findViewById(R.id.mainMenuButton));

        //Getting intent from MainActivity.
        //Need to fix textView alternating name.
        Intent oldIntent = getIntent();
        playerOne = oldIntent.getStringExtra(PLAYER_ONE_TAG);
        playerTwo = oldIntent.getStringExtra(PLAYER_TWO_TAG);
        textView.setText(playerOne + "'s Turn");

        sharedPreferences = getSharedPreferences("UniqueCode", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();


        mMainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("winner", lastWinner);
                startActivity(intent);
            }
        });
    }

    //Place all buttons under one method by applying android:onClick="buttonOnClick".
    public void buttonOnClick(View v) {
        currentPlayer = true;
        textView.setText(Integer.toString(count));

        switch (v.getId()) {
            case R.id.a1:
                if (count % 2 == 0 && currentPlayer) {
                    mButtons[0].setText("O");
                    board[0][0] = "O";
                    textView.setText(playerTwo + "'s Turn");
                    //Allows user to click on the button once.
                    v.setClickable(false);
                    //Checks to see if there is a winner and increments the count.
                    winner();
                    break;

                } else {
                    mButtons[0].setText("X");
                    board[0][0] = "X";
                    textView.setText(playerOne + "'s Turn");
                    v.setClickable(false);
                    winner();
                    break;
                }

            case R.id.a2:
                if (count % 2 == 0 && currentPlayer) {
                    mButtons[1].setText("O");
                    board[0][1] = "O";
                    textView.setText(playerTwo + "'s Turn");
                    v.setClickable(false);
                    winner();
                    break;

                } else {
                    mButtons[1].setText("X");
                    board[0][1] = "X";
                    textView.setText(playerOne + "'s Turn");
                    v.setClickable(false);
                    winner();
                    break;
                }

            case R.id.a3:
                if (count % 2 == 0 && currentPlayer) {
                    mButtons[2].setText("O");
                    board[0][2] = "O";
                    textView.setText(playerTwo + "'s Turn");
                    v.setClickable(false);
                    winner();
                    count++;
                    break;

                } else {
                    mButtons[2].setText("X");
                    board[0][2] = "X";
                    textView.setText(playerOne + "'s Turn");
                    v.setClickable(false);
                    winner();
                    break;
                }

            case R.id.b1:
                if (count % 2 == 0 && currentPlayer) {
                    mButtons[3].setText("O");
                    board[1][0] = "O";
                    textView.setText(playerTwo + "'s Turn");
                    v.setClickable(false);
                    winner();
                    break;

                } else {
                    mButtons[3].setText("X");
                    board[1][0] = "X";
                    textView.setText(playerOne + "'s Turn");
                    v.setClickable(false);
                    winner();
                    break;
                }

            case R.id.b2:
                if (count % 2 == 0 && currentPlayer) {
                    mButtons[4].setText("O");
                    board[1][1] = "O";
                    textView.setText(playerTwo + "'s Turn");
                    v.setClickable(false);
                    winner();
                    break;

                } else {
                    mButtons[4].setText("X");
                    board[1][1] = "X";
                    textView.setText(playerOne + "'s Turn");
                    v.setClickable(false);
                    winner();
                    break;
                }

            case R.id.b3:
                if (count % 2 == 0 && currentPlayer) {
                    mButtons[5].setText("O");
                    board[1][2] = "O";
                    textView.setText(playerTwo + "'s Turn");
                    v.setClickable(false);
                    winner();
                    break;

                } else {
                    mButtons[5].setText("X");
                    board[1][2] = "X";
                    textView.setText(playerOne + "'s Turn");
                    v.setClickable(false);
                    winner();
                    break;
                }

            case R.id.c1:
                if (count % 2 == 0 && currentPlayer) {
                    mButtons[6].setText("O");
                    board[2][0] = "O";
                    textView.setText(playerTwo + "'s Turn");
                    v.setClickable(false);
                    winner();
                    break;

                } else {
                    mButtons[6].setText("X");
                    board[2][0] = "X";
                    textView.setText(playerOne + "'s Turn");
                    v.setClickable(false);
                    winner();
                    break;
                }

            case R.id.c2:
                if (count % 2 == 0 && currentPlayer) {
                    mButtons[7].setText("O");
                    board[2][1] = "O";
                    textView.setText(playerTwo + "'s Turn");
                    v.setClickable(false);
                    winner();
                    break;

                } else {
                    mButtons[7].setText("X");
                    board[2][1] = "X";
                    textView.setText(playerOne + "'s Turn");
                    v.setClickable(false);
                    winner();
                    break;
                }

            case R.id.c3:
                if (count % 2 == 0 && currentPlayer) {
                    mButtons[8].setText("O");
                    board[2][2] = "O";
                    textView.setText(playerTwo + "'s Turn");
                    v.setClickable(false);
                    winner();
                    break;

                } else {
                    mButtons[8].setText("X");
                    board[2][2] = "X";
                    textView.setText(playerOne + "'s Turn");
                    v.setClickable(false);
                    winner();
                    break;
                }
        }

         currentPlayer = !currentPlayer;
    }

    //The reason why the Shared Preferences was not working because the editor.commit was placed before the return statement.
    //The placement shown below solved the name transferring issue.
    public void winner() {
        count++;
        lastWinner = new String();
        //Checks diagonal
        if (board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]) && !board[0][0].equals("")) {

            if(board[0][0].equals("O")) {
                lastWinner = playerOne;
                textView.setText(playerOne + " beat the living mess out of you.");
            } else {
                lastWinner = playerTwo;
                textView.setText(playerTwo + " IS THA WINNA");
            }


            mButtons[0].setClickable(false);
            mButtons[1].setClickable(false);
            mButtons[2].setClickable(false);
            mButtons[3].setClickable(false);
            mButtons[4].setClickable(false);
            mButtons[5].setClickable(false);
            mButtons[6].setClickable(false);
            mButtons[7].setClickable(false);
            mButtons[8].setClickable(false);
            editor.putString("winner", lastWinner);
            editor.commit();

        } else if (board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0]) && !board[0][2].equals("")) {

            if(board[0][2].equals("O")) {
                lastWinner = playerOne;
                textView.setText(playerOne + " is quite awesome.");

            } else {
                lastWinner = playerTwo;
                textView.setText(playerTwo + " is the TOE champ!");
            }

            System.out.println("Am i the winner " + lastWinner);
            mButtons[0].setClickable(false);
            mButtons[1].setClickable(false);
            mButtons[2].setClickable(false);
            mButtons[3].setClickable(false);
            mButtons[4].setClickable(false);
            mButtons[5].setClickable(false);
            mButtons[6].setClickable(false);
            mButtons[7].setClickable(false);
            mButtons[8].setClickable(false);
            editor.putString("winner", lastWinner);
            editor.commit();

        }

        //Checks rows & columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2]) && !board[i][0].equals("")) {

                if(board[i][0].equals("O")) {
                    lastWinner = playerOne;
                    textView.setText(playerOne + " rules!");

                } else {
                    lastWinner = playerTwo;
                    textView.setText(playerTwo + " is VICTORIOUS!");
                }

                System.out.println("Am i the winner " + lastWinner);

                mButtons[0].setClickable(false);
                mButtons[1].setClickable(false);
                mButtons[2].setClickable(false);
                mButtons[3].setClickable(false);
                mButtons[4].setClickable(false);
                mButtons[5].setClickable(false);
                mButtons[6].setClickable(false);
                mButtons[7].setClickable(false);
                mButtons[8].setClickable(false);
                editor.putString("winner", lastWinner);
                editor.commit();
            }

            if (board[0][i].equals(board[1][i]) && board[0][i].equals(board[2][i]) && !board[0][i].equals("")) {

                if(board[0][i].equals("O")) {
                    lastWinner = playerOne;
                    textView.setText(playerOne + " has stomped " + playerTwo);

                } else {
                    lastWinner = playerTwo;
                    textView.setText(playerOne + " must bow to " + playerTwo);
                }

                System.out.println("Am i the winner " + lastWinner);
                mButtons[0].setClickable(false);
                mButtons[1].setClickable(false);
                mButtons[2].setClickable(false);
                mButtons[3].setClickable(false);
                mButtons[4].setClickable(false);
                mButtons[5].setClickable(false);
                mButtons[6].setClickable(false);
                mButtons[7].setClickable(false);
                mButtons[8].setClickable(false);
                editor.putString("winner", lastWinner);
                editor.commit();

            }
        }

    }

}