package com.epicodus.madlibs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


public class DolphinStory extends AppCompatActivity {
    private Button mStoryButton;
    private EditText mAdverb;
    private EditText mBodyPart;
    private EditText mFirstName;
    private EditText mNumber;
    private EditText mVerbing1;
    private EditText mNouns1;
    private EditText mNoun;
    private EditText mNouns2;
    private EditText mNouns3;
    private EditText mAdjective1;
    private EditText mNouns4;
    private EditText mVerbing2;
    private EditText mVerbing3;
    private EditText mAdjective2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dolphin_story);

        mStoryButton = (Button) findViewById(R.id.dolphinButton);
        mAdverb = (EditText) findViewById(R.id.adverb);
        mBodyPart = (EditText) findViewById(R.id.bodyPart);
        mFirstName = (EditText) findViewById(R.id.firstName);
        mNumber = (EditText) findViewById(R.id.number);
        mVerbing1 = (EditText) findViewById(R.id.verbing1);
        mNouns1 = (EditText) findViewById(R.id.nouns1);
        mNoun = (EditText) findViewById(R.id.noun);
        mNouns2 = (EditText) findViewById(R.id.nouns2);
        mNouns3 = (EditText) findViewById(R.id.nouns3);
        mAdjective1 = (EditText) findViewById(R.id.adjective1);
        mNouns4 = (EditText) findViewById(R.id.nouns4);
        mVerbing2 = (EditText) findViewById(R.id.verbing2);
        mVerbing3 = (EditText) findViewById(R.id.verbing3);
        mAdjective2 = (EditText) findViewById(R.id.adjective2);

    }
}
