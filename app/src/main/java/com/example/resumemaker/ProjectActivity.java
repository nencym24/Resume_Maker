package com.example.resumemaker;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProjectActivity extends AppCompatActivity {

    EditText edtproject;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    TextView txtnxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

        preferences = getSharedPreferences("Data", 0);
        editor = preferences.edit();

        edtproject = findViewById(R.id.edtproject);
        txtnxt = findViewById(R.id.txtnxt);

        txtnxt.setOnClickListener(view -> {

            String project = edtproject.getText().toString();

            if (project.isEmpty()) {
                edtproject.setError("Enter Your projects name!");
            } else {

                editor.putString("project", project);
                editor.commit();

                Intent intent = new Intent(ProjectActivity.this, TempletSelectionActivity.class);
                startActivity(intent);
            }
        });
    }
}