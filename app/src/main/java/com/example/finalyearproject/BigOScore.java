package com.example.finalyearproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BigOScore extends AppCompatActivity {

    private TextView score;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big_oscore);

        score = findViewById( R.id.score );


        String score_string = getIntent().getStringExtra( "SCORE" );
        score.setText(score_string);


    }



    public void done(View view) {
        startActivity(new Intent(getApplicationContext(),QuizTable.class));
        finish();
    }

    public void notesmenu(View view) {

        startActivity(new Intent(getApplicationContext(),NotesTable.class));
        finish();
    }
}