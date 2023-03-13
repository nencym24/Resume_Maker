package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Templet1Activity extends AppCompatActivity {

    TextView txtName, txtEmail, txtContact, txtAddress, txtSkill, txtSscSchool, txtSscMarks, txtHscSchool, txtHscMarks, txtHobby, txtExperiance, txtProject;
    SharedPreferences preferences;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_templet1);

        preferences = getSharedPreferences("Data", 0);

        txtName = findViewById(R.id.txtName);
        txtEmail = findViewById(R.id.txtEmail);
        txtContact = findViewById(R.id.txtContact);
        txtAddress = findViewById(R.id.txtAddress);
        txtSkill = findViewById(R.id.txtSkill);
        txtSscSchool = findViewById(R.id.txtSscSchool);
        txtSscMarks = findViewById(R.id.txtSscMarks);
        txtHscSchool = findViewById(R.id.txtHscSchool);
        txtHscMarks = findViewById(R.id.txtHscMarks);
        txtHobby = findViewById(R.id.txtHobby);
        txtExperiance = findViewById(R.id.txtExperiance);
        txtProject = findViewById(R.id.txtProject);


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

        txtName.setText("Name : " + name);
        txtEmail.setText("Email : " + email);
        txtContact.setText("Contact : " + contact);
        txtAddress.setText("Address : " + address);
        txtSkill.setText("" + skill);
        txtSscSchool.setText("SSC School : " + ssschool);
        txtSscMarks.setText("SSC Marks : " + ssmarks);
        txtHscSchool.setText("HSC School : " + hsschool);
        txtHscMarks.setText("HSC Marks : " + hsmarks);
        txtHobby.setText("" + hobby);
        txtExperiance.setText("" + experiance);
        txtProject.setText("" + project);


    }
}