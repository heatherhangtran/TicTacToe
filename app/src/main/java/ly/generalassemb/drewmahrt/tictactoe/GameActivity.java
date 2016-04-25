package ly.generalassemb.drewmahrt.tictactoe;

import android.content.Intent;
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
        String playerOne = oldIntent.getStringExtra("PlayerOne");
        String playerTwo = oldIntent.getStringExtra("PlayerTwo");
        textView.setText(playerOne + "'s Turn");
    }

    //Place all buttons under one method by applying android:onClick="buttonOnClick".
    public void buttonOnClick(View v) {
        count++;
        boolean playerOneClicked = true;

        switch (v.getId()) {
            case R.id.a1:
                if (count % 2 == 0 && playerOneClicked) {
                    mButtons[1].setText("O");
                    break;

                } else {
                    mButtons[1].setText("X");
                    break;
                }

            case R.id.a2:
                if (count % 2 == 0 && playerOneClicked) {
                    mButtons[2].setText("O");
                    break;

                } else {
                    mButtons[2].setText("X");
                    break;
                }

            case R.id.a3:
                if (count % 2 == 0 && playerOneClicked) {
                    mButtons[3].setText("O");
                    break;

                } else {
                    mButtons[3].setText("X");
                    break;
                }

            case R.id.b1:
                if (count % 2 == 0 && playerOneClicked) {
                    mButtons[4].setText("O");
                    break;

                } else {
                    mButtons[4].setText("X");
                    break;
                }

            case R.id.b2:
                if (count % 2 == 0 && playerOneClicked) {
                    mButtons[5].setText("O");
                    break;

                } else {
                    mButtons[5].setText("X");
                    break;
                }

            case R.id.b3:
                if (count % 2 == 0 && playerOneClicked) {
                    mButtons[6].setText("O");
                    break;

                } else {
                    mButtons[6].setText("X");
                    break;
                }

            case R.id.c1:
                if (count % 2 == 0 && playerOneClicked) {
                    mButtons[7].setText("O");
                    break;

                } else {
                    mButtons[7].setText("X");
                    break;
                }

            case R.id.c2:
                if (count % 2 == 0 && playerOneClicked) {
                    mButtons[8].setText("O");
                    break;

                } else {
                    mButtons[8].setText("X");
                    break;
                }

            case R.id.c3:
                if (count % 2 == 0 && playerOneClicked) {
                    mButtons[9].setText("O");
                    break;

                } else {
                    mButtons[9].setText("X");
                    break;
                }
        }
    }
}
