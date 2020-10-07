package com.example.covid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class actvivity_second extends AppCompatActivity {

    TextView textView;
    String main = " ";
    ArrayList<String> listOfSymptoms = new ArrayList<>();
    String message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = findViewById(R.id.text_message);
        Intent intent = getIntent();
        message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        Boolean Name = intent.getBooleanExtra("name",false);
        listOfSymptoms = intent.getStringArrayListExtra("ListOfSymptoms");
        Boolean school = intent.getBooleanExtra("School1", true);
        System.out.println(Name.toString());
        //if to see if there is something in text box
        if (Name == true) {
            if (message == null)
                textView.setText("???? null");
            else {
                for (int i = 0; i < listOfSymptoms.size(); i++) {
                    main += listOfSymptoms.get(i) + ", ";
                }


            }
            if (school == true) {
                textView.setText(message + " you can attend school!");
            } else {
                textView.setText(message + " you sadly can not attend school because you have experienced the following: " + main);
            }
        }
        else{
            textView.setText("Please return to the previous page and enter you name");
            //Intent intent1 = new Intent(this, MainActivity.class);
            //startActivity(intent);
        }

       // textView.setTypeface(null,Typeface.ITALIC);
    }
    public void launchthird(View view){


        Intent intent= new Intent(this, third.class);
        intent.putExtra("name",message);
        intent.putExtra("ListOfSymptoms",listOfSymptoms);
        startActivity(intent);

    }
}