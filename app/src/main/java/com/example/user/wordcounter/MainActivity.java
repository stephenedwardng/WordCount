package com.example.user.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText sentenceEditText;
    Button buttonSentence;
    Sentence sentence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sentenceEditText = (EditText)findViewById(R.id.sentenceId);
        buttonSentence = (Button)findViewById(R.id.buttonId);
    }

    public void onButtonClicked(View button) {
        String phrase = sentenceEditText.getText().toString();
        sentence = new Sentence(phrase);

        Log.d("count", sentence.prettyCountWords());

        Intent intent = new Intent(this, ShowCountActivity.class);
        intent.putExtra("countWords", sentence.prettyCountWords());
        startActivity(intent);

    }
}
