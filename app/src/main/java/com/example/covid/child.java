package com.example.covid;

import android.app.Activity;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;
import java.util.ArrayList;

public class child implements Serializable {
    private String name;
    private Intent intent;
    public boolean isAllowed;
    ArrayList<String> listOfSymptoms = new ArrayList<String>();





    public String getName() {
        return name;
    }

    public String test(){
        return "TEST";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSymptoms(String symptom){
        listOfSymptoms.add(symptom);
    }

}
