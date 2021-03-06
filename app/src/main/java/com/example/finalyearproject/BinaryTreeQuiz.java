package com.example.finalyearproject;

import androidx.appcompat.app.AppCompatActivity;


import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.TextView;



import java.util.ArrayList;
import java.util.List;

public class BinaryTreeQuiz extends AppCompatActivity implements View.OnClickListener{

    private TextView question, qCount;
    private Button option1, option2, option3, option4;
    private List<BigOQuestion> questionList;
    private int quesNum;
    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary_tree_quiz);

        question = findViewById(R.id.questionbar);
        qCount = findViewById(R.id.questionnum);

        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);

        getQuestionList();

        score = 0;

    }
    public void onBackPressed(){

        startActivity(new Intent(getApplicationContext(),QuizTable.class));
        finish();

    }
    private void getQuestionList(){
        questionList = new ArrayList<>();

        questionList.add(new BigOQuestion("Which of the following is the most widely used external memory data structure?", "AVL tree","B-tree", "Red-black tree","Both AVL tree and Red-black tree",2));
        questionList.add(new BigOQuestion("A B-tree of order 4 and of height 3 will have a maximum of _______ keys.", "255","63", "127","188",1));
        questionList.add(new BigOQuestion("Five node splitting operations occurred when an entry is inserted into a B-tree. Then how many nodes are written?", "14","7", "11","5",3));
        questionList.add(new BigOQuestion("What is the best case height of a B-tree of order n and which has k keys?", "logn (k+1) ??? 1"," nk", "logk (n+1) ??? 1","klogn",1));
        questionList.add(new BigOQuestion("Which of the following is true?", "larger the order of B-tree, less frequently the split occurs","larger the order of B-tree, more frequently the split occurs", "smaller the order of B-tree, more frequently the split occurs","smaller the order of B-tree, less frequently the split occurs",3));

        setQuestion();


    }

    private void setQuestion(){

        question.setText(questionList.get(0).getQuestion());
        option1.setText(questionList.get(0).getOptionA());
        option2.setText(questionList.get(0).getOptionB());
        option3.setText(questionList.get(0).getOptionC());
        option4.setText(questionList.get(0).getOptionD());

        qCount.setText(String.valueOf(1)+"/" + String.valueOf(questionList.size()));

        quesNum =  0;
    }

    @Override
    public void onClick(View view) {

        int selectedOption = 0;

        switch (view.getId()){
            case R.id.option1:
                selectedOption = 1;
                break;

            case R.id.option2:
                selectedOption = 2;
                break;

            case R.id.option3:
                selectedOption = 3;
                break;

            case R.id.option4:
                selectedOption = 4;
                break;

            default:
        }

        checkAnswer(selectedOption, view);

    }

    private void checkAnswer(int selectedOption, View view){
        if(selectedOption == questionList.get(quesNum).getCorrectAnswer()){
            //Right Answer
            score++;
        }
        else{
            //Wrong Answer

        }

        changedQuestion();
    }

    private void changedQuestion(){
        if(quesNum < questionList.size() - 1){

            quesNum++;

            playAnim(question, 0, 0);
            playAnim(option1, 0,1);
            playAnim(option2, 0,2);
            playAnim(option3, 0,3);
            playAnim(option4, 0,4);

            qCount.setText( String.valueOf( quesNum + 1) + "/" + String.valueOf( questionList.size() ) );

        }
        else{
            //Goes to score Activity
            Intent intent = new Intent(getApplicationContext(), BigOScore.class);

            intent.putExtra( "SCORE", String.valueOf( score ) + "/" + String.valueOf( questionList.size() ) );
            startActivity( intent );
            finish();
//          startActivity(new Intent(getApplicationContext(),BigOScore.class));
//          finish();




        }


    }


    private void playAnim(View view, final int value, int viewNum){

        view.animate().alpha( value ) .scaleX( value ).scaleY( value ).setDuration( 500 )
                .setStartDelay( 100 ).setInterpolator( new DecelerateInterpolator() )
                .setListener( new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {

                        if(value == 0){
                            switch(viewNum) {
                                case 0:
                                    ((TextView)view).setText( questionList.get( quesNum ).getQuestion() );
                                    break;
                                case 1:
                                    ((Button)view).setText( questionList.get( quesNum ).getOptionA() );
                                    break;
                                case 2:
                                    ((Button)view).setText( questionList.get( quesNum ).getOptionB() );
                                    break;
                                case 3:
                                    ((Button)view).setText( questionList.get( quesNum ).getOptionC() );
                                    break;
                                case 4:
                                    ((Button)view).setText( questionList.get( quesNum ).getOptionD() );
                                    break;
                            }


                            playAnim( view, 1,viewNum );
                        }
                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {

                    }
                } );
    }

}