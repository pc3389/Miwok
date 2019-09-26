package com.example.atry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        String[] words = new String[10];
        words[0] = "one";
        words[1] = "two";
        words[2] = "three";
        words[3] = "four";
        words[4] = "five";
        words[5] = "six";
        words[6] = "seven";
        words[7] = "eight";
        words[8] = "nine";
        words[9] = "ten";

        Log.v("NumbersActivity","Word at index0: " + words[0]);
        Log.v("NumbersActivity","Word at index1: " + words[1]);
        Log.v("NumbersActivity","Word at index2: " + words[2]);
        Log.v("NumbersActivity","Word at index3: " + words[3]);
        Log.v("NumbersActivity","Word at index4: " + words[4]);
        Log.v("NumbersActivity","Word at index5: " + words[5]);
        Log.v("NumbersActivity","Word at index6: " + words[6]);
        Log.v("NumbersActivity","Word at index7: " + words[7]);
        Log.v("NumbersActivity","Word at index8: " + words[8]);
        Log.v("NumbersActivity","Word at index9: " + words[9]);

    }
}
