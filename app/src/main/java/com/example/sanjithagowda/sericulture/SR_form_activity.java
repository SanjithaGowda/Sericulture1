package com.example.sanjithagowda.sericulture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SR_form_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sr_form_activity);
    }

    public void openSRform(View view) {
        Intent intent = new Intent(this, SR_form_activity.class);
        startActivity(intent);
    }
}
