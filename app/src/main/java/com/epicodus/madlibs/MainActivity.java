package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private Button mMadLibButton;
    private EditText mAdj1;
    private EditText mAdj2;
    private EditText mPerson;
    private EditText mNouns;
    private EditText mNoun1;
    private EditText mNoun2;
    private EditText mVerb1;
    private EditText mVegetable;
    private EditText mColor;
    private EditText mAdj3;
    private EditText mNoun3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdj1 = (EditText) findViewById(R.id.adj1);
        mAdj2 = (EditText) findViewById(R.id.adj2);
        mPerson = (EditText) findViewById(R.id.person);
        mNouns = (EditText) findViewById(R.id.nouns);
        mNoun1 = (EditText) findViewById(R.id.noun1);
        mNoun2 = (EditText) findViewById(R.id.noun2);
        mVerb1 = (EditText) findViewById(R.id.verb1);
        mVegetable = (EditText) findViewById(R.id.vegetable);
        mColor = (EditText) findViewById(R.id.color);
        mAdj3 = (EditText) findViewById(R.id.adj3);
        mNoun3 = (EditText) findViewById(R.id.noun3);
        mMadLibButton = (Button) findViewById(R.id.madLibButton);

            mMadLibButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String adj1 = mAdj1.getText().toString();
                    String adj2 = mAdj2.getText().toString();
                    String person = mPerson.getText().toString();
                    String nouns = mNouns.getText().toString();
                    String noun1 = mNoun1.getText().toString();
                    String noun2 = mNoun2.getText().toString();
                    String verb1 = mVerb1.getText().toString();
                    String vegetable = mVegetable.getText().toString();
                    String color = mColor.getText().toString();
                    String adj3 = mAdj3.getText().toString();
                    String noun3 = mNoun3.getText().toString();

                    Intent intent = new Intent(MainActivity.this, MadLibActivity.class);
                    startActivity(intent);
                }
            });
    }
}
