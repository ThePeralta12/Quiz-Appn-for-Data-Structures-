package com.example.finalyearproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NotesTable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_table);
    }

    public void bigO(View view) {

        startActivity(new Intent(getApplicationContext(),BigONotes.class));
        finish();
    }

    public void interview(View view) {
        startActivity(new Intent(getApplicationContext(),InterviewNotes.class));
        finish();
    }

    public void array(View view) {
        startActivity(new Intent(getApplicationContext(),ArrayNotes.class));
        finish();
    }

    public void linkedlist(View view) {
        startActivity(new Intent(getApplicationContext(),LinkedListNotes.class));
        finish();
    }

    public void hashtable(View view) {
        startActivity(new Intent(getApplicationContext(),HashTableNotes.class));
        finish();
    }

    public void stackqueue(View view) {
        startActivity(new Intent(getApplicationContext(),StacksQueueNotes.class));
        finish();
    }

    public void string(View view) {
        startActivity(new Intent(getApplicationContext(),BigONotes.class));
        finish();
    }

    public void tree(View view) {
        startActivity(new Intent(getApplicationContext(),BinaryTree.class));
        finish();
    }

    public void recursion(View view) {
        startActivity(new Intent(getApplicationContext(),RecursionNotes.class));
        finish();
    }

    public void inherit(View view) {
        startActivity(new Intent(getApplicationContext(),InheritenceNotes.class));
        finish();
    }

    public void twoDarraynotes(View view) {
        startActivity(new Intent(getApplicationContext(),MulitiDimensionalArray.class));
        finish();
    }
    public void onBackPressed(){

        startActivity(new Intent(getApplicationContext(),MainActivity.class));
        finish();

    }
}