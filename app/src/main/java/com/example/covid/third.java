package com.example.covid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.NestedScrollingChild;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class third extends AppCompatActivity {

    private static final String LOGTAG = "";
    public String names = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Queue<Object> q = new LinkedList<>();
        Intent intent = getIntent();
        int counter = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        TextView text = findViewById(R.id.admin);
        ArrayList transfer = new ArrayList();
        String main ="";
        String name= intent.getStringExtra("name");
      //  child1.setName(name);
        ArrayList<String> listOfSymptoms = intent.getStringArrayListExtra("ListOfSymptoms");
        q.add("");
        for (int j = 0; j< q.size(); ++j) {
            child child1 = new child();
            child1.setName(name);
            q.poll();
            for (int i = 0; i < listOfSymptoms.size(); i++) {
                child1.setSymptoms(listOfSymptoms.get(i));
                //System.out.println("hi");
            }
            q.add(child1);
            counter++;
            Log.d(LOGTAG,q.peek().toString() );
        }
        Log.d(LOGTAG,"resetting names" );

        text.setText(main);
        for (int i=0;i<q.size();i++){
            child children = (child) q.poll();
            names += children.getName();
            Log.d(LOGTAG,children.getName());
        }

        //get name

        text.setText(names);
        //System.out.println(child1.getName());

    }




}