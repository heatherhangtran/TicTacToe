package ly.generalassemb.drewmahrt.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class GameActivity extends AppCompatActivity {
    //Saves space for buttons.
    Button[] mButtons = new Button[10];
    //The squares will be identified as integers.
    int[] box = new int[10];
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //Declares Buttons
        mButtons[1] = (Button) (findViewById(R.id.a1));
        mButtons[2] = (Button) (findViewById(R.id.a2));
        mButtons[3] = (Button) (findViewById(R.id.a3));
        mButtons[4] = (Button) (findViewById(R.id.b1));
        mButtons[5] = (Button) (findViewById(R.id.b2));
        mButtons[6] = (Button) (findViewById(R.id.b3));
        mButtons[7] = (Button) (findViewById(R.id.c1));
        mButtons[8] = (Button) (findViewById(R.id.c2));
        mButtons[9] = (Button) (findViewById(R.id.c3));

//        for (int i = 1; i <= 9; i++) {
//            mButtons[i].setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    if (i % 2 = 0) {
//                        mButtons[i].setText("O");
//                    } else {
//                        mButtons[i].setText("X");
//                    }
//                }
//            });
//        }
    }

    public void playerOne(int i) {
        mButtons[i].setText("X");
        mButtons[i].setEnabled(false);
        box[i] = 1;
        //winningPlayer(i);
    }

    public void playerTwo() {
        for (int i = 1 ; i <= 9; i++) {
            if (mButtons[i].isEnabled()) {
                mButtons[i].setText("O");
                mButtons[i].setEnabled(false);
                box[i] = 2;
                break;
            }
        }
    }

}
