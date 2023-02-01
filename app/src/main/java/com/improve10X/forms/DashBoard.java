package com.improve10X.forms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class DashBoard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        Button loginbtn = findViewById(R.id.login_btn);
        loginbtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,LoginActivity.class);
            startActivity(intent);
        });
        Button signupbtn = findViewById(R.id.signup_btn);
        signupbtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,SignupActivity.class);
            startActivity(intent);

        });
        Button mainbtn = findViewById(R.id.main_btn);
        mainbtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);

        });
        Button profilebtn = findViewById(R.id.profile_btn);
        profilebtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,Profile.class);
            startActivity(intent);

        });
    }
}