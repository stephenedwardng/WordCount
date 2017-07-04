package com.example.user.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText sentenceEditText;
    TextView textView;
    Button buttonSentence;
    Sentence sentence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sentenceEditText = (EditText)findViewById(R.id.sentenceId);
        textView = (TextView)findViewById(R.id.textViewId);
        buttonSentence = (Button)findViewById(R.id.buttonId);
    }

    public void onButtonClicked(View button) {
        String phrase = sentenceEditText.getText().toString();
        sentence = new Sentence(phrase);

        Log.d("EightBall", sentence.prettyCountWords());

        textView.setText(sentence.prettyCountWords());
    }
}
