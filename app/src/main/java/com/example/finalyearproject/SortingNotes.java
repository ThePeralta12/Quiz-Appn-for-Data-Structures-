 package com.example.finalyearproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SortingNotes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorting_notes);
    }
    public void onBackPressed(){

        startActivity(new Intent(getApplicationContext(),NotesTable.class));
        finish();

    }
}