package com.example.finalyearproject;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;


public class QuizTable extends AppCompatActivity {

    private GridView quizGrid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_table);
//
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setTitle("Quiz Table");
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        quizGrid = findViewById(R.id.quiztable);
//
//        List<String> quizList = new ArrayList<>();
//
//        quizList.add("Arrays");
//        quizList.add("Quiz 2");
//        quizList.add("Quiz 3");
//        quizList.add("Quiz 4");
//        quizList.add("Quiz 5");
//        quizList.add("Quiz 5");
//        quizList.add("Quiz 6");
//        quizList.add("Quiz 7");
//        quizList.add("Quiz 8");
//        quizList.add("Quiz 9");
//        quizList.add("Quiz 10");
//        quizList.add("Quiz 11");
//        quizList.add("Quiz 12");
//
//        QuizGridAdapter adapter = new QuizGridAdapter(quizList);
//        quizGrid.setAdapter(adapter);

    }

    public void backButton(View view) {
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
        finish();
    }

    public void bigo(View view) {
        startActivity(new Intent(getApplicationContext(),BigOQuiz.class));
        finish();
    }

    public void array(View view) {
        startActivity(new Intent(getApplicationContext(),ArrayQuiz.class));
        finish();
    }

    public void linkedlist(View view) {
        startActivity(new Intent(getApplicationContext(),LinkedListQuiz.class));
        finish();
    }

    public void hashmap(View view) {
        startActivity(new Intent(getApplicationContext(),HashMapQuiz.class));
        finish();
    }

    public void stackq(View view) {
        startActivity(new Intent(getApplicationContext(),StacksQueueQuiz.class));
        finish();
    }

    public void string(View view) {
        startActivity(new Intent(getApplicationContext(),StringQuiz.class));
        finish();
    }

    public void binary(View view) {
        startActivity(new Intent(getApplicationContext(),BinaryTreeQuiz.class));
        finish();
    }

    public void recursion(View view) {
        startActivity(new Intent(getApplicationContext(),RecursionQuiz.class));
        finish();
    }

    public void inheritance(View view) {
        startActivity(new Intent(getApplicationContext(),InheritanceQuiz.class));
        finish();
    }

    public void sorting(View view) {
        startActivity(new Intent(getApplicationContext(),SortingQuiz.class));
        finish();
    }

//    public void revision(View view) {
//        startActivity(new Intent(getApplicationContext(),RevisionQuiz.class));
//        finish();
//    }
}