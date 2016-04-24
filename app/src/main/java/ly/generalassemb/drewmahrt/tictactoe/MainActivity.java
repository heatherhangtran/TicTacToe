package ly.generalassemb.drewmahrt.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText mPlayerOneEditText, mPlayerTwoEditText;
    Button mButton;
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPlayerOneEditText = (EditText) (findViewById(R.id.player_one_name));
        mPlayerTwoEditText = (EditText) (findViewById(R.id.player_two_name));
        mButton = (Button) (findViewById(R.id.start_game_button));
        mTextView = (TextView) (findViewById(R.id.last_winner_text));

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String playerOne, playerTwo;
                playerOne = mPlayerOneEditText.getText().toString();
                playerTwo = mPlayerTwoEditText.getText().toString();

                if (playerOne.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter Player One's name", Toast.LENGTH_LONG).show();

                } else if (playerTwo.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter Player Two's name", Toast.LENGTH_LONG).show();

                } else {
                    Intent intent = new Intent(MainActivity.this, GameActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
