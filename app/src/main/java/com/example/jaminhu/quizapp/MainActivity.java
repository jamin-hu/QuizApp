package com.example.jaminhu.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean daddy = false;
    boolean likeSeptember = false;
    boolean likeStayin = false;
    boolean likeHello = false;
    boolean likeCelebration = false;
    boolean likeCareless = false;
    boolean likeBaby = false;

    boolean septemberAnswer = false;
    boolean stayinAnswer = false;
    boolean helloAnswer = false;
    boolean celebrationAnswer = false;
    boolean carelessAnswer = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onDaddyClick(View view){
        boolean checked = ((RadioButton) view).isChecked();
        if (checked){
            daddy = true;
        }
    }

    public void onLikeSeptemberClicked(View view){
        CheckBox checkBox = (CheckBox)view;
        if(checkBox.isChecked()){
            likeSeptember = true;
        }
    }

    public void onLikeStayinClicked(View view){
        CheckBox checkBox = (CheckBox)view;
        if(checkBox.isChecked()){
            likeStayin = true;
        }
    }

    public void onLikeHelloClicked(View view){
        CheckBox checkBox = (CheckBox)view;
        if(checkBox.isChecked()){
            likeHello = true;
        }
    }

    public void onLikeCelebrationClicked(View view){
        CheckBox checkBox = (CheckBox)view;
        if(checkBox.isChecked()){
            likeCelebration = true;
        }
    }

    public void onLikeCarelessClicked(View view){
        CheckBox checkBox = (CheckBox)view;
        if(checkBox.isChecked()){
            likeCareless = true;
        }
    }

    public void onLikeBabyClicked(View view){
        CheckBox checkBox = (CheckBox)view;
        if(checkBox.isChecked()){
            likeBaby = true;
        }
    }

    public void onSeptemberRadioClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.september_answer_correct:
                if (checked)
                    septemberAnswer = true;
                break;
            default:
                if (checked)
                    septemberAnswer = false;
        }
    }

    public void onStaynRadioClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.stayin_answer_correct:
                if (checked)
                    stayinAnswer = true;
                break;
            default:
                if (checked)
                    stayinAnswer = false;
        }
    }

    public void onSubmitClicked(View view) {
        if (septemberAnswer && stayinAnswer && likeSeptember && likeStayin && likeHello && likeCelebration && likeCareless) {
            Toast.makeText(this, "you are groovy", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "nopenope", Toast.LENGTH_SHORT).show();
        }
    }
}
