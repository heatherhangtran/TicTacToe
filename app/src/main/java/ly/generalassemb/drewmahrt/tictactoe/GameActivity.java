package ly.generalassemb.drewmahrt.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class GameActivity extends AppCompatActivity {
    Button aOne, aTwo, aThree, bOne, bTwo, bThree, cOne, cTwo, cThree;
    Button[] mArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        aOne = (Button) (findViewById(R.id.a1));
        aTwo = (Button) (findViewById(R.id.a2));
        aThree = (Button) (findViewById(R.id.a3));
        bOne = (Button) (findViewById(R.id.b1));
        bTwo = (Button) (findViewById(R.id.b2));
        bThree = (Button) (findViewById(R.id.b3));
        cOne = (Button) (findViewById(R.id.c1));
        cTwo = (Button) (findViewById(R.id.c2));
        cThree = (Button) (findViewById(R.id.c3));

        mArray = new Button[] {aOne, aTwo, aThree, bOne, bTwo, bThree, cOne, cTwo, cThree};

    }
}
