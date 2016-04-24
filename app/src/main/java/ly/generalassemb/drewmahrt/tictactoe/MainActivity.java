package ly.generalassemb.drewmahrt.tictactoe;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText mPlayerOneEditText, mPlayerTwoEditText;
    private Button mButton;
    private TextView mTextView;

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

        //The following two methods hides the keyboard after each entry.
        //I AM NOT A FAN OF THE KEYBOARD. The keyboard shows only when needed.
        //The EditText xml has singleLine to allow only one line of text.
        //The following code changes the Enter button to hide the keyboard. *WOOT WOOT!*
        mPlayerOneEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    InputMethodManager hideKeyBoard = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    hideKeyBoard.hideSoftInputFromWindow(mPlayerOneEditText.getWindowToken(), 0);
                    return true;
                }
                return false;
            }
        });

        mPlayerTwoEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    InputMethodManager hideKeyBoard = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                    hideKeyBoard.hideSoftInputFromWindow(mPlayerTwoEditText.getWindowToken(), 0);
                    return true;
                }
                return false;
            }
        });
    }

}
