package com.mezue.apps.alcchallenge1_0;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button aboutALC, myProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Opens ALC Activity
        aboutALC = findViewById(R.id.about_alc);
        aboutALC.setOnClickListener(v -> {
            startActivity(new Intent(this, AboutALCActivity.class));
        });
        myProfile = findViewById(R.id.my_profile);
        myProfile.setOnClickListener(v -> {
            startActivity(new Intent(this, MyProfileActivity.class));
        });
    }
}
