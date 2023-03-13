package com.example.resumemaker;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WorkExpActivity extends AppCompatActivity {

    EditText exp;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    TextView txtnxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workexp);

        preferences = getSharedPreferences("Data",0);
        editor = preferences.edit();

        exp = findViewById(R.id.exp);
        txtnxt = findViewById(R.id.txtnxt);

        txtnxt.setOnClickListener(view -> {

            String experiance = exp.getText().toString();

            if (experiance.isEmpty()) {
                exp.setError("Enter your experiance!");
            } else {

                editor.putString("experiance",experiance);
                editor.commit();

                Intent intent = new Intent(WorkExpActivity.this, EducationActivity.class);
                startActivity(intent);
            }
        });
    }
}