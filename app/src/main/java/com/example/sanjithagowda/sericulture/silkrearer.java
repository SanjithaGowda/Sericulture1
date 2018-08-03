package com.example.sanjithagowda.sericulture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class silkrearer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silkrearer);
    }

    public void openSRform(View view) {
        Intent intent = new Intent(this, SR_form_activity.class);
        startActivity(intent);
    }
}
