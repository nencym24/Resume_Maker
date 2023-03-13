package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SkillsActivity extends AppCompatActivity {


    EditText edtskill;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    TextView txtnxt;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);

        preferences = getSharedPreferences("Data", 0);
        editor = preferences.edit();

        edtskill = findViewById(R.id.edtskill);
        txtnxt = findViewById(R.id.txtnxt);

        txtnxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String skill = edtskill.getText().toString();

                if (skill.isEmpty()) {
                    edtskill.setError("Enter your skills!");
                } else {

                    editor.putString("skill", skill);
                    editor.commit();

                    Intent intent = new Intent(SkillsActivity.this, ProjectActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}