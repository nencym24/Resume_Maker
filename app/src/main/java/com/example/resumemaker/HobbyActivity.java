package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class HobbyActivity extends AppCompatActivity {

    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    TextView txtnxt;

    CheckBox reading, writing, speaking, learning, dancing, games, swimming, cooking, eating, travelling, shopping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobby);

        preferences = getSharedPreferences("Data", 0);
        editor = preferences.edit();

        txtnxt = findViewById(R.id.txtnxt);
        reading = findViewById(R.id.reading);
        writing = findViewById(R.id.writing);
        speaking = findViewById(R.id.speaking);
        learning = findViewById(R.id.learning);
        dancing = findViewById(R.id.dancing);
        games = findViewById(R.id.games);
        swimming = findViewById(R.id.swimming);
        cooking = findViewById(R.id.cooking);
        eating = findViewById(R.id.eating);
        travelling = findViewById(R.id.travelling);
        shopping = findViewById(R.id.shopping);

        txtnxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String hobby = "";
                if (reading.isChecked()) {
                    hobby += "reading\n";
                }
                if (writing.isChecked()) {
                    hobby += "writing\n";
                }
                if (speaking.isChecked()) {
                    hobby += "speaking\n";
                }
                if (learning.isChecked()) {
                    hobby += "learning\n";
                }
                if (dancing.isChecked()) {
                    hobby += "dancing\n";
                }
                if (games.isChecked()) {
                    hobby += "games\n";
                }
                if (swimming.isChecked()) {
                    hobby += "swimming\n";
                }
                if (cooking.isChecked()) {
                    hobby += "cooking\n";
                }
                if (eating.isChecked()) {
                    hobby += "eating\n";
                }
                if (travelling.isChecked()) {
                    hobby += "travelling\n";
                }
                if (shopping.isChecked()) {
                    hobby += "shopping\n";
                } else {

                    editor.putString("hobby", hobby);
                    editor.commit();

                    Intent intent = new Intent(HobbyActivity.this, SkillsActivity.class);
                    startActivity(intent);
                }

            }
        });
    }
}