package com.example.sanjithagowda.sericulture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class A_choice_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_choice_activity);
    }
    public void rcrform(View view) {
        Intent intent = new Intent(this, A_form_activity.class);
        startActivity(intent);
    }

    public void rspform(View view) {
        Intent intent = new Intent(this, A_form_activity1.class);
        startActivity(intent);
    }
}
