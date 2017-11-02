package ca.ualberta.cs.lonelytwitter;


// refactoring #1 removed unused imports - unneeded imports needlessly increase codes complexity to
// people who may be working on the code later
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import java.util.ArrayList;

public class EditTweetActivity extends Activity {

    private static final String FILENAME = "file.sav";
    private ArrayList<Tweet> tweetList = new ArrayList<Tweet>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
       //loadFromFile();
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");

        EditText editText = (EditText) findViewById(R.id.messageView);
        editText.setText(message);

    }


}