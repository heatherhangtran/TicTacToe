package ly.generalassemb.drewmahrt.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    TextView aOne, aTwo, aThree, bOne, bTwo, bThree, cOne, cTwo, cThree;
    TextView[] mArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        aOne = (TextView) (findViewById(R.id.a1));
        aTwo = (TextView) (findViewById(R.id.a2));
        aThree = (TextView) (findViewById(R.id.a3));
        bOne = (TextView) (findViewById(R.id.b1));
        bTwo = (TextView) (findViewById(R.id.b2));
        bThree = (TextView) (findViewById(R.id.b3));
        cOne = (TextView) (findViewById(R.id.c1));
        cTwo = (TextView) (findViewById(R.id.c2));
        cThree = (TextView) (findViewById(R.id.c3));

        mArray = new TextView[] {aOne, aTwo, aThree, bOne, bTwo, bThree, cOne, cTwo, cThree};

    }
}
