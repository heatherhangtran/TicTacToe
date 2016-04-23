package ly.generalassemb.drewmahrt.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class GameActivity extends AppCompatActivity {
    //Saves space for buttons.
    Button aOne, aTwo, aThree, bOne, bTwo, bThree, cOne, cTwo, cThree;
    //Establish that the buttons will be an array.
    Button[] mArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //Declares Buttons
        aOne = (Button) (findViewById(R.id.a1));
        aTwo = (Button) (findViewById(R.id.a2));
        aThree = (Button) (findViewById(R.id.a3));
        bOne = (Button) (findViewById(R.id.b1));
        bTwo = (Button) (findViewById(R.id.b2));
        bThree = (Button) (findViewById(R.id.b3));
        cOne = (Button) (findViewById(R.id.c1));
        cTwo = (Button) (findViewById(R.id.c2));
        cThree = (Button) (findViewById(R.id.c3));

        //List the buttons in an array for easier use.
        mArray = new Button[] {aOne, aTwo, aThree, bOne, bTwo, bThree, cOne, cTwo, cThree};

    }
}
