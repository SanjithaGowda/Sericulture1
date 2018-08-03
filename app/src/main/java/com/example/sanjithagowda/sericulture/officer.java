package com.example.sanjithagowda.sericulture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class officer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_officer);
    }

    public void openOform(View view) {
        Intent intent = new Intent(this, O_form_activity.class);
        startActivity(intent);
    }
}
