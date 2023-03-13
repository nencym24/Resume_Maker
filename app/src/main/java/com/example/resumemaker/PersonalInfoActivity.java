package com.example.resumemaker;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class PersonalInfoActivity extends AppCompatActivity {


    EditText edtname, edtemail, edtnumber, edtaddress;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    private TextView txtnxt;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalinfo);

        preferences = getSharedPreferences("Data", 0);
        editor = preferences.edit();

        txtnxt = (TextView) findViewById(R.id.txtnxt);
        edtname = findViewById(R.id.edtname);
        edtemail = findViewById(R.id.edtemail);
        edtnumber = findViewById(R.id.edtnumber);
        edtaddress = findViewById(R.id.edtaddress);

        txtnxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = edtname.getText().toString();
                String email = edtemail.getText().toString();
                String number = edtnumber.getText().toString();
                String address = edtaddress.getText().toString();

                if (name.isEmpty()) {
                    edtname.setError("Enter name!");
                } else if (email.isEmpty()) {
                    edtemail.setError("Enter email!");
                } else if (number.isEmpty()) {
                    edtnumber.setError("Enter Contact number!");
                } else if (address.isEmpty()) {
                    edtaddress.setError("Enter Address!");
                } else {

                    editor.putString("name", name);
                    editor.putString("email", email);
                    editor.putString("number", number);
                    editor.putString("address", address);
                    editor.commit();

                    Intent intent = new Intent(PersonalInfoActivity.this, WorkExpActivity.class);
                    startActivity(intent);
                }

            }

        });
    }
}