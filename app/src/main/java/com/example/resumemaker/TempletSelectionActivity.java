package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TempletSelectionActivity extends AppCompatActivity {

    ImageView templet1, templet2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_templet_selection);

        templet1 = findViewById(R.id.templet1);
        templet2 = findViewById(R.id.templet2);

        templet1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TempletSelectionActivity.this, Templet1Activity.class);
                startActivity(intent);
            }
        });

        templet2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TempletSelectionActivity.this, Templet2Activity.class);
                startActivity(intent);
            }
        });
    }
}