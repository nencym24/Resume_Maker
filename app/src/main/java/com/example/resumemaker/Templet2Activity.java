package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Templet2Activity extends AppCompatActivity {

    TextView txtname, txtemail, txtcontact, txtaddress, txtskill, txtSSchool, txtSMarks, txtHSchool = findViewById(R.id.txtHSchool), txtHMarks, txthobby, txtexperiance, txtproject;

    SharedPreferences preferences;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_templet2);

        preferences = getSharedPreferences("Data", 0);

        txtname = findViewById(R.id.txtname);
        txtemail = findViewById(R.id.txtemail);
        txtcontact = findViewById(R.id.txtcontact);
        txtaddress = findViewById(R.id.txtaddress);
        txtskill = findViewById(R.id.txtskill);
        txtSSchool = findViewById(R.id.txtSSchool);
        txtSMarks = findViewById(R.id.txtSMarks);
        txtHMarks = findViewById(R.id.txtHMarks);
        txthobby = findViewById(R.id.txthobby);
        txtexperiance = findViewById(R.id.txtexperiance);
        txtproject = findViewById(R.id.txtproject);

        String name = preferences.getString("name", "");
        String email = preferences.getString("email", "");
        String contact = preferences.getString("Contact", "");
        String address = preferences.getString("address", "");
        String skill = preferences.getString("skill", "");
        String ssschool = preferences.getString("SSCSchool", "");
        String ssmarks = preferences.getString("SSCMarks", "");
        String hsschool = preferences.getString("HSCSchool", "");
        String hsmarks = preferences.getString("HSCMarks", "");
        String hobby = preferences.getString("hobby", "");
        String experiance = preferences.getString("experiance", "");
        String project = preferences.getString("project", "");

        txtname.setText("Name : " + name);
        txtemail.setText("Email : " + email);
        txtcontact.setText("Contact : " + contact);
        txtaddress.setText("Address : " + address);
        txtskill.setText("" + skill);
        txtSSchool.setText("SSC School : " + ssschool);
        txtSMarks.setText("SSC Marks : " + ssmarks);
        txtHSchool.setText("HSC School : " + hsschool);
        txtHMarks.setText("HSC Marks : " + hsmarks);
        txthobby.setText("" + hobby);
        txtexperiance.setText("" + experiance);
        txtproject.setText("" + project);

    }
}