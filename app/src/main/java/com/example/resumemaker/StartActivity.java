package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {

    private TextView txtstart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        txtstart = (TextView) findViewById(R.id.txtstart);


        txtstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(StartActivity.this, PersonalInfoActivity.class);
                startActivity(intent);

            }
        });
    }


}