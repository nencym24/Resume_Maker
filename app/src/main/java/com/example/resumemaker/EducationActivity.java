package com.example.resumemaker;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EducationActivity extends AppCompatActivity {

    EditText sschool, smarks, hschool, hmarks;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    TextView txtnxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

        preferences = getSharedPreferences("Data", 0);
        editor = preferences.edit();

        sschool = findViewById(R.id.sschool);
        smarks = findViewById(R.id.smarks);
        hschool = findViewById(R.id.hschool);
        hmarks = findViewById(R.id.hmarks);
        txtnxt = findViewById(R.id.txtnxt);

        txtnxt.setOnClickListener(view -> {

            String ssschool = sschool.getText().toString();
            String ssmarks = smarks.getText().toString();
            String hsschool = hschool.getText().toString();
            String hsmarks = hmarks.getText().toString();

            if (ssschool.isEmpty()) {
                sschool.setError("Enter SSC school!");
            } else if (ssmarks.isEmpty()) {
                smarks.setError("Enter SSC marks!");
            } else if (hsschool.isEmpty()) {
                hschool.setError("Enter HSC School!");
            } else if (hsmarks.isEmpty()) {
                hmarks.setError("Enter HSC Marks!");
            } else {

                editor.putString("SSCSchool", ssschool);
                editor.putString("SSCMarks", ssmarks);
                editor.putString("HSCSchool", hsschool);
                editor.putString("HSCMarks", hsmarks);

                Intent intent = new Intent(EducationActivity.this, HobbyActivity.class);
                startActivity(intent);
            }
        });
    }
}