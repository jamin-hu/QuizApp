package com.example.jaminhu.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // used to calculate point or no point for getting name right or not
    int nameCorrect = 0;

    // Stores info on whether checkboxes in "favourite songs" questions are checked or not
    boolean likeSeptember = false;
    boolean likeStayin = false;
    boolean likeHello = false;
    boolean likeCelebration = false;
    boolean likeCareless = false;
    boolean likeBaby = false;

    // used to calculate point or no point for "favourite songs" question
    int favouritesCorrect = 0;

    // used to calculate number of points earned from each question about each of the 5 songs
    int septemberAnswer = 0;
    int stayinAnswer = 0;
    int helloAnswer = 0;
    int celebrationAnswer = 0;
    int carelessAnswer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Checks if "September" was checked as a song that is liked
    public void onLikeSeptemberClicked(View view){
        CheckBox checkBox = (CheckBox)view;
        if(checkBox.isChecked()){
            likeSeptember = true;
        }
        else{
            likeSeptember = false;
        }
    }

    // Checks if "Staying Alive" was checked as a song that is liked
    public void onLikeStayinClicked(View view){
        CheckBox checkBox = (CheckBox)view;
        if(checkBox.isChecked()){
            likeStayin = true;
        }
        else{
            likeStayin = false;
        }
    }

    // Checks if "Hello" was checked as a song that is liked
    public void onLikeHelloClicked(View view){
        CheckBox checkBox = (CheckBox)view;
        if(checkBox.isChecked()){
            likeHello = true;
        }
        else{
            likeHello = false;
        }
    }

    // Checks if "Celebration" was checked as a song that is liked
    public void onLikeCelebrationClicked(View view){
        CheckBox checkBox = (CheckBox)view;
        if(checkBox.isChecked()){
            likeCelebration = true;
        }
        else{
            likeCelebration = false;
        }
    }

    // Checks if "Careless Whisper" was checked as a song that is liked
    public void onLikeCarelessClicked(View view){
        CheckBox checkBox = (CheckBox)view;
        if(checkBox.isChecked()){
            likeCareless = true;
        }
        else{
            likeCareless = false;
        }
    }

    // Checks if "Baby by Justin Bieber" was checked as a song that is liked
    public void onLikeBabyClicked(View view){
        CheckBox checkBox = (CheckBox)view;
        if(checkBox.isChecked()){
            likeBaby = true;
        }
    }

    //Marks as a point earned if question regarding the lyrics of "September" was answered correctly
    public void onSeptemberRadioClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.september_answer_correct:
                if (checked)
                    septemberAnswer = 1;
                break;
            default:
                if (checked)
                    septemberAnswer = 0;
        }
    }

    //Marks as a point earned if question regarding the lyrics of "Staying Alive" was answered correctly
    public void onStayinRadioClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.stayin_answer_correct:
                if (checked)
                    stayinAnswer = 1;
                break;
            default:
                if (checked)
                    stayinAnswer = 0;
        }
    }

    //Marks as a point earned if question regarding the lyrics of "Hello" was answered correctly
    public void onHelloRadioClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.hello_answer_correct:
                if (checked)
                    helloAnswer = 1;
                break;
            default:
                if (checked)
                    helloAnswer = 0;
        }
    }

    //Marks as a point earned if question regarding the lyrics of "Celebration" was answered correctly
    public void onCelebrationRadioClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.celebration_answer_correct:
                if (checked)
                    celebrationAnswer = 1;
                break;
            default:
                if (checked)
                    celebrationAnswer = 0;
        }
    }

    //Marks as a point earned if question regarding the lyrics of "Careless Whisper" was answered correctly
    public void onCarelessRadioClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.careless_answer_correct:
                if (checked)
                    carelessAnswer = 1;
                break;
            default:
                if (checked)
                    carelessAnswer = 0;
        }
    }

    public void onSubmitClicked(View view) {
        // Calculates whether the "What's my name" question was answered correctly
        EditText nameQuestion = (EditText) findViewById(R.id.name_Question);
        String nameAnswer = nameQuestion.getText().toString();
        if (nameAnswer.equals("Jamin Hu")) {
            nameCorrect = 1;
        }
        else {
            nameCorrect = 0;
        }

        // Calculates whether the "favourite songs" question was answered correctly
        if (likeSeptember && likeStayin && likeHello && likeCelebration && likeCareless && !likeBaby) {
            favouritesCorrect = 1;
        } else {
            favouritesCorrect = 0;
        }

        // Calculates and shows the total score from all questions
        int score = nameCorrect + favouritesCorrect + septemberAnswer + stayinAnswer + helloAnswer + celebrationAnswer + carelessAnswer;
        Toast.makeText(this, "You scored " + score + " out of 7", Toast.LENGTH_SHORT).show();
    }
}
